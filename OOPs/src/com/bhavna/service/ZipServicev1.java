package com.bhavna.service;

import java.util.*;

import com.bhavna.bean.ZipCode;

public abstract class ZipServicev1 {
	ArrayList<Object> address=new ArrayList<Object>();
	
	public void setAddress(ZipCode zipObj) {
		System.out.println("Method to add data in the address list");
	}
	public void createSample() {
		address.add(new ZipCode("India", "Haryanan", "Fariadabad",121003));
		address.add(new ZipCode("India", "Haryanan", "Ambala",133003));
		address.add(new ZipCode("India", "Amritsar", "Punjab",143001));
		address.add(new ZipCode("India", "Andhra Pradesh", "Anantpur",515001));
		address.add(new ZipCode("India", "Rajasthan", "Bharatpur",321001));
		address.add(new ZipCode("India", "Punjab", "Chandigarh",160017));
		address.add(new ZipCode("India", "Maharashtra", "Nashik", 422001));
		address.add(new ZipCode("India", "Madhya Pradesh", "Gwalior",474001));
		address.add(new ZipCode("India", "Madhya Pradesh", "Indore",452001));
		address.add(new ZipCode("India", "Uttar Pradesh", "Meerut",250001));
	}
	public abstract String getAddress(int zipCode);
	
	public abstract void printAddress(int zipCode);

}
