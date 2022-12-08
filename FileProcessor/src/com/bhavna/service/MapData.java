package com.bhavna.service;

import java.util.*;
import com.bhavna.bean.UserLogData;

public class MapData {
	Map<String, ArrayList<UserLogData>> userHashMap=new HashMap<String, ArrayList<UserLogData>>();
	
	public void createMap(String name, UserLogData usrData) {
		if(userHashMap.containsKey(name)) {
			userHashMap.get(name).add(usrData);
		}else {
			userHashMap.put(name, new ArrayList<UserLogData>());
			userHashMap.get(name).add(usrData);
		}
	}
	
	public void display() {
		userHashMap.forEach((k,v)->System.out.println(k+" : "+v));
	}

}
