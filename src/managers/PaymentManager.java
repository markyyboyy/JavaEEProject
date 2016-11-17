
public interface Payment {
	public Payment createPayment(Payment payment);
	public Payment readPayment();
	public void updatePayment(String type, String cardNumber,Calender expiryDate, String nameOnCard, String issueNumber, Customer customer, Address address);
}
