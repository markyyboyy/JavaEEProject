/**
 * @Author RyanB
 */

package com.qac.row5project.managers;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.Stock;

import java.util.Calendar;
import java.util.List;

public interface CustomerOrderManager {
	
	//CREATE - CUSTOMER
	public CustomerOrder createCustomerOrder(CustomerOrder co);
	
	//UPDATE - CUSTOMER
	public void updateCustomerOrder(CustomerOrder co);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public CustomerOrder readCustomerOrderById(long id);
	public CustomerOrder readCustomerOrderByDatePlaced(Calendar date);
	
	//Basket - CUSTOMER
	public void addToBasket(long customerId, Stock stock, int quantity);
	public void removeFromBasket(long customerId, Stock stock, int quantity);
}
