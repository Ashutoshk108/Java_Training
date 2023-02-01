package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext aplConObj=new ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
		Employee emp1=aplConObj.getBean("emp1",Employee.class);
		System.out.println(emp1);
	}

}
