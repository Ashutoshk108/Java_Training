package com.bhavna;

//program to find sum of all even numbers in an array
public class EnhancedForLoop {
	
	public static void main(String[] args) {
		int[] arr=new int[] {13,3,4,5,2,6,7,4};
		
		int sum=0;
		
		for(int e:arr) {
			if(e%2==0)
				sum+=e;
		}
		System.out.println("Sum of all even numbers in the array is: "+sum);
	}
}
