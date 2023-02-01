package Sample;

public class Book {
	private String title;
	private String author;
	private String genre;
	private int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String title, String author, String genre, int price) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return title + ", " + author + ", " + genre + ", " + price;
	}
}
