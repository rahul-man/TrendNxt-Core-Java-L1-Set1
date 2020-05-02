package Assignment3;

public class Novel extends Book {

	private String author;

	public Novel(String isbn, String title, double price, String author) {
		super(isbn, title, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void displayNovel() {
		System.out.println("\nThe Novel Details are:" + "\nISBN:" + isbn + "\nTitle:" + title + "\nPrice:" + price
				+ "\nAuthor:" + author);
	}
}
