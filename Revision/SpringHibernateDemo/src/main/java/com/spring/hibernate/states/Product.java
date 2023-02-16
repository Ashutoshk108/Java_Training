package com.spring.hibernate.states;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private String type;
	public int getIt() {
		return id;
	}
	public void setIt(int id) {
		this.id = id;
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
	public Product(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	

}
