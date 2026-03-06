package com.dyahin.jpawithhibernate;

import com.dyashin.jpawithhibernate.dto.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateRecord {
	public static void main(String[] args) {

		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("myPersistenceUnit");	 //establishing connection
			manager = factory.createEntityManager();	//communicate with database
			transaction = manager.getTransaction();
			Department deptRecord = manager.find(Department.class,2);	//find()- helps to take record from the table,1 is the primary key
			
			Department dept=new Department();
			transaction.begin();
			
			deptRecord.setdName("Software");
			
			//manager.persist(dept);	//helps to insert data
			System.out.println("Record Saved");
			manager.merge(null);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		//closing all the resources
		manager.close();
		factory.close();
	}

}
