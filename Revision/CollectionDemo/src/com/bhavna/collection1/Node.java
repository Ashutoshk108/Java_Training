package com.bhavna.collection1;

public class Node {
	private Employee data;
	private Node next;
	
	public Node(Employee data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public Node() {
		super();
	}
	
	public Employee getData() {
		return data;
	}
	public void setData(Employee data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
