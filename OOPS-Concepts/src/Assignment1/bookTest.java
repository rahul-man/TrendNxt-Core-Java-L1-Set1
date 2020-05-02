package Assignment1;

public class bookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book("ISBN001", "Train to Pakistan", "Khuswant Singh ", 200.0);
		book.displayDetails();
		book.discountedPrice(10);

	}
}
