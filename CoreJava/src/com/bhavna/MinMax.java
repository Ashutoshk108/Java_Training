package com.bhavna;

public class MinMax {
	public static void findMinAndMax(int[] arr) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int e:arr) {
			if(e<min) {
				min=e;
			}
			
			if(e>max) {
				max=e;
			}
		}
		
		System.out.println("Minimum number in the given array is: "+min);
		System.out.println("Maximum number in the given array is: "+max);
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {8,4,1,5,6,2,3,2};
		findMinAndMax(arr);
	}

}
