package com.springcore.autowireByAnnotation;

public class Item {
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Item(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public Item() {
		super();
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", description=" + description + "]";
	}
}
