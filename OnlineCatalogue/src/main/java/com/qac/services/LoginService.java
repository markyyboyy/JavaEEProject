package com.qac.services;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.helpers.HasingPassword;
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

	

	
	/**
	 * 
	 * @param email
	 * @param password
	 * @return true or false, if the login is valid
	 */
			
	public boolean validLogin(String email, String password){
		login = loginManager.readLoginDetails(email);		
		
		String sHashPassword = HasingPassword.hashPassword(password.trim().toCharArray());
		
		return login.getPassword().equals(sHashPassword);
	}

	/**
	 * 
	 * @param email
	 * @return the logged in Customer
	 */
	public Customer loginUser(String email) {
		return customerManager.readCustomerByEmail(email);
	}



}
