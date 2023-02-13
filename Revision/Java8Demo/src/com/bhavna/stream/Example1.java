package com.bhavna.stream;

public class Example1 {
	public static void main(String[] args) {
		Service obj=new Service();
		obj.populateArrayWithData();
		obj.empSortedByName();
		
		System.out.println("Employee in HR department: ");
		System.out.println(obj.filterEmployeeBasedOnDepartment("HR"));
		
		System.out.println("Employees present in haryana:- ");
		obj.getEmployeesInHaryana();

		
		
	}
}
