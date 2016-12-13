package com.qac.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.managers.AddressManager;
import com.qac.row5project.managers.CustomerManager;

import com.qac.row5project.managers.LoginDetailsManager;

/**
 * 
 * @author Richard Allen
 */

@Stateless
public class MyAccountService {

    @Inject
    private AddressManager addressMan;

    @Inject
    private CustomerManager customerManager;
    
    @Inject 
    private LoginDetailsManager loginManager;
    
    public void Update(Customer updated){
		customerManager.updateCustomer(updated);
		loginManager.updateLoginDetails(updated.getLoginDetails());
		
		System.out.println("Updated: " + updated.getFirstname() + " " + updated.getSurname());
    }

}
