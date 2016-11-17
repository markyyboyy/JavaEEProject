import java.util.Calendar;

public interface CustomerOrderManager {
	
	public CustomerOrder createCustomerOrder(CustomerOrder co);
	
	public void updateCustomerOrder(int customerOrderId, int feedbackId, int customerId, Calendar datePlaced,
			Calendar dateReceived, int addressId, int paymentId);
	
	public CustomerOrder readCustomerOrder(long id);
}
