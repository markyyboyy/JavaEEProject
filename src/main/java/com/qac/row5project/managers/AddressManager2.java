package com.qac.row5project.managers;

import com.qac.row5project.entities.Address;

public interface AddressManager2 {
	
	//CREATE - Customer And Inventory Manager
	public Address createAddress(Address address);
	
	//READ - Inventory Manager Only
	public Address readEmployee(int ID);
}
