package com.dyahin.jpawithhibernate;

import com.dyashin.jpawithhibernate.dto.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteRecord {

	public static void main(String[] args) {

		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("myPersistenceUnit");	 //establishing connection
			manager = factory.createEntityManager();	//communicate with database
			transaction = manager.getTransaction();
			Department deptRecord = manager.find(Department.class,1);	//find()- helps to take record from the table,1 is the primary key
			transaction.begin();
			manager.remove(deptRecord);		//deletes the record
			System.out.println("Record deleted successfully");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		//closing all the resources
		manager.close();
		factory.close();
	}

}
