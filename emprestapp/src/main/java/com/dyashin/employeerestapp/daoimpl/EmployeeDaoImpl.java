package com.dyashin.employeerestapp.daoimpl;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.dyashin.employeerestapp.dao.EmployeeDao;
import com.dyashin.employeerestapp.dto.EmployeeDto;
import com.dyashin.employeerestapp.request.EmployeeReqDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	static EntityManagerFactory factory = null;
	static {
		try {
			Properties props = new Properties();

			InputStream is = EmployeeDaoImpl.class.getClassLoader().getResourceAsStream("db.properties");

			if (is == null) {
				throw new RuntimeException("database.properties NOT FOUND");
			}

			props.load(is);
			logger.info("Loaded Database: ", props);

			factory = Persistence.createEntityManagerFactory("myPersistenceUnit", props);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean insertData(EmployeeDto dto) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		boolean insert = false;

		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
			insert = true;

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return insert;
	}

	@Override
	public boolean delete(int id) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		boolean delete = false;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			EmployeeDto employeeDto = manager.getReference(EmployeeDto.class, id); // Get a proxy reference
			manager.remove(employeeDto);

			transaction.commit();
			delete = true;

		} catch (Exception e) {
			transaction.rollback();
		} finally {
			manager.close();
		}
		return delete;
	}

	@Override
	public boolean update(int id, EmployeeReqDto dataDto) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		boolean update = false;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeeDto employeeDto = manager.find(EmployeeDto.class, id);

			if (employeeDto == null) {
				return false;
			}

			employeeDto.setFname(dataDto.getFname());
			employeeDto.setLastName(dataDto.getLastName());
			employeeDto.setEmail(dataDto.getEmail());
			employeeDto.setAge(dataDto.getAge());
			employeeDto.setPhoneNumber(dataDto.getPhoneNumber());
			employeeDto.setDob(dataDto.getDob());
			employeeDto.setGender(dataDto.getGender());
			employeeDto.setJoiningDate(dataDto.getJoiningDate());
			employeeDto.setDeptNumber(dataDto.getDeptNumber());
			employeeDto.setDesignation(dataDto.getDesignation());
			employeeDto.setExperience(dataDto.getExperience());
			employeeDto.setSalary(dataDto.getSalary());

			transaction.commit();
			update = true;

		} catch (Exception e) {
			transaction.rollback();

		} finally {
			manager.close();
		}
		return update;
	}

	@Override
	public List<EmployeeDto> allData() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select d from EmployeeDto d";
		TypedQuery<EmployeeDto> info = manager.createQuery(jpql, EmployeeDto.class);

		List<EmployeeDto> list = info.getResultList();
		manager.close();

		return list;
	}

	@Override
	public Optional<EmployeeDto> getDataById(int id) {
		EntityManager manager = factory.createEntityManager();
		EmployeeDto dto = manager.find(EmployeeDto.class, id);
		manager.close();
		return Optional.ofNullable(dto);
	}

	
}