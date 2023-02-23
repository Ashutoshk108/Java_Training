package com.bhavna.collection3;

public class Product {
	private int prdtId;
	private String name;
	private String category;
	private int price;
	public int getPrdtId() {
		return prdtId;
	}
	public void setPrdtId(int prdtId) {
		this.prdtId = prdtId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int prdtId, String name, String category, int price) {
		super();
		this.prdtId = prdtId;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [prdtId=" + prdtId + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	

}
