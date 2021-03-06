package com.qac.row5project.managers;

import com.qac.row5project.entities.Address;
/***
 * 
 * @author Michael Crowther
 *
 */
public interface AddressManager {
	
	//CREATE - Customer And Inventory Manager
	public Address createAddress(Address address);
	//LONG
	//READ - Inventory Manager Only
	public Address readEmployee(int ID);
	
	public Address readAddressById(long id);
}
