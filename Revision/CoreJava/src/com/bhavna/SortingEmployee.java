package com.bhavna;

class Employee{
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class SortingEmployee {
	public static Employee[] sortEmployeeBySalary(Employee[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].getSalary()>arr[j+1].getSalary()) {
					Employee temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Employee[] empArr=new Employee[] {
				new Employee(21,"Ajay",89000),
				new Employee(15,"Rahul",65000),
				new Employee(17,"Axat",70000),
				new Employee(25,"Raj",90000),
				new Employee(31,"Avinash",75000)
		};
		
		Employee[] sortedEmpArr=sortEmployeeBySalary(empArr);
		
		for(Employee e:sortedEmpArr)
			System.out.println(e);
		
	}

}
