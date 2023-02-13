package com.bhavna.lambda;

interface Sum{
	int sum(int a, int b, int c);
}

public class Example1 {
	public static void main(String[] args) {
		Sum s=(a,b,c)->{return (a+b+c);};
		System.out.println(s.sum(10,5,15));
	}

}
