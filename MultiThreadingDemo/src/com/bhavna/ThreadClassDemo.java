package com.bhavna;

public class ThreadClassDemo {

	public static void main(String[] args) {
		Runnable hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(hello);
		thread1.setPriority(Thread.MIN_PRIORITY);
		
		thread1.setDaemon(true);
		thread1.setName("hello");
		System.out.println("Starting hello thread...");
		thread1.start();

		Runnable bye = new DisplayMessage("World");
		Thread thread2 = new Thread(bye);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.setDaemon(true);
		System.out.println("Starting goodbye thread...");
		thread2.start();
		

		System.out.println("Starting thread3...");
		Thread thread3 = new GuessANumber(2);
		thread3.setPriority(Thread.MIN_PRIORITY);
		
		
		System.out.println("Starting thread4...");
		Thread thread4 = new GuessANumber(7);
		
		thread4.setPriority(Thread.MAX_PRIORITY);
		thread3.start();
		thread4.start();
		System.out.println("main() is ending...");
		
	}
}