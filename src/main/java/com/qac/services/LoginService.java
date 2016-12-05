package com.qac.services;

import javax.inject.Inject;

import com.qac.row5project.entities.Customer;
//import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.managers.CustomerManager;
//import com.qac.row5project.managers.CustomerManager;
import com.qac.row5project.managers.LoginDetailsManager;

/**
 * 
 * @author Richard Allen
 *
 */

public class LoginService {
	@Inject
	private CustomerManager customerManager;
	@Inject
	private LoginDetailsManager loginManager;
	@Inject
	private LoginDetails login;
	
	public boolean validLogin(String email, String password){
		login = loginManager.readLoginDetails(email.toLowerCase());
		return (login.getPassword().equals(password))? true : false;
	}
	
	public Customer loginUser(String email){
		return customerManager.readCustomerByEmail(email);
	}
}
