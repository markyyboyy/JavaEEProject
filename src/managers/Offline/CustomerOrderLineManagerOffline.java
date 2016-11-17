import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Stateless
@Default

public class CustomerOrderLineManagerOffline implements CustomerOrderLineManager {
	@Inject
	private TestData testData;
	
	//CREATE - Customer Only
	@Override
	public void createCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		List<CustomerOrderLine> newCOLine = testData.getCustomerOrderLine();
		newCOLine.setId(newCOLine.size()+1);
		newCOLine.add(customerOrderLine);
		testData.setCustomerOrderLine(newCOLine);
	}
		
	//READ - Customer and Inventory Manager Only
	@Override
	public CustomerOrderLine readbyId(int id);
	
	@Override
	public List<CustomerOrderLine> readByQuantity(int quantity);
	public List<CustomerOrderLine> readByTotalPrice(int totalPrice);
	public List<CustomerOrderLine> readByCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder);
	public List<CustomerOrderLine> readByStock_idStock(CustomerOrder Stock_idStock);
		
	//UPDATE - Customer Only
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine);
	
}