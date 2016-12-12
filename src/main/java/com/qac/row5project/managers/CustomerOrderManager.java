/**
 * CUSTOMERORDERMANAGER
@Author RyanB
 */

package com.qac.row5project.managers;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.Stock;

import java.util.Calendar;
import java.util.List;

public interface CustomerOrderManager {

/**
 * ALLOWS THE CREATING OF A NEW CUSTOMERORDER
 * @param CUSTOMERORDER
 * @return CUSTOMER ORDER
 */
	//CREATE - CUSTOMER
	public CustomerOrder createCustomerOrder(CustomerOrder co);
	
	/**
	 * ALLOWS THE UPDATING OF A NEW CUSTOMERORDER
	 * @param CUSTOMERORDER
	 */
	//UPDATE - CUSTOMER
	public void updateCustomerOrder(CustomerOrder co);
	
	/**
	 * FINDS AN ORDER BASED ON ITS ID
	 * @param id
	 * @return CUSTOMER ORDER
	 */
	//READ - CUSTOMER/INVENTORY MANAGER
	public CustomerOrder readCustomerOrderById(long ID);

	/**
	 * FINDS AN ORDER BY DATE PLACED
	 * @param DATE
	 * @return List<CustomerOrder>
	 */
	public List<CustomerOrder> readCustomerOrderByDatePlaced(Calendar date);
	
	//Basket - CUSTOMER
	/**
	 * ADDS AN ITEM TO THE BASKET
	 * @param customerId
	 * @param Stock
	 * @param quantity
	 */
	public void addToBasket(long customerID, Stock stock);
	
	/**
	 * REMOVES AN ITEM FROM THE CUSTOMER'S BASKET
	 * @param customerId
	 * @param Stock
	 * @param quantity
	 */
	public void removeFromBasket(long customerId, Stock stock);
	
	/**
	 * PULL UP A LIST OF ALL CUSTOMERORDERS
	 * @return List<CustomerOrder>
	 */
	public List<CustomerOrder> readCustomerOrders();
}