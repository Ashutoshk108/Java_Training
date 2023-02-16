package com.bhavna;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		
		if(str.length()==0) return false;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string to check if it is a palindrome or not: ");
		String str=sc.nextLine();
		System.out.println("Is '"+str+"' a palindrome? "+isPalindrome(str));
		sc.close();
	}

}
