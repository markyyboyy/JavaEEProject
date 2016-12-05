package com.qac.row5project.managers;

import com.qac.row5project.entities.SecurityQuestion;

/** 
 * 
 * @author Richard Allen
 *
 */

public interface SecurityQuestionManager {

	//CREATE - CUSTOMER ONLY
	public void createSecurityQuestion(SecurityQuestion newQuestion);
	
	//READ - CUSTOMER ONLY
	public SecurityQuestion readSecurityQuestion(String question);	
	
	//UPDATE - CUSTOMER ONLY
	public void updateSecurityQuestion(String newQuestion, String oldQuestion);
	
}
