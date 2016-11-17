package com.qac.row5project.managers;

public interface SecurityQuestionManager {

	//CREATE - CUSTOMER ONLY
	public void createSecurityQuestion(String newQuestion);
	
	//READ - CUSTOMER ONLY
	public SecurityQuestion readSecurityQuestion(String question);	
	
	//UPDATE - CUSTOMER ONLY
	public void updateSecurityQuestion(SecurityQuestion newQuestion, SecurityQuestion oldQuestion);
	
}
