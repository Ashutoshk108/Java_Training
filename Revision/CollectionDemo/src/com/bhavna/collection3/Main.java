package com.bhavna.collection3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class FirstComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()-o2.getPrice();
	}
	
}

public class Main {
	public static void main(String[] main) {
		HashSet<Product> hset=new HashSet<Product>();
		hset.add(new Product(1,"Galaxy S23","Electronics",80000));
		hset.add(new Product(3,"Galaxy S21","Electronics",50000));
		hset.add(new Product(2,"Macbook air m2","Electronics",150000));
		hset.add(new Product(4,"PS 5","Gaming Console",49000));
		hset.add(new Product(5,"X Box 360","Gaming Console",60000));
		
		System.out.println("Hash set data:- ");
		long start1=System.currentTimeMillis();
		Iterator<Product> iterator=hset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		long end1=System.currentTimeMillis();
		System.out.println("Time elapsed in iterating over the hashset: "+(end1-start1));
		
		TreeSet<Product> tset=new TreeSet<>(new FirstComparator());
		
		
		tset.add(new Product(1,"Galaxy S23","Electronics",80000));
		tset.add(new Product(3,"Galaxy S21","Electronics",50000));
		tset.add(new Product(2,"Macbook air m2","Electronics",150000));
		tset.add(new Product(4,"PS 5","Gaming Console",49000));
		tset.add(new Product(5,"X Box 360","Gaming Console",60000));
		
		System.out.println("\nTree set data:- ");
		
		long start2=System.currentTimeMillis();
		Iterator<Product> tsetIterator=tset.iterator();
		while(tsetIterator.hasNext()) {
			System.out.println(tsetIterator.next());
		}
		
		long end2=System.currentTimeMillis();
		System.out.println("Time elapsed in iterating over the tree set: "+(end2-start2));
		
		
		long start3=System.currentTimeMillis();
		tset.remove(new Product(1,"Galaxy S23","Electronics",80000));
		tset.remove(new Product(3,"Galaxy S21","Electronics",50000));
		tset.remove(new Product(2,"Macbook air m2","Electronics",150000));
		tset.remove(new Product(4,"PS 5","Gaming Console",49000));
		//tset.remove(new Product(5,"X Box 360","Gaming Console",60000));
		long end3=System.currentTimeMillis();
		System.out.println("\nTime elapsed in removing elements in tree set: "+(end3-start3));
		
		
		long start4=System.currentTimeMillis();
		hset.remove(new Product(1,"Galaxy S23","Electronics",80000));
		hset.remove(new Product(3,"Galaxy S21","Electronics",50000));
		hset.remove(new Product(2,"Macbook air m2","Electronics",150000));
		hset.remove(new Product(4,"PS 5","Gaming Console",49000));
		hset.remove(new Product(5,"X Box 360","Gaming Console",60000));
		long end4=System.currentTimeMillis();
		System.out.println("\nTime elapsed in removing elements in hash set: "+(end4-start4));
		
		tsetIterator=tset.iterator();
		while(tsetIterator.hasNext()) {
			System.out.println(tsetIterator.next());
		}
	}

}
