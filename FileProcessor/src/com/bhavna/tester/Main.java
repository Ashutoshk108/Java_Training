package com.bhavna.tester;

import com.bhavna.service.FileReader;
import com.bhavna.service.MapData;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader readerObj=new FileReader();
		MapData dataObj=readerObj.readFile("D:data.txt");
		dataObj.display();

	}

}
