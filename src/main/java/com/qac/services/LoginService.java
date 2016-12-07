package com.qac.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.managers.CustomerManager;

import com.qac.row5project.managers.LoginDetailsManager;

/**
 * 
 * @author Richard Allen
 *
 */
@Stateless
public class LoginService {
	@Inject
	private CustomerManager customerManager;
	@Inject
	private LoginDetailsManager loginManager;
	
	private LoginDetails login;
	
	public boolean validLogin(String email, String password){
		login = loginManager.readLoginDetails(email);
		return login.getPassword().equals(password);
	}
	
	public Customer loginUser(String email){
		return customerManager.readCustomerByEmail(email);
	}
}
