package com.bhavna.collection2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> empLst=new ArrayList<Employee>();
		empLst.add(new Employee(1,"Axat",50000));
		empLst.add(new Employee(2,"Ajay",40000));
		empLst.add(new Employee(3,"Raj",60000));
		empLst.add(new Employee(4,"Rahul",35000));
		
		Employee emp=Collections.max(empLst);
		System.out.println(emp);
	}
}
