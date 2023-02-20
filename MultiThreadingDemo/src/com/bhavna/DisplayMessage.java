package com.bhavna;

public class DisplayMessage implements Runnable {
	private String message;

	public DisplayMessage(String message) {
		this.message = message;
	}

	public void run() {
		int i=1;
		while (i<=5) {
			System.out.println(message);
			i++;
		}
	}
}