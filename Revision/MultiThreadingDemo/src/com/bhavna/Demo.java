package com.bhavna;


class MyThread extends Thread {
	public void run() {
		System.out.println("In MyThread");
	}
	
}

//creating thread using runnable interface
class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("Value of i is "+i);
			
			try{
				Thread.sleep(1500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
}
public class Demo {
	public static void main(String[] args) {
		MyThread th1=new MyThread();
		th1.start();
		
		
		MyThread1 th2=new MyThread1();
		Thread thread=new Thread(th2);
		thread.start();
	}
}

