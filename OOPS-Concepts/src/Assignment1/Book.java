package Assignment1;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private double price;

	public Book(String isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void discountedPrice(double discountPrice) {
		double totalPrice = (price - (price * discountPrice) / 100);
		System.out.println("The discounted price of the book is:" + totalPrice);
	}

	public void displayDetails() {
		System.out.println("isbn=" + isbn + "\ntitle=" + title + "\nauthor=" + author + "\nprice=" + price + "");
	}

}
