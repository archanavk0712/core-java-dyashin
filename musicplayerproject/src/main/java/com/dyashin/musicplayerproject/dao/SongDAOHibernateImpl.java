package com.dyashin.musicplayerproject.dao;

import java.sql.SQLException;
import java.util.List;

import com.dyashin.musicplayerproject.dto.SongDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SongDAOHibernateImpl implements SongDAO {

	/**
	 * Used to close all the resources
	 * 
	 * @return
	 * @throws SQLException
	 */
	private void close(EntityManager entityManager, EntityManagerFactory entityManagerFactory) throws SQLException {
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}

	@Override
	public boolean addSong(SongDTO songDTO) throws SQLException {
		System.out.println("Hibernate");
		boolean isSaved = false;

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			if (songDTO != null) {
				entityTransaction.begin();
				entityManager.persist(songDTO);
				entityTransaction.commit();
				isSaved = true;
			}
		} catch (Exception e) {
			entityTransaction.rollback();
		} finally {
			close(entityManager, entityManagerFactory);
		}
		return isSaved;
	}

	@Override
	public boolean updateSong(SongDTO songDTO) throws SQLException {
		System.out.println("Hibernate");
		boolean isUpdated = false;

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			if (songDTO != null) {
				entityTransaction.begin();

				SongDTO existingSong = entityManager.find(SongDTO.class, songDTO.getId());
				if (existingSong != null) {
					existingSong.setName(songDTO.getName());
	                existingSong.setYear(songDTO.getYear());
	                entityTransaction.commit();
					isUpdated = true;
				} else {
					System.err.println("No song found with ID: " + songDTO.getId());
					entityTransaction.rollback();
				}
			}
		} catch (Exception e) {
			entityTransaction.rollback();
		} finally {
			close(entityManager, entityManagerFactory);
		}
		return isUpdated;
	}

	@Override
	public boolean deleteSong(int id) throws SQLException {
		System.out.println("Hibernate");
		boolean isDeleted = false;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		SongDTO songDTO = entityManager.find(SongDTO.class, id);
		if (songDTO != null) {
			entityTransaction.begin();
			entityManager.remove(songDTO);
			isDeleted = true;
			entityTransaction.commit();
		}
		close(entityManager, entityManagerFactory);
		return isDeleted;
	}

	@Override
	public SongDTO getSongById(int id) throws SQLException {
		System.out.println("Hibernate");
		SongDTO songDTO = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		songDTO = entityManager.find(SongDTO.class, id);
		entityManager.close();
		entityManagerFactory.close();
		return songDTO;

	}

	@Override
	public List<SongDTO> getAllSongs() throws SQLException {
		System.out.println("Hibernate");
		List<SongDTO> song = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		song = entityManager.createQuery("select s from SongDTO s", SongDTO.class).getResultList();
		close(entityManager, entityManagerFactory);
		return song;
	}

}
