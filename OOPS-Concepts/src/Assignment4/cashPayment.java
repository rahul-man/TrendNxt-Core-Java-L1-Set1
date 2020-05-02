package Assignment4;

public class cashPayment extends Payment {
	double amount;

	public cashPayment(double amount) {
		super(amount);
		this.amount = amount;
	}

	public void paymentDetails() {
		System.out.println("The amount of the payment is:" + amount);
	}
}
