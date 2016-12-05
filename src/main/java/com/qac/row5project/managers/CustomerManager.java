package com.qac.row5project.managers;

import com.qac.row5project.entities.Customer;
/***
 * 
 * @author Michael Crowther
 *
 */
public interface CustomerManager {
	
	//CREATE - VISITOR ONLY
	public void createCustomer(Customer newCustomer);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public Customer readCustomerByID(int cID);
	public Customer readCustomerByNames(String fName, String sName);
	public Customer readCustomerByEmail(String sEmail);
	
	//UPDATE - CUSTOMER ONLY
	public void updateCustomer(Customer customer);

	
}
