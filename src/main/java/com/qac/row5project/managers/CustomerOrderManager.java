/**
 * @Author RyanB
 */

package com.qac.row5project.managers;
import com.qac.row5project.entities.CustomerOrder;
import java.util.Calendar;
import java.util.List;

public interface CustomerOrderManager {
	
	//CREATE - CUSTOMER
	public CustomerOrder createCustomerOrder(CustomerOrder co);
	
	//UPDATE - CUSTOMER
	public List<CustomerOrder> updateCustomerOrder(CustomerOrder co);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public CustomerOrder readCustomerOrderById(long id);
	public CustomerOrder readCustomerOrderByDatePlaced(Calendar date);
}
