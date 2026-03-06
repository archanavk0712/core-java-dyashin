package com.dyashin.employeerestapp.daoimpl;


import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.dyashin.employeerestapp.dao.RegisterDao;
import com.dyashin.employeerestapp.dto.RegistrationDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

@Repository
public class RegisterDaoImpl implements RegisterDao{
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	static EntityManagerFactory factory = null;
	static {
		try {
			Properties props = new Properties();

			InputStream is = EmployeeDaoImpl.class.getClassLoader().getResourceAsStream("db.properties");

			if (is == null) {
				throw new RuntimeException("database.properties NOT FOUND");
			}

			props.load(is);
			log.info("Loaded Database: ", props);

			factory = Persistence.createEntityManagerFactory("myPersistenceUnit", props);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public RegistrationDto loginUser(String email, String pass) {
		log.info("DAO Called");
		EntityManager em = factory.createEntityManager();
		try {
			TypedQuery<RegistrationDto> query = em.createQuery("SELECT u FROM RegistrationDto u WHERE u.email = :email AND u.pass = :pass", RegistrationDto.class);
			query.setParameter("email", email);
			query.setParameter("pass", pass);

			return query.getResultStream().findFirst().orElse(null);
		} finally {
			em.close();
		}
	}

	@Override
	public boolean registerUser(RegistrationDto user) {
		log.info("DAO Called");
		EntityManager em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}
	}


}
