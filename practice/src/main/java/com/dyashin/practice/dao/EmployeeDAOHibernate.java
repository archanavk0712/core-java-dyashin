package com.dyashin.practice.dao;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import com.dyashin.practice.dto.EmployeeDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDAOHibernate implements EmployeeDAO {
	private static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("myPersistenceUnit");
	

	public boolean updateEmp(EmployeeDTO employeeDTO) throws SQLException {
		EntityTransaction entityTransaction = null;

		boolean isUpdated = false;

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		if (employeeDTO != null) {
			entityTransaction.begin();
			entityManager.merge(employeeDTO);
			isUpdated = true;
			entityTransaction.commit();
		}
		entityManager.close();
		return isUpdated;

	}

	public boolean saveEmp(EmployeeDTO employeeDTO) throws SQLException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = null;

		boolean isSaved = false;

		entityTransaction = entityManager.getTransaction();
		if (employeeDTO != null) {
			entityTransaction.begin();
			entityManager.merge(employeeDTO);
			isSaved = true;
			entityTransaction.commit();
		}
		entityManager.close();
		return isSaved;
	}

	public boolean saveOrUpdateEmp(EmployeeDTO employeeDTO, boolean isUpdate) throws SQLException {
		if (isUpdate == true) {
			return updateEmp(employeeDTO);
		} else {
			return saveEmp(employeeDTO);
		}
	}

	public boolean deleteEmp(int id) throws SQLException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = null;
		boolean isDeleted = false;
		entityTransaction = entityManager.getTransaction();
		EmployeeDTO employeeDTO = entityManager.find(EmployeeDTO.class, id);
		if (employeeDTO != null) {
			entityTransaction.begin();
			entityManager.remove(employeeDTO);
			isDeleted = true;
			entityTransaction.commit();
		}
		entityManager.close();
		return isDeleted;
	}

	public EmployeeDTO getEmpById(int id) throws SQLException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EmployeeDTO employeeDTO = null;
		employeeDTO = entityManager.find(EmployeeDTO.class, id);
		entityManager.close();
		return employeeDTO;
	}

	public List<EmployeeDTO> getAllEmp() throws SQLException {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<EmployeeDTO> employee = null;
		entityManager = entityManagerFactory.createEntityManager();
		employee = entityManager.createQuery("select e from EmployeeDTO e", EmployeeDTO.class).getResultList();
		entityManager.close();
		return employee;
	}

}
