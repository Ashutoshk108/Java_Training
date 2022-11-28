package com.bhavna.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bhavna.bean.UserLogData;

public class FileReader {
	public MapData readFile(String fileLoc) {
		MapData mapObj=new MapData();
		try {
			File fl=new File(fileLoc);
			Scanner dataReader=new Scanner(fl);
			while(dataReader.hasNextLine()) {
				String fileData=dataReader.nextLine();
				String[] array=fileData.split("\t");
				UserLogData usrData=new UserLogData(array[0],array[1],array[2]);
				mapObj.createMap(usrData.getName(), usrData);
			}
			dataReader.close();
		}catch(FileNotFoundException exception) {
			System.out.println("Unexpected error occured!");
			exception.printStackTrace();
		}
		return mapObj;
	}
}
