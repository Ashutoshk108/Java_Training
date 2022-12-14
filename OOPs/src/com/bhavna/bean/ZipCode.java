package com.bhavna.bean;

import java.util.Date;

public class ZipCode extends City{
	private int zipCode;
	private Date date=new Date();
	
	public ZipCode(String countryName, String state, String cityName, int zipCode) {
		super(countryName, state, cityName);
		this.zipCode=zipCode;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		System.out.println(date);
		return "Address [country = "+super.getCountryName()+", state = "+super.getStateName()+", city = "+super.getCityName()+", zipCode=" + zipCode + "]";
	}
	
}
