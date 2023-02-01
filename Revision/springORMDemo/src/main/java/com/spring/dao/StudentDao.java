package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.bean.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//adding data to the database
	@Transactional
	public int add(Student student) {
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	public Student getStudent(int id) {
		Student student=this.hibernateTemplate.get(Student.class,id);
		return student;
	}
	
	public List<Student> getAllStudent(){
		return this.hibernateTemplate.loadAll(Student.class);
	}
	
	@Transactional
	public void deleteStudent(int id) {
		Student student=this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}
	
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}	

}
