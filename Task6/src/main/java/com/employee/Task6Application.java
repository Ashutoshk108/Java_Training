package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task6Application {

	public static void main(String[] args) {
		SpringApplication.run(Task6Application.class, args);
		System.out.println("http://localhost:8080/employeeService/employees.wsdl");
	}

}
