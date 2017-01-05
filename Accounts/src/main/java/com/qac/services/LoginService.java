package com.qac.services;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.managers.LoginDetailsManager;

/**
 * 
 * @author Richard Allen
 *
 */
@Stateless
public class LoginService {

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
		return login.getPassword().equals(password);
	}

}
