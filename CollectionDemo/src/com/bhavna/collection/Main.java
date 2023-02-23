package com.bhavna.collection;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		ArrayList<Student> studentLst=new ArrayList<Student>();
		studentLst.add(new Student(1,"Rahul","B2"));
		studentLst.add(new Student(2,"Raj","A2"));
		studentLst.add(new Student(3,"Ajay","A1"));
		studentLst.add(new Student(4,"Axat","C1"));
		studentLst.add(new Student(5,"Avinash","A2"));
		studentLst.add(new Student(6,"Karan","C2"));
		studentLst.add(new Student(7,"Sahil","A2"));
		
		System.out.println("Initially studentlst:- ");
		studentLst.forEach(s->System.out.println(s));
	
		Collections.sort(studentLst);
		//studentLst.sort(Comparator<Student>);
		System.out.println("\nStudents sorted by their name:-");
		for(Student student:studentLst)
			System.out.println(student);
		
		Collections.sort(studentLst, new Student());
		System.out.println("\nStudents sorted by their grades:-");
		for(Student student:studentLst)
			System.out.println(student);
		
		
		
		
	}

}
