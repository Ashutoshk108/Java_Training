package com.spring.hibernate.M2M;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.seteId(10);
		e1.setName("Ajay");
		
		e2.seteId(11);
		e2.setName("Axat");
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setpId(101);
		p1.setProjectName("Chat Bot");
		
		p2.setpId(102);
		p2.setProjectName("Library management system");
		
		List<Emp> lst1=new ArrayList<Emp>();
		List<Project> lst2=new ArrayList<Project>();
		
		lst1.add(e1);
		lst1.add(e2);
		
		lst2.add(p1);
		lst2.add(p2);
		
		e1.setProjects(lst2);
		p2.setEmployees(lst1);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		factory.close();
		
	}

}
