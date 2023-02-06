package com.spring.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.spring.hibernate.states.Product;

public class HQLExample {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		String query="from Product";
		
		@SuppressWarnings("rawtypes")
		Query q=session.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Product> lst=q.list();
		for(Product p:lst)
			System.out.println(p.getName());
		
		String query1="from Product where type=:x";
		@SuppressWarnings("rawtypes")
		Query q1=session.createQuery(query1);
		q1.setParameter("x", "Electronic");
		@SuppressWarnings("unchecked")
		List<Product> prdt1=q1.list();
		for(Product P:prdt1)
			System.out.println(P);
		
		Transaction tx=session.beginTransaction();
		
		Query q2=session.createQuery("update Product set name=:x where type=:y");
		q2.setParameter("x","TV");
		q2.setParameter("y","Electronic");
		int r=q2.executeUpdate();
		System.out.println(r+" object updated");
		
		tx.commit();
		session.close();
		factory.close();
	}
}
