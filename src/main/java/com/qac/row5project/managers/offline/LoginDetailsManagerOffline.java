package com.qac.row5project.managers.offline;
import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Stateless
@Default

public class LoginDetailsManagerOffline implements LoginDetailsManager {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public void createLoginDetails(LoginDetails loginDetails){
		ArrayList<E> returned = testData.getLoginDetails();
		returned.add(loginDetails);
		testData.setLoginDetails(returned);
	}
		
	public LoginDetails readLoginDetails(String emailAddress){
		ArrayList<E> returned = testData.getLoginDetails();
		for(LoginDetails l: returned){
			if (l.getEmailAddress.equals(emailAddress)){
				return l
			}
		}
		return null;
	}
}
	