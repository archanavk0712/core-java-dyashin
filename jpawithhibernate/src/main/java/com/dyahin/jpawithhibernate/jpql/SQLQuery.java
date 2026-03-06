package com.dyahin.jpawithhibernate.jpql;

import java.util.List;

import com.dyashin.jpawithhibernate.dto.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;


public class SQLQuery {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");		
		EntityManager manager= factory.createEntityManager();
		String sql="select * from department";	
		Query info = manager.createNativeQuery(sql, Department.class);
		
		List<Department> list=info.getResultList();
		
		for(Department dept: list) {
		System.out.println("Department Name: "+dept.getdName());
		System.out.println("Department No.: "+dept.getDeptNo());
		System.out.println("Department Location: "+dept.getLoc());
		System.out.println("------------------------------------");
		}
		manager.close();
		factory.close();
	}
}

