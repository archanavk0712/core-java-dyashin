package com.dyahin.jpawithhibernate.jpql;

import java.util.List;

import com.dyashin.jpawithhibernate.dto.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class GetAll {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");		
		EntityManager manager= factory.createEntityManager();
		String jpql="select s from Department s where s.loc='Bangalore'";	//jpql
		TypedQuery<Department> info = manager.createQuery(jpql, Department.class);

//		String jpql="select s from Department s where s.deptNo=3";	//jpql
//		TypedQuery<Department> info = manager.createQuery(jpql, Department.class);
//		Department dept=info.getSingleResult();
//		System.out.println("Department Name: "+dept.getdName());
//		System.out.println("Department No.: "+dept.getDeptNo());
//		System.out.println("Department Location: "+dept.getLoc());
		
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
