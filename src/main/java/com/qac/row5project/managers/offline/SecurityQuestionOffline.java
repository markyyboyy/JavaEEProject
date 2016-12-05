package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.SecurityQuestion;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.SecurityQuestionManager;

import java.util.ArrayList;
import java.util.List;

/** 
 * 
 * @author Richard Allen
 *
 */

@Stateless
@Default



public class SecurityQuestionOffline implements SecurityQuestionManager {
	//CREATE - CUSTOMER ONLY
	@Inject
	private TestData testData;
	
	@Override
	/** 
	 * 
	 * @author Richard Allen
	 * Create new security question
	 */
	public void createSecurityQuestion(SecurityQuestion newQuestion){
		List<SecurityQuestion> sQuestion = testData.getSecurityQuestions();
		sQuestion.add(newQuestion);
		testData.setSecurityQuestions(sQuestion);
		
	}
	
	//READ - CUSTOMER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * @return the security question
	 */
	@Override
	public SecurityQuestion readSecurityQuestion(String question){
		for (SecurityQuestion sQuestion : testData.getSecurityQuestions()) {
			if (sQuestion.getQuestion() == question) {
				return sQuestion;
			}
		}
			return null;
		
	}
	
	//UPDATE - CUSTOMER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * update the security question
	 */
	@Override
	public void updateSecurityQuestion(String newQuestion, String oldQuestion){
		for (SecurityQuestion sQuestion : testData.getSecurityQuestions()) {
			if (sQuestion.getQuestion().equalsIgnoreCase(oldQuestion)) {
				sQuestion.setQuestion(newQuestion);
				List<SecurityQuestion> sQuestions = testData.getSecurityQuestions();
				testData.setSecurityQuestions(sQuestions);
			}
		}
	}
}
