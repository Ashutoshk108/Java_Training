package com.bhavna;

public class Factorial {
	public static int findFactorial(int n) {
		if(n==1) return 1;
		
		return n*findFactorial(n-1);
	}
	
	public static void main(String[] args) {
		int n=4;
		System.out.println("Factorial of "+n+" is: "+findFactorial(n));
	}
}
