package com.dyahin.jpawithhibernate.onetoonepractice;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("myPersistenceUnit");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			
			Aadhaar aadhaar=new Aadhaar();
			aadhaar.setAadhaarId(1);
			aadhaar.setAadhaarLocation("Bangalore");
			
			Citizen citizen=new Citizen();
			citizen.setCitizenId(2);
			citizen.setCitizenOccupation("Manager");
			citizen.setCitizenPAN("12KNRKFT5646");
			
			citizen.setAadhaar(aadhaar);
			aadhaar.setCitizen(citizen);
			
			entityTransaction.begin();
			entityManager.persist(citizen);
			
			entityTransaction.commit();
		} catch (Exception e) {
			entityTransaction.rollback();
		}	finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}
}
