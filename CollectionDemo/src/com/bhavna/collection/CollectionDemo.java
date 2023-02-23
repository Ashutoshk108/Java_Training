package com.bhavna.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		
		lst.add("Alex");
		lst.add("1");
		lst.add("Jack");
		lst.add("George");
		System.out.println("ArrayList: "+lst);
		System.out.println(lst.contains("Jack"));
		
		List<String> ll=new LinkedList<String>();
		ll.add("Ethan");
		ll.add("Hunt");
		ll.add("5");
		ll.add("Harry");
		System.out.println("Linked List: "+ll);
		
		Set st=new HashSet();
		st.add("John");
		st.add("Sam");
		st.add(10);
		st.add("Mike");
		System.out.println("Hashset: "+st);
		
		Map mp=new HashMap();
		mp.put("Key1","Value1");
		mp.put("Key2","Value2");
		mp.put("Key3","Value3");
		System.out.println("Hashmap: "+mp);
		
	}

}
