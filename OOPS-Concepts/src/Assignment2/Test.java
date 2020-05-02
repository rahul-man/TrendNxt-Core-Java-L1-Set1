package Assignment2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Email email = new Email();
		email.setSender("Rahul");
		email.setRecipient("Shubha");
		email.setTitle("Hi");
		email.setText("Meet me soon");
		System.out.println(email.toString());
	
	}

}
