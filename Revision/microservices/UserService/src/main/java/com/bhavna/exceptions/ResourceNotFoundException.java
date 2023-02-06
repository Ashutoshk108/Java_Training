package com.bhavna.exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		super("User not found on server!!");
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
