package com.dyahin.jpawithhibernate.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {

		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		
		VoterCard vc=new VoterCard();	
		vc.setVId(101);
		vc.setVName("Archana");
		
		UserInfo user= new UserInfo();
		user.setUId(1);
		user.setUName("Archana");
		user.setVoter(vc);
		
		try {
			factory = Persistence.createEntityManagerFactory("myPersistenceUnit");	
			manager = factory.createEntityManager();	
			transaction = manager.getTransaction();
			transaction.begin();
			//manager.persist(user);
			VoterCard v =manager.find(VoterCard.class, 101);
			System.out.println("User id: "+v.getUser().getUId());
			System.out.println("Executed successfully");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		//closing all the resources
		manager.close();
		factory.close();
	}

}
