package com.qac.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.managers.CustomerManager;
import com.qac.row5project.managers.LoginDetailsManager;

@Stateless
public class RegisterService {
	@Inject
	private CustomerManager customerManager;
	@Inject
	private LoginDetailsManager logManager;
	
	
	
	public void Register(Customer newCust){
		customerManager.createCustomer(newCust);
		logManager.createLoginDetails(newCust.getLoginDetails());
		
		System.out.println("Register Service - registered" + newCust.getFirstname() + " " + newCust.getSurname());
	}
	

}
