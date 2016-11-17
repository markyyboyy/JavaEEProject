package com.qac.row5project.managers;
public interface CustomerOrderLineManager {
	
	//CREATE - Customer Only
	public void createCustomerOrderLine(CustomerOrderLine customerOrderLine);
	
	//READ - Customer and Inventory Manager Only
	public CustomerOrderLine readbyId(int id);
	public List<CustomerOrderLine> readByQuantity(int quantity);
	public List<CustomerOrderLine> readByTotalPrice(int totalPrice);
	public List<CustomerOrderLine> readByCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder);
	public List<CustomerOrderLine> readByStock_idStock(CustomerOrder Stock_idStock);
	
	//UPDATE - Customer Only
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine);
}
