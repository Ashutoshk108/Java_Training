package com.springcore.autowireByAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	@Autowired
	private List<Item> itemLst;

	public List<Item> getItemLst() {
		return itemLst;
	}

	public void setItemLst(List<Item> itemLst) {
		this.itemLst = itemLst;
	}

	public Product(List<Item> itemLst) {
		super();
		this.itemLst = itemLst;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [itemLst=" + itemLst + "]";
	}
	

}
