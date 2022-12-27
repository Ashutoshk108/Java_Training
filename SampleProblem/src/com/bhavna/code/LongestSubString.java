package com.bhavna.code;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubString {
	//method to find the longest sub-string from the given substring
	public static void findLongestSubString(String str) {
		//creating an empty list of strings to store the longest substrings
		ArrayList<String> lstOfSubStrings=new ArrayList<String>();
		//creating an empty hashmap to track whether the character is repeated or not
		HashMap<Character,Integer> charHashMap=new HashMap<Character,Integer>();
		
		//creating an array of all the characters present in string str
		char[] charArr=str.toCharArray();
		
		//variable for tracking length of current word
		int length=0;
		//variable to keep track length of the longest sub string
		int maxLength=length;
		//declaring an empty sub-string
		String currentWord="";
		
		//iterating over the characters of the charArr
		for(int i=0;i<charArr.length;i++) {
			//if charHashMap already contains the current character then update the value of maxLength
			//and store the currentWord in the lstOfSubStrings and set currentWord to empty
			//and update the value of i by setting it to the next character from the front after the repeating character
			//and start adding new characters to currentWord
			if(charHashMap.containsKey(charArr[i])){
				if(maxLength<=length) {
					maxLength=length;
					lstOfSubStrings.add(currentWord);
					currentWord="";
				}
				i=charHashMap.get(charArr[i])+1;
				charHashMap.clear();
				length=0;
				length++;
				charHashMap.put(charArr[i], i);
				currentWord+=charArr[i];
			}else {
				//else increment the value of length and put the current character to charHashMap and add that character to currentWord
				length++;
				charHashMap.put(charArr[i], i);
				currentWord+=charArr[i];
			}
		}
		//print all the sub strings with length equal to maxLength using for loop
		for(int i=0;i<lstOfSubStrings.size();i++) {
			if(lstOfSubStrings.get(i).length()==maxLength) {
				System.out.println(lstOfSubStrings.get(i));
			}
		}
		
		
	}
	//driver code
	public static void main(String[] args) {
		findLongestSubString("GEEKSFORGEEKS");
	}
}
