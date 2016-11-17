package com.qac.row5project.managers;

import com.qac.row5project.entities.SecurityQuestion;

public interface SecurityQuestionManager {

	//CREATE - CUSTOMER ONLY
	public void createSecurityQuestion(String newQuestion);
	
	//READ - CUSTOMER ONLY
	public SecurityQuestion readSecurityQuestion(String question);	
	
	//UPDATE - CUSTOMER ONLY
	public void updateSecurityQuestion(SecurityQuestion newQuestion, SecurityQuestion oldQuestion);
	
}
