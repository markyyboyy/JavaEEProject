import java.util.Calendar;

public interface CustomerOrderManager {
	
	//CREATE - CUSTOMER
	public CustomerOrder createCustomerOrder(CustomerOrder co);
	
	//UPDATE - CUSTOMER
	public void updateCustomerOrder(CustomerOrder co);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public CustomerOrder readCustomerOrderById(long id);
	public CustomerOrder readCustomerOrderByDatePlaced(Calendar date);
}
