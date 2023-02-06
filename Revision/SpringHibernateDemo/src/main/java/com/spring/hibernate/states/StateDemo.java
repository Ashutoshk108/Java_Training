package com.spring.hibernate.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example of states");
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Product prdt=new Product();
		prdt.setIt(1);
		prdt.setName("Phone");
		prdt.setType("Electronic");
		//prdt: transient
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(prdt);
		//prdt: persistent- session, database
		prdt.setName("Game console");
		tx.commit();
		
		session.close();
		//detached
		prdt.setName("smart phone");
		System.out.println(prdt);
		
		
		
		factory.close();

	}

}
