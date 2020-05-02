package Assignment3;

public class Magazine extends Book {

	private String type;

	public Magazine(String isbn, String title, double price, String type) {
		super(isbn, title, price);
		this.type = type;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void displayMagzine() {
		System.out.println("The Magazine Details are:" + "\nType:" + type + "\nISBN:" + isbn + "\nTitle:" + title
				+ "\nPrice:" + price);
	}
}
