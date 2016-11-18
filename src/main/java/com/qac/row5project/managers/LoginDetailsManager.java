package com.qac.row5project.managers;

import com.qac.row5project.entities.LoginDetails;

public interface LoginDetailsManager {
	
	//CREATE - Visitor
	public void createLoginDetails(LoginDetails loginDetails);
	
	//READ - Customer And Inventory Manager
	public LoginDetails readLoginDetails(String emailAddress);
	
	//UPDATE - Customer And Inventory Manager
	public void updateLoginDetails(LoginDetails logInDetails);
}
