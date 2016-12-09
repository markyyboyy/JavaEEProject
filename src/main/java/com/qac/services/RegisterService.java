package com.qac.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.managers.AddressManager;
import com.qac.row5project.managers.CustomerManager;
import com.qac.row5project.managers.LoginDetailsManager;
/**
 * 
 * @author Richard Allen
 *
 */
@Stateless
public class RegisterService {
	@Inject
	private CustomerManager customerManager;
	@Inject
	private LoginDetailsManager logManager;
	@Inject
	private AddressManager addressMan;
	
	
	/**
	 * 
	 * @param new Customer
	 * Registers a new customer passed by the register controller
	 * 
	 */
	public void Register(Customer newCust){
		customerManager.createCustomer(newCust);
		logManager.createLoginDetails(newCust.getLoginDetails());
		addressMan.createAddress(newCust.getAddress().get(0));		
		
		System.out.println("Register Service - registered" + newCust.getFirstname() + " " + newCust.getSurname());
	}
	

}
