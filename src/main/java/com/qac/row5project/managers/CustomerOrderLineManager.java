package com.qac.row5project.managers;

import java.util.List;

import com.qac.row5project.entities.CustomerOrderLine;

public interface CustomerOrderLineManager {
	
	//CREATE - Customer Only
	public void createCustomerOrderLine(CustomerOrderLine customerOrderLine);
	
	//READ - Customer and Inventory Manager Only
	public CustomerOrderLine readbyId(int id);
	public List<CustomerOrderLine> readByQuantity(int quantity);
	public List<CustomerOrderLine> readByTotalPrice(int totalPrice);
	public List<CustomerOrderLine> readByCustomerOrder_idOrder(CustomerOrderLine CustomerOrder_idOrder);
	public List<CustomerOrderLine> readByStock_idStock(CustomerOrderLine Stock_idStock);
	
	//UPDATE - Customer Only
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine);
}
