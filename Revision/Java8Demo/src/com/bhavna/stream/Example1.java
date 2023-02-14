package com.bhavna.stream;

public class Example1 {
	public static void main(String[] args) {
		Service obj=new Service();
		obj.populateArrayWithData();
		obj.empSortedByName();
		
		System.out.println("\nEmployee in HR department: ");
		System.out.println(obj.filterEmployeeBasedOnDepartment("HR"));
		
		System.out.println("\nEmployees present in haryana:- ");
		obj.getEmployeesInHaryana();
		
		System.out.println("\n");
		obj.getAverageSalary();
		
		System.out.println("\nIncreased Salary:-");
		obj.increaseSalaryBySomePercentage();
		
		System.out.println();
		obj.groupEmployeeByLocation();

		
		
	}
}
