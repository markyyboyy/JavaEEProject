package com.qac.row5project.managers;

public interface LoginDetailsManager {
	
	//CREATE - Visitor
	public void createLoginDetails(LoginDetails loginDetails);
	
	//READ - Customer And Inventory Manager
	public LoginDetails readLoginDetails(String emailAddress);
	
	//UPDATE - Customer And Inventory Manager
	public void updateLoginDetails(String email, String password);
}
