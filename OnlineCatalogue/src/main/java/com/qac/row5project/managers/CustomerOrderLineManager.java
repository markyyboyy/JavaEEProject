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
	 * @return Id
	 */
	public CustomerOrderLine readById(int id);
	
	/**
	 * READ - Customer and Inventory Manager Only
	 * @param CustomerOrder_idOrder
	 * @return Order Id
	 */
	public CustomerOrderLine readByCustomerOrder_idOrder(CustomerOrderLine CustomerOrder_idOrder);
	
	/**
	 * READ - Customer and Inventory Manager Only
	 * @param Stock_idStock
	 * @return
	 */
	public CustomerOrderLine readByStock_idStock(CustomerOrderLine Stock_idStock);
	
	public void deriveTotalPrice(long id);
	
	/**
	 * UPDATE - Customer Only
	 * @param customerOrderLine
	 */
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine);
}
