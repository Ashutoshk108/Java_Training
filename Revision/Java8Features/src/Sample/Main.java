package Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> bookLst=new ArrayList<Book>();
		bookLst.add(new Book("Life Comes From Life", "A.C. Bhaktivedanta", "Spirituality",200));
		bookLst.add(new Book("Surely You're Joking, Mr. Feynman!","Richard Feynman","Autobiography",400));
		bookLst.add(new Book("Atomic Habits","James Clear","Behaviour modification",300));
		bookLst.add(new Book("Rich Dad Poor Dad","Robert Kiyosaki","Finance",500));
		bookLst.add(new Book("The 5AM Club","Robin Sharma","Lifestyle",350));
		
		List<Book> booksSortedByTitle=bookLst.stream().sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList());
		System.out.println("Books sorted by title");
		booksSortedByTitle.stream().forEach(System.out::println);
		
		System.out.println("\n");
		System.out.println("Books sorted by author");
		List<Book> booksSortedByAuthor=bookLst.stream().sorted((b1,b2)->b1.getAuthor().compareTo(b2.getAuthor())).collect(Collectors.toList());
		booksSortedByAuthor.stream().forEach(System.out::println);
		
		System.out.println("\nBooks sorted by genre");
		List<Book> booksSortedByGenre=bookLst.stream().sorted((b1,b2)->b1.getGenre().compareTo(b2.getGenre())).collect(Collectors.toList());
		booksSortedByGenre.stream().forEach(System.out::println);
		
		System.out.println("\nBooks sorted by price");
		List<Book> booksSortedByPrice=bookLst.stream().sorted((b1,b2)->Integer.compare(b1.getPrice(), b2.getPrice())).collect(Collectors.toList());
		booksSortedByPrice.stream().forEach(System.out::println);

	}

}
