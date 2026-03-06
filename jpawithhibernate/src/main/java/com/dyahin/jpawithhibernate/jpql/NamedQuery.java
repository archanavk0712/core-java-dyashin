package com.dyahin.jpawithhibernate.jpql;

import java.util.List;

import com.dyashin.jpawithhibernate.dto.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class NamedQuery {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");		
		EntityManager manager= factory.createEntityManager();
		String jpql="select s from Department s where s.loc=:loca and s.dName=:nam";	//jpql
		
		TypedQuery<Department> info = manager.createQuery(jpql, Department.class);
		info.setParameter("loca", "Bangalore");
		info.setParameter("nam", "Tech");
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
