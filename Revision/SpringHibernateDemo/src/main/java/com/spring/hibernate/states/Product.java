package com.spring.hibernate.states;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int it;
	private String name;
	private String type;
	public int getIt() {
		return it;
	}
	public void setIt(int it) {
		this.it = it;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Product(int it, String name, String type) {
		super();
		this.it = it;
		this.name = name;
		this.type = type;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [it=" + it + ", name=" + name + ", type=" + type + "]";
	}
	

}
