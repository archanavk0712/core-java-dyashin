package com.dyahin.jpawithhibernate;

import com.dyashin.jpawithhibernate.dto.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ReadRecord {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");		
		EntityManager manager= factory.createEntityManager();
		
		Department department=manager.find(Department.class, 1);	//find()- helps to take record from the table, 1 is the primary key
		
		System.out.println("Department Name: "+department.getdName());
		System.out.println("Department No.: "+department.getDeptNo());
		System.out.println("Department Location: "+department.getLoc());
		
		manager.close();
		factory.close();
	}
}
