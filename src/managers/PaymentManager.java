
public interface Payment {
	//CREATE - Customer Only
	public void createPayment(Payment payment);
	
	//READ - Customer Only
	public Payment readPayment(int ID);
	public Payment readPayment(String cardNumber);
	public Payment readPayment(String issueNumber);
	
	//UPDATE - Customer Only
	public void updatePayment(String type, String cardNumber,Calender expiryDate, String nameOnCard, String issueNumber, Customer customer, Address address);
	
	//Methods
	public Customer findCustomer(int ID);
	public Address findAddress(int ID);
}
