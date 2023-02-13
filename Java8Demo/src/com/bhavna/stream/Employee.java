package com.bhavna.stream;

class Employee {
	private int id;
	private String name;
	private String location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String department;
	private String joinigDate;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJoinigDate() {
		return joinigDate;
	}
	public void setJoinigDate(String joinigDate) {
		this.joinigDate = joinigDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, String location, String department, String joinigDate, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.department = department;
		this.joinigDate = joinigDate;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", department=" + department
				+ ", joinigDate=" + joinigDate + ", salary=" + salary + "]";
	}
	
}