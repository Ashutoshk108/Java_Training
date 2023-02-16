package com.bhavna;

public class DecimalToBinary {
	public static String convertToBinary(int number ) {
		String str="";
		while(number>0) {
			int bit=number%2;
			str+=String.valueOf(bit);
			number=number/2;
		}
		return str;
	}
	
	public static void main(String[] args) {
		int n=13;
		System.out.println(convertToBinary(n));
	}
}
