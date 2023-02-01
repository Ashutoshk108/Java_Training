package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	List<String> empLst;
	Set<Integer> listOfEmpId;
	Map<String, String> officeLocation;
	public List<String> getEmpLst() {
		return empLst;
	}
	public void setEmpLst(List<String> empLst) {
		this.empLst = empLst;
	}
	public Set<Integer> getListOfEmpId() {
		return listOfEmpId;
	}
	public void setListOfEmpId(Set<Integer> listOfEmpId) {
		this.listOfEmpId = listOfEmpId;
	}
	public Map<String, String> getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(Map<String, String> officeLocation) {
		this.officeLocation = officeLocation;
	}
	public Employee(List<String> empLst, Set<Integer> listOfEmpId, Map<String, String> officeLocation) {
		super();
		this.empLst = empLst;
		this.listOfEmpId = listOfEmpId;
		this.officeLocation = officeLocation;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empLst=" + empLst + ", listOfEmpId=" + listOfEmpId + ", officeLocation=" + officeLocation
				+ "]";
	}
	

}
