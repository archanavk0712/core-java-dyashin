package com.dyashin.librarymanagementsystemhibernate.dao;

import java.util.List;

import com.dyashin.librarymanagementsystemhibernate.dto.LibraryDTO;
import com.dyashin.librarymanagementsystemhibernate.exception.LibraryException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class LibraryDAOImpl implements LibraryDAO {

	@Override
	public boolean save(LibraryDTO libraryDTO) {
		boolean isSaved = false;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			if (libraryDTO != null) {
				transaction.begin();
				manager.persist(libraryDTO);
				transaction.commit();
				isSaved = true;
			}
		} catch (Exception e) {
			if(transaction.isActive()) {
				transaction.rollback();
			}
			throw new LibraryException("Unable to save the data");
		} finally {
			manager.close();
			factory.close();
		}
		return isSaved;
	}

	@Override
	public List<LibraryDTO> getAll() {
		List<LibraryDTO> list=null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		list =manager.createQuery("SELECT l FROM LibraryDTO l",LibraryDTO.class).getResultList();
		manager.close();
		factory.close();
		return list;
	}

	@Override
	public boolean update(LibraryDTO libraryDTO) {
		boolean isUpdated = false;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			LibraryDTO existingData = manager.find(LibraryDTO.class, libraryDTO.getId());
			if (existingData != null) {
				transaction.begin();
				existingData.setBookName(libraryDTO.getBookName());
				transaction.commit();
				isUpdated = true;
			}
		} catch (Exception e) {
			transaction.rollback();
			throw new LibraryException("Unable to update the data");
		} finally {
			manager.close();
			factory.close();
		}
		return isUpdated;
	}

	@Override
	public boolean delete(int id) {
		boolean isDeleted = false;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			LibraryDTO data = manager.find(LibraryDTO.class, id);
			if (data != null) {
				transaction.begin();
				manager.remove(data);
				transaction.commit();
				isDeleted = true;
			}
		} catch (Exception e) {
			transaction.rollback();
			throw new LibraryException("Unable to delete the data");
		} finally {
			manager.close();
			factory.close();
		}
		return isDeleted;
	}
		
	@Override
	public LibraryDTO getById(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		LibraryDTO data = manager.find(LibraryDTO.class, id);
		manager.close();
		factory.close();
		return data;
	}

}
