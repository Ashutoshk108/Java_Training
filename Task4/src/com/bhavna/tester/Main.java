package com.bhavna.tester;

import com.bhavna.service.Operations;

public class Main {

	public static void main(String[] args) {
		//Datadao dataObj=new Datadao();
		//System.out.println("Demonstration of function to store data in the employee table");
		//dataObj.takeEmpData();
		//System.out.println("Demonstration of function to store data in the department table");
		//dataObj.takeDepData();
		//System.out.println("Demonstration of function to update data in the employee table");
		//dataObj.updateEData();
		System.out.println("Demonstration of function to fetch employee data");
		Operations.fetchData();
		//System.out.println("Demonstration of function to to fetch number of employees in different department with salary above 30K");
		//Operations.countEmployeesAbove30K();

	}

}
