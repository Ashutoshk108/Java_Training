package com.bhavna.dao;

import java.util.ArrayList;

import com.bhavna.bean.Employee;

public class EmployeeData {
	static ArrayList<Employee> employeeLst=new ArrayList<Employee>();
	
	public ArrayList<Employee> populateWithEmployee() {
		employeeLst.add(new Employee("Axat",60000,"Delhi"));
		employeeLst.add(new Employee("Avinash",65000,"Noida"));
		employeeLst.add(new Employee("Karan",70000,"Gurugram"));
		employeeLst.add(new Employee("Rahul",75000,"Faridabad"));
		employeeLst.add(new Employee("Shivam",80000,"Chandigarh"));
		employeeLst.add(new Employee("Rohit",85000,"Hyderabad"));
		employeeLst.add(new Employee("Vinay",90000,"Pune"));
		employeeLst.add(new Employee("Sahil",950000,"Noida"));
		employeeLst.add(new Employee("Shubham",750000,"Hyderabad"));
		
		return employeeLst;
	}

}
