package com.qac.row5project.managers;

import java.util.List;

import com.qac.row5project.entities.CustomerOrderLine;

/**
 * 
 * @author Iman Hassan
 *
 */
public interface CustomerOrderLineManager {
	

	/**
	 * CREATE - Customer Only
	 * @param customerOrderLine
	 */
	public void createCustomerOrderLine(CustomerOrderLine customerOrderLine);
	
	/**
	 * READ - Customer and Inventory Manager Only
	 * @param id
	 * @return
	 */
	public CustomerOrderLine readById(int id);
	public CustomerOrderLine readByCustomerOrder_idOrder(CustomerOrderLine CustomerOrder_idOrder);
	public CustomerOrderLine readByStock_idStock(CustomerOrderLine Stock_idStock);
	
	public void deriveTotalPrice(long id);
	
	/**
	 * UPDATE - Customer Only
	 * @param customerOrderLine
	 */
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine);
}
