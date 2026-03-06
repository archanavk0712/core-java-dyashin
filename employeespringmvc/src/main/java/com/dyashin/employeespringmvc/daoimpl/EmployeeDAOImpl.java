package com.dyashin.employeespringmvc.daoimpl;

import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.dyashin.employeespringmvc.dao.EmployeeDAO;
import com.dyashin.employeespringmvc.dto.EmployeeDTO;
import com.dyashin.employeespringmvc.validation.EmployeeValidations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static final Logger logger = LogManager.getLogger(EmployeeDAOImpl.class);
	private static EntityManagerFactory factory;
	private static Properties props;
	
	static {
        try {
            props = new Properties();
            props.load(EmployeeDAOImpl.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties"));
            factory = Persistence.createEntityManagerFactory("myPersistenceUnit", props);
            logger.info("EntityManagerFactory initialized successfully");
        } catch (Exception e) {
        	logger.error("Failed to initialize EntityManagerFactory", e);
            throw new RuntimeException("Invalid DB config!", e);
        }
    }

	@Override
	public boolean addEmployee(EmployeeDTO employee) {
		EmployeeValidations.validateEmployee(employee);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(employee);
			transaction.commit();
			logger.debug("Employee added successfully: id={}", employee.getId());
			return true;
		}catch (Exception e) {
			logger.error("Failed to add employee: id={}", employee.getId(), e);
			transaction.rollback();
			return false;
		}finally {
			manager.close();
		}
	}
	

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			logger.debug("Employee deleted successfully: id={}", id);
			EmployeeDTO employee = manager.find(EmployeeDTO.class, id);
			if(employee != null) {
				manager.remove(employee);
				logger.debug("Employee deleted successfully: id={}", id);
			}else {
                logger.warn("Employee not found for deletion: id={}", id);
            }
			transaction.commit();
			return true;
		}catch (Exception e) {
			 logger.error("Failed to delete employee: id={}", id, e);
			transaction.rollback();
			return false;
		}finally {
			manager.close();
		}
	}

	@Override
	public List<EmployeeDTO> findAll() {
		logger.debug("Fetching all employees");
		EntityManager manager = factory.createEntityManager();
		try {
            String query = "SELECT e FROM EmployeeDTO e";
            List<EmployeeDTO> employees = manager.createQuery(query, EmployeeDTO.class).getResultList();
            logger.debug("Found {} employees", employees.size());
            return employees;
        } catch (Exception e) {
            logger.error("Failed to fetch all employees", e);
            return null;
        } finally {
            manager.close();
        }

	}

	@Override
	public boolean updateEmployee(EmployeeDTO employee) {
		EmployeeValidations.validateEmployee(employee);
		logger.debug("Updating employee: id={}", employee.getId());
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			EmployeeDTO current = manager.find(EmployeeDTO.class, employee.getId());
			if(current == null) {
				logger.warn("Employee not found for update: id={}", employee.getId());
				transaction.rollback();
				return false;
			}
			current.setFirstName(employee.getFirstName());
			current.setMiddleName(employee.getMiddleName());
			current.setLastName(employee.getLastName());
			current.setEmail(employee.getEmail());
	        current.setPhoneNo(employee.getPhoneNo());
	        current.setAge(employee.getAge());
	        current.setGender(employee.getGender());
	        current.setSalary(employee.getSalary());
	        current.setDob(employee.getDob());
	        current.setJoiningDate(employee.getJoiningDate());
	        current.setDepartmentNo(employee.getDepartmentNo());
	        current.setExperience(employee.getExperience());
	        current.setDesignation(employee.getDesignation());
			transaction.commit();
			logger.debug("Employee updated successfully: id={}", employee.getId());
			return true;
			
		}catch (Exception e) {
			logger.error("Failed to update employee: id={}", employee.getId(), e);
			transaction.rollback();
			return false;
		}finally {
			manager.close();
		}
	}

	@Override
	public EmployeeDTO findById(int id) {
		logger.debug("Finding employee by id: {}", id);
		EntityManager manager = factory.createEntityManager();
		 try {
	         EmployeeDTO employee = manager.find(EmployeeDTO.class, id);
	         logger.debug("Employee found: id={}", id);
	         return employee;
        } catch (Exception e) {
            logger.error("Failed to find employee: id={}", id, e);
            return null;
        } finally {
            manager.close();
        }
	}
	
	

}
