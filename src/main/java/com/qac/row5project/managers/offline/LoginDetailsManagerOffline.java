package com.qac.row5project.managers.offline;
import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.LoginDetailsManager;

@Stateless
@Default

public class LoginDetailsManagerOffline implements LoginDetailsManager {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public void createLoginDetails(LoginDetails loginDetails){
		ArrayList<LoginDetails> returned = testData.getLoginDetails();
		returned.add(loginDetails);
		testData.setLoginDetails(returned);
	}
	@Override
	public LoginDetails readLoginDetails(String emailAddress){
		ArrayList<LoginDetails> returned = testData.getLoginDetails();
		for(LoginDetails l: returned){
			if (l.getEmail().equals(emailAddress)){
				return l;
			}
		}
		return null;
	}

	@Override
	public void updateLoginDetails(LoginDetails logInDetails) {
		// TODO Auto-generated method stub
		ArrayList<LoginDetails> returned = testData.getLoginDetails();
		int i = 0;
		for(LoginDetails l: returned){
			if (l.getEmail().equals(logInDetails.getEmail())){
				returned.remove(i);
				returned.add(logInDetails);
			}
			i++;
		}
		testData.setLoginDetails(returned);
	}
}
	