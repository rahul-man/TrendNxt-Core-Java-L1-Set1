package Assignment4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cashPayment c = new cashPayment(100.00);
		cashPayment p = new cashPayment(200.00);

		creditCardPayment cc = new creditCardPayment(1000, "Rahul", "04/27", "123456789");
		creditCardPayment cp = new creditCardPayment(2000, "Aditya", "03/27", "987654321");

		c.paymentDetails();
		cc.paymentDetails();
		p.paymentDetails();
		cp.paymentDetails();
	}

}
