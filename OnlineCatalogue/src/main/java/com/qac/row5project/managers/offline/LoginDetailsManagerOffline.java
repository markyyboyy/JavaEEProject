/**
 * @author Mark Freeman
 */
package com.qac.row5project.managers.offline;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.LoginDetailsManager;

@Stateless
@Default

public class LoginDetailsManagerOffline implements LoginDetailsManager {
	@Inject
	private TestDataCatalogue testData;
	
	
	

	// CREATE - Inventory Manager Only
	@Override
	public void createLoginDetails(LoginDetails loginDetails) { // Add a user to
																// the database
		List<LoginDetails> returned = testData.getLoginDetails();
		
		//String sHashPassword = HasingPassword.hashPassword(loginDetails.getPassword().toCharArray());
		//loginDetails.setPassword(sHashPassword);
		
		returned.add(loginDetails); // Construct the updated ArrayList.
		
		
		
		
		testData.setLoginDetails(returned); // Replace the ArrayList in the
											// database.
		
		
		
		
	}

	@Override
	public LoginDetails readLoginDetails(String emailAddress) {
		List<LoginDetails> returned = testData.getLoginDetails();
		for (LoginDetails l : returned) { // For every user account in the list.
			if (l.getEmail().equals(emailAddress)) { // When we find a
														// useraccount with the
														// given email address
														// return it.
				return l;
			}
		}
		return null; // If we didnt find an account return null.
	}

	@Override
	public void updateLoginDetails(LoginDetails logInDetails) {
		// TODO Auto-generated method stub
		List<LoginDetails> returned = testData.getLoginDetails();
		int i = 0; // Used as a counter variable.
		for (LoginDetails l : returned) { // For every user account in the list.
			if (l.getEmail().equals(logInDetails.getEmail())) { // Find the old
																// version of
																// the acccount.
				returned.remove(i); // Remove the old user account.
				returned.add(logInDetails); // Add the updated user account.
			}
			i++;
		}
		testData.setLoginDetails(returned); // Update the datbase with the new
											// user account list.
	}



}
