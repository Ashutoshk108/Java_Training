package sample2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Operations obj=new Operations();
		obj.addBook(new Book("Book 1","Author 1","Publisher 1",LocalDate.of(2010, 1, 1)));
		obj.addBook(new Book("Book 2","Author 2","Publisher 2",LocalDate.of(2020, 1, 1)));
		obj.addBook(new Book("Book 2","Author 2","Publisher 2",LocalDate.of(2015, 1, 1)));
		obj.addBook(new Book("Book 4","Author 3","Publisher 3",LocalDate.of(2015, 1, 1)));
		obj.addBook(new Book("Book 5","Author 1","Publisher 3",LocalDate.of(2008, 1, 1)));
		
		System.out.println("Books published by years:-");
		obj.groupByPublicationYear();
		System.out.println("\n");
		
		System.out.println("All books:-");
		obj.showAllBooks();
		System.out.println("\n");
		
		System.out.println("Oldest book:-");
		System.out.println(obj.findOldestBook());
		System.out.println("\n");
		
		System.out.println("Latest book:-");
		System.out.println(obj.findLatestBook());
		System.out.println("\n");
		
		
		obj.filterAndSortByTitle("Book 2");
		
		obj.filterAndSortByAuthor("Author 1");
		
	}
	
}
