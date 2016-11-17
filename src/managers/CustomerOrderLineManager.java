public interface CustomerOrderLineManager {
	
	//CREATE - Customer Only
	public void createCustomerOrderLine(CustomerOrderLine customerOrderLine);
	
	//READ - Custoemr and Inventory Manager Only
	public CustomerOrderLine readbyId(int id);
	public CustomerOrderLine readByQuantity(int quantity);
	public CustomerOrderLine readByTotalPrice(int totalPrice);
	public CustomerOrderLine readByCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder);
	public CustomerOrderLine readByStock_idStock(CustomerOrder Stock_idStock);
	
	//UPDATE - Customer Only
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine);
}
