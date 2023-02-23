package com.bhavna.collection;

import java.util.Comparator;

public class Student implements Comparator<Student>, Comparable<Student> {
	private int id;
	private String name;
	private String grade;
	public Student() {
		super();
	}
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getGrade().compareTo(s2.getGrade());
	}
	
	

}
