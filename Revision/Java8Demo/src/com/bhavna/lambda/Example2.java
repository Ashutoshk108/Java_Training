package com.bhavna.lambda;

import java.util.ArrayList;
import java.util.Collections;

class Student{
	private int id;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public Student() {
		super();
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Student> studentLst=new ArrayList<Student>();
		studentLst.add(new Student(1,"Rahul","Haryana"));
		studentLst.add(new Student(2,"Avinash","Haryana"));
		studentLst.add(new Student(3,"Vivek","Delhi"));
		studentLst.add(new Student(4,"Gaurav","Haryana"));
		
		Collections.sort(studentLst, (o1,o2)->{return o1.getName().compareTo(o2.getName());});
		
		studentLst.forEach(s->System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getCity()));
		
	}

}
