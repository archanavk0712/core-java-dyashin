package com.dyahin.jpawithhibernate;

import com.dyashin.jpawithhibernate.dto.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {
		Department dept=new Department();	//creating object of entity class
		//dept.setDeptNo(7);
		dept.setdName("AAAA");
		dept.setLoc("BBBBB");
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("myPersistenceUnit");	 //establishing connection
			manager = factory.createEntityManager();	//communicate with database
			transaction = manager.getTransaction();
			transaction.begin();
		
			manager.persist(dept);	//helps to insert data
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		//closing all the resources
		manager.close();
		factory.close();
	}

}
