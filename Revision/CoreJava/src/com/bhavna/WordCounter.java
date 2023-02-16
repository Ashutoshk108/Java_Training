package com.bhavna;

import java.util.HashMap;

public class WordCounter {
	
	public static void printFrequencyOfWords(String sentence) {
		String[] words=sentence.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String word:words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		map.forEach((k,v)->System.out.println(k+"\t"+v));
		
		
	}
	
	public static void main(String[] args) {
		String sentence="This is the first string where every word is unique except is";		
		printFrequencyOfWords(sentence);
	}

}
