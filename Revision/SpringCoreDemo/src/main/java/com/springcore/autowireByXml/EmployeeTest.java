package com.springcore.autowireByXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext contextObj=new ClassPathXmlApplicationContext("com/springcore/autowireByXml/config.xml");
		Employee emp=contextObj.getBean("employee1",Employee.class);
		System.out.println(emp);
	}
}
