package com.spring.hibernate.oneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@Column(name="person_id")
	private int id;
	private String name;
	
	@OneToMany(mappedBy="person")
	private List<BankAccount> bankAccnts;

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

	public List<BankAccount> getBankAccnts() {
		return bankAccnts;
	}

	public void setBankAccnts(List<BankAccount> bankAccnts) {
		this.bankAccnts = bankAccnts;
	}

	public Person(int id, String name, List<BankAccount> bankAccnts) {
		super();
		this.id = id;
		this.name = name;
		this.bankAccnts = bankAccnts;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", bankAccnts=" + bankAccnts + "]";
	}
	
}
