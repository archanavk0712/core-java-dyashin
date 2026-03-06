package com.dyashin.collegejpawithhibernate.daoImpl;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

import com.dyashin.collegejpawithhibernate.dao.CollegeDAO;
import com.dyashin.collegejpawithhibernate.dao.DBQueries;
import com.dyashin.collegejpawithhibernate.dto.CollegeDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class CollegeDAOJpaWithHibernateImpl implements CollegeDAO, DBQueries {
	private static EntityManagerFactory entityManagerFactory;
	private static Properties props;

	public CollegeDAOJpaWithHibernateImpl() {
		 try {
		        props = new Properties();
		        props.load(CollegeDAOJpaWithHibernateImpl.class.getClassLoader().getResourceAsStream("config.properties"));
		        
		        entityManagerFactory =
		            Persistence.createEntityManagerFactory("myPersistenceUnit",props);
		    } catch (Exception e) {
		        throw new RuntimeException("Failed to load DB config!", e);
		    }
		}

	// jpql
	@Override
	public List<CollegeDTO> getAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<CollegeDTO> college = entityManager.createQuery(jpql, CollegeDTO.class).getResultList();
		entityManager.close();
		return college;
	}

	// find()
	@Override
	public Optional<CollegeDTO> getById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		CollegeDTO collegeDTO = entityManager.find(CollegeDTO.class, id);
		entityManager.close();
		return Optional.ofNullable(collegeDTO);
	}

	@Override
	public boolean save(CollegeDTO collegeDTO) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		boolean isSaved = false;
		if (collegeDTO != null) {
			entityTransaction.begin();
			entityManager.merge(collegeDTO);
			isSaved = true;
			entityTransaction.commit();
		}
		entityManager.close();
		return isSaved;
	}

	// detach,re attach
	@Override
	public boolean modify(CollegeDTO newCollegeDTO, int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		boolean isUpdated = false;
		CollegeDTO oldCollegeDTO = entityManager.find(CollegeDTO.class, id);
		if (oldCollegeDTO != null) {
			entityManager.detach(oldCollegeDTO);
			newCollegeDTO.setId(id);  
	        entityTransaction.begin();
	        CollegeDTO mergedEntity = entityManager.merge(newCollegeDTO);
	        entityTransaction.commit();
	        isUpdated = true;
		}
		entityManager.close();
		return isUpdated;
	}

	// getReference()
	@Override
	public boolean deleteById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		boolean isDeleted = false;

		try {
			CollegeDTO collegeDTO = entityManager.getReference(CollegeDTO.class, id);

			entityTransaction.begin();
			entityManager.remove(collegeDTO);
			entityTransaction.commit();
			isDeleted = true;
		} catch (EntityNotFoundException e) {
			isDeleted = false;
		} finally {
			entityManager.close();
		}

		return isDeleted;
	}

	@Override
	public boolean saveOrUpdate(CollegeDTO collegeDTO, int id) {
		Optional<CollegeDTO> existing = getById(id);

		if (existing.isPresent()) {
			return modify(collegeDTO, id);
		} else {
			return save(collegeDTO);
		}
	}

	@Override
	public long countOfClg() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<Long> info = entityManager.createQuery(count, Long.class);
		long count = info.getSingleResult();
		entityManager.close();
		return count;
	}

	@Override
	public double minFee() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<Double> info = entityManager.createQuery(min, Double.class);
		double minFee = info.getSingleResult();
		entityManager.close();
		return minFee;
	}

	@Override
	public double maxFee() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<Double> info = entityManager.createQuery(max, Double.class);
		double maxFee = info.getSingleResult();
		entityManager.close();
		return maxFee;
	}

	@Override
	public double avgFee() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<Double> info = entityManager.createQuery(avg, Double.class);
		double avgFee = info.getSingleResult();
		entityManager.close();
		return avgFee;
	}

	// namedQuery
	public List<CollegeDTO> getByName(String name) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<CollegeDTO> info = entityManager.createQuery(namedQuery, CollegeDTO.class);
		info.setParameter("nam", name);
		List<CollegeDTO> list = info.getResultList();
		entityManager.close();
		return list;
	}

	// nativeSQL
	public List<CollegeDTO> getByLocation(String location) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query info = entityManager.createNativeQuery(nativeSQL, CollegeDTO.class);
		info.setParameter("loc", location);
		List<CollegeDTO> list = info.getResultList();
		entityManager.close();
		return list;
	}

	// namedQueryAnnotation
	public List<CollegeDTO> getByUniversity(String university) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<CollegeDTO> info = entityManager.createNamedQuery("CollegeDTO.findByUniversity", CollegeDTO.class);
		info.setParameter("uni", university);
		List<CollegeDTO> list = info.getResultList();
		entityManager.close();
		return list;
	}
}
