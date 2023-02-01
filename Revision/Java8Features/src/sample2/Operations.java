package sample2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Operations {
	ArrayList<Book> bookLst=new ArrayList<Book>();
	
	public void addBook(Book obj) {
		bookLst.add(obj);
	}

	public Operations() {
	}

	public ArrayList<Book> getBookLst() {
		return bookLst;
	}

	public void setBookLst(ArrayList<Book> bookLst) {
		this.bookLst = bookLst;
	}
	
	public void filterAndSortByTitle(String title) {
		bookLst.stream().filter(b->Optional.ofNullable(title).orElse("").equals(b.getTitle()))
		.sorted(Comparator.comparing(Book::getAuthor))
		.sorted(Comparator.comparing(Book::getPublisher))
		.sorted(Comparator.comparing(Book::getPublicationDate))
		.forEach(b->System.out.println(b.getTitle()+"\tby "+b.getAuthor()+"\tpublished by "+b.getPublisher()+"\ton "+b.getPublicationDate()));
	}
	
	public void filterAndSortByAuthor(String author) {
		bookLst.stream().filter(b->Optional.ofNullable(author).orElse("").equals(b.getAuthor()))
		.sorted(Comparator.comparing(Book::getTitle))
		.sorted(Comparator.comparing(Book::getPublisher))
		.sorted(Comparator.comparing(Book::getPublicationDate))
		.forEach(b->System.out.println(b.getTitle()+"\tby "+b.getAuthor()+"\tpublished by "+b.getPublisher()+"\ton "+b.getPublicationDate()));
	}
	
	public void filterAndSortByPublisher(String publisher) {
		bookLst.stream().filter(b->Optional.ofNullable(publisher).orElse("").equals(b.getPublisher()))
		.sorted(Comparator.comparing(Book::getTitle))
		.sorted(Comparator.comparing(Book::getAuthor))
		.sorted(Comparator.comparing(Book::getPublicationDate))
		.forEach(b->System.out.println(b.getTitle()+"\tby "+b.getAuthor()+"\tpublished by "+b.getPublisher()+"\ton "+b.getPublicationDate()));
	}
	
	public void filterAndSortByPublication(LocalDate publicationDate) {
		bookLst.stream().filter(b->Optional.ofNullable(publicationDate).orElse(LocalDate.MIN).equals(b.getPublicationDate()))
		.sorted(Comparator.comparing(Book::getTitle))
		.sorted(Comparator.comparing(Book::getAuthor))
		.sorted(Comparator.comparing(Book::getPublisher))
		.forEach(b->System.out.println(b.getTitle()+"\tby "+b.getAuthor()+"\tpublished by "+b.getPublisher()+"\ton "+b.getPublicationDate()));
	}
	
	public void groupByPublicationYear() {
		Map<Object,List<Book>> mapSet=bookLst.stream().collect(Collectors.groupingBy(
				b->b.getPublicationDate().getYear()));
		
		mapSet.entrySet().stream().forEach(e->System.out.println(e.getKey()+": "+e.getValue()));
	}
	
	public void showAllBooks() {
		bookLst.forEach(System.out::println);
	}
	
	public Optional<Book> findOldestBook(){
		return bookLst.stream()
				.min(Comparator.comparing(Book::getPublicationDate));
	}
	
	public Optional<Book> findLatestBook(){
		return bookLst.stream()
				.max(Comparator.comparing(Book::getPublicationDate));
	}

}
