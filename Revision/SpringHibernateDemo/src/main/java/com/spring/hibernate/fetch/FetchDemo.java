package com.spring.hibernate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.M2M.Project;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		
		Project p=(Project)session.get(Project.class, 102);
		System.out.println(p.getProjectName());
		//eager loading
		System.out.println(p.getEmployees().size());
		
		factory.close();
		
		
	}

}
