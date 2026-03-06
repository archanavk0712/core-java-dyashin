package com.dyahin.jpawithhibernate;

import com.dyashin.jpawithhibernate.dto.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GetReference {

public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");		
		EntityManager manager= factory.createEntityManager();
		
//		Department department=manager.find(Department.class, 2);	//find()- helps to take record from the table, 1 is the primary key
		
		Department department=manager.getReference(Department.class, 2);
		
//		System.out.println(department);
		System.out.println("Department Name: "+department.getdName());
		System.out.println("Department No.: "+department.getDeptNo());
		System.out.println("Department Location: "+department.getLoc());
		
		manager.close();
		factory.close();
	}
}
