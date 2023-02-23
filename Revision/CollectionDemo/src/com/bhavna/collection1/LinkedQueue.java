package com.bhavna.collection1;

import java.util.NoSuchElementException;

public class LinkedQueue {
	protected Node front, rear;
	public int size;
	
	public LinkedQueue() {
		front=null;
		rear=null;
		size=0;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void insert(Employee data) {
		Node dataNode=new Node(data, null);
		if(rear==null) {
			front=dataNode;
			rear=dataNode;
		}else {
			rear.setNext(dataNode);
			rear=rear.getNext();
		}
		size++;
	}
	
	public Employee remove() {
		if(isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		Node ptr=front;
		front=ptr.getNext();
		if(front==null)
			rear=null;
		size--;
		return ptr.getData();
	}

	public Employee peek() {
		if(isEmpty())
				throw new NoSuchElementException("Underflow Exception");
		return front.getData();
	}
	
	public void display() {
		System.out.println("Queue");
		if(size==0) {
			System.out.println("Empty");
			return;
		}
		Node ptr=front;
		while(ptr!=rear.getNext()) {
			System.out.println(ptr.getData());
			ptr=ptr.getNext();
		}
		System.out.println();
		
	}
	
}
