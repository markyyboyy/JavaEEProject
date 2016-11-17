public interface CustomerOrderLineManager {
	
	//CREATE - Customer Only
	public void createCustomerOrderLine();
	
	//READ - Custoemr and Inventory Manager Only
	public CustomerOrderLine readbyId(int id);
	public CustomerOrderLine readByQuantity(int quantity);
	public CustomerOrderLine readByTotalPrice(int totalPrice);
	public CustomerOrderLine readByCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder);
	public CustomerOrderLine readByStock_idStock(CustomerOrder Stock_idStock);
	
	//UPDATE - Customer Only
	public CustomerOrderLine updatebyId(int id);
	public CustomerOrderLine updateByQuantity(int quantity);
	public CustomerOrderLine updateByTotalPrice(int totalPrice);
	public CustomerOrderLine updateByCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder);
	public CustomerOrderLine updateByStock_idStock(CustomerOrder Stock_idStock);
}
