package com.bhavna.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Service {
	static ArrayList<Employee> empLst=new ArrayList<Employee>();
	
	public void populateArrayWithData() {
		empLst.add(new Employee(1,"Rahul","Haryana","HR","2022-07-15",70000));
		empLst.add(new Employee(2,"Ajay","Delhi","IT","2022-01-10",60000));
		empLst.add(new Employee(3,"Raj","Delhi","Finance","2022-06-11",65000));
		empLst.add(new Employee(4,"Axat","Haryana","Marketing","2021-09-15",80000));
		empLst.add(new Employee(5,"Avinash","Haryana","Developer","2019-06-17",95000));
	}
	
	public void empSortedByName() {
		System.out.println("Employee sorted by their name:-");
		/*
		Collections.sort(empLst,(o1,o2)->o1.getName().compareTo(o2.getName()));
		System.out.println("Id\t Name");
		empLst.forEach(s->System.out.println(s.getId()+"\t"+s.getName()));
		*/
		List<Employee> sortedLst=empLst.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		sortedLst.stream().forEach(e->System.out.println(e));
	}
	
	public List<Employee> filterEmployeeBasedOnDepartment(String department){
		return empLst.stream().filter(e->e.getDepartment().equals(department)).collect(Collectors.toList());
	}
	
	public void getEmployeesInHaryana() {
		List<Employee> haryanaEmp=empLst.parallelStream().filter(s->s.getLocation().contentEquals("Haryana")).collect(Collectors.toList());
		haryanaEmp.stream().forEach(e->System.out.println(e));
	}
	
	public void getAverageSalary() {
		double avgSalary=empLst.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average Salray : "+avgSalary);
		
	}
	
	public void increaseSalaryBySomePercentage() {
		empLst.stream().filter(s->s.getLocation().contentEquals("Haryana")).forEach(s->s.setSalary((int)(s.getSalary()*1.1)));
		empLst.stream().forEach(e->System.out.println(e));
	}
	
	public void groupEmployeeByLocation() {
		Map<String, List<Employee>> empByLocation=empLst.stream().collect(Collectors.groupingBy(Employee::getLocation));
		for(Entry<String, List<Employee>> entry:empByLocation.entrySet()) {
			String location=entry.getKey();
			List<Employee> employees=entry.getValue();
			System.out.println("Location: "+location);
			for(Employee emp:employees) {
				System.out.println(emp);
			}
		}
	}
	
}
