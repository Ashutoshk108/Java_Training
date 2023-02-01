package com.spring.model;

public class User {
	private String email;
	private String userName;
	private Integer mobileNumber;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public User() {
		super();
	}
	public User(String email, String userName, Integer mobileNumber) {
		super();
		this.email = email;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", userName=" + userName + ", mobileNumber=" + mobileNumber + "]";
	}

}
