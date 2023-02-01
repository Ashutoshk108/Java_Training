package com.springcore.autowireByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {
	public static void main(String[] args) {
		ApplicationContext contextObj=new ClassPathXmlApplicationContext("com/springcore/autowireByAnnotation/config.xml");
		Product prdt=contextObj.getBean("prdt",Product.class);
		
		System.out.println(prdt);
	}

}
