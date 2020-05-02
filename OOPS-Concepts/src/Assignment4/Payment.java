package Assignment4;

public class Payment {
	public double amount;

	public Payment(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void paymentDetails() {
		System.out.println("The amount of the payment is:" + amount);
	}
}
