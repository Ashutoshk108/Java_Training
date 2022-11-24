package com.bhavna.service;

import com.bhavna.bean.ZipCode;

public class ZipServicev2 extends ZipServicev1 {
	
	public boolean validateZipCode(int ZipCode) {
		int length = String.valueOf(ZipCode).length();
		int firstDigit = Integer.valueOf(String.valueOf(ZipCode).charAt(0));
		if (length == 6 && firstDigit > 48 && firstDigit < 58) {
			return true;
		}
		return false;
	}

	public void setAddress(ZipCode zipObj) {
		address.add(zipObj);
	}

	public String getAddress(int zipCode) {
		if (validateZipCode(zipCode)) {
			for (int i = 0; i < address.size(); i++) {
				if (((ZipCode) address.get(i)).getZipCode() == zipCode) {
					return address.get(i).toString();
				}
			}
			return "No address found with the given zipcode!";
		}
		return "Invalid zipcode";
	}

	public void printAddress(int zipCode) {
		for (int i = 0; i < address.size(); i++) {
			if (((ZipCode) address.get(i)).getZipCode() == zipCode) {
				System.out.println(address.get(i));
			}
		}
	}

	public void printAllAddress() {
		System.out.println("All the stored addresses are:-");
		address.stream().forEach(item -> System.out.println(item));
	}
}
