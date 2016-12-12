package com.qac.row5project.managers;

import com.qac.row5project.entities.SecurityQuestion;

/** 
 * 
 * @author Richard Allen
 *
 */

public interface SecurityQuestionManager {

	//CREATE - CUSTOMER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * Create new security question
	 */
	public void createSecurityQuestion(SecurityQuestion newQuestion);
	
	//READ - CUSTOMER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * @return the security question
	 */
	public SecurityQuestion readSecurityQuestion(String question);	
	
	//UPDATE - CUSTOMER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * update the security question
	 */
	public void updateSecurityQuestion(String newQuestion, String oldQuestion);
	
}
