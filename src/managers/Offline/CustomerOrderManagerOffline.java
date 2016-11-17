import java.util.Calendar;

@Stateless
@Default
public class CustomerOrderManagerOffline implements CustomerOrderManager {
	
	@Inject
	private TestData testData;
	
	//CREATE - CUSTOMER
	@Override
	public CustomerOrder createCustomerOrder(CustomerOrder co) {
		List<CustomerOrder> co = testData.getCustomerOrder();
		co.setcustomerOrderId(customerOrder.size()+1));
		CustomerOrder.add(co);
		testData.setCustomerOrder();
		return CustomerOrder;
		}
	
	//UPDATE - CUSTOMER
	@Override
	public void updateCustomerOrder(CustomerOrder co){
		List<customerOrder> co = testData.getcustomerOrder();
		for(customerOrder co : CustomerOrders)
			if(customerOrder.getId()) == customerOrderId)
				testData.setCustomerOrder();
		
	}
	
	//READ - CUSTOMER/INVENTORY MANAGER
	@Override
	public CustomerOrder readCustomerOrderById(long id) {
		{for(CustomerOrder co : testData.getCustomerOrder())
				if(co.getId() == Id))
					return co;
				else {return null;}
		
	}
	@Override
	public CustomerOrder readCustomerOrderByDatePlaced(Calendar date){
			for(CustomerOrder co : testData.getCustomerOrder())
			if(co.getdatePlaced() == date)
				return co;
			else {return null;}
	
}
