
public interface Payment {
	public void createPayment(Payment payment);
	public Payment readPayment(int ID);
	public Payment readPayment(String cardNumber);
	public Payment readPayment(String issueNumber);
	public void updatePayment(String type, String cardNumber,Calender expiryDate, String nameOnCard, String issueNumber, Customer customer, Address address);
	public Customer findCustomer(int ID);
	public Address findAddress(int ID);
}
