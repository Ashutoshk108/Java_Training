package com.spring.hibernate.oneToMany;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BankAccount {
	@Id
	@Column(name="accnt_number")
	private int accntNumber;
	private String bankName;
	
	@ManyToOne
	private Person person;

	public int getAccntNumber() {
		return accntNumber;
	}

	public void setAccntNumber(int accntNumber) {
		this.accntNumber = accntNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public BankAccount(int accntNumber, String bankName, Person person) {
		super();
		this.accntNumber = accntNumber;
		this.bankName = bankName;
		this.person = person;
	}

	public BankAccount() {
		super();
	}

	@Override
	public String toString() {
		return "BankAccount [accntNumber=" + accntNumber + ", bankName=" + bankName + ", person=" + person + "]";
	}

}
