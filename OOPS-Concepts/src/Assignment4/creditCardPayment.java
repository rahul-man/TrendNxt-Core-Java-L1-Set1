package Assignment4;

public class creditCardPayment extends Payment {
	String CardName, ExpirationDate, CreditCardNumber;

	creditCardPayment(double amount, String CardName, String ExpirationDate, String CreditCardNumber){
		  super(amount);
		  this.CardName=CardName;
		  this.ExpirationDate=ExpirationDate;
		  this.CreditCardNumber= CreditCardNumber;
		 }

	public void paymentDetails() {
		System.out.println("The payment of Amount " + amount + " by the card " + CreditCardNumber
				+ " with the expiry date " + ExpirationDate + " by the card holder " + CardName);
	}
}
