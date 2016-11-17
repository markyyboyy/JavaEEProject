package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import java.util.List;

@Stateless
@Default

public class SecurityQuestionOffline implements SecurityQuestionManager {
	//CREATE - CUSTOMER ONLY
	@Override
	public void createSecurityQuestion(String newQuestion){
		List<SecurityQuestion> sQuestion = testData.getSecurityQuestions();
		sQuestion.add(newQuestion);
		testData.setSecurityQuestions();
		
	}
	
	//READ - CUSTOMER ONLY
	@Override
	public SecurityQuestion readSecurityQuestion(String question){
		for (SecurityQuestion sQuestion : testData.getSecurityQuestions()) {
			if (sQuestion.getQuestion() == question) {
				return sQuestion;
			}
			return null;
		}
	}
	
	//UPDATE - CUSTOMER ONLY
	@Override
	public void updateSecurityQuestion(SecurityQuestion newQuestion, SecurityQuestion oldQuestion){
		for (SecurityQuestion sQuestion : testData.getSecurityQuestions()) {
			if (sQuestion.getQuestion() == oldQuestion) {
				sQuestion.setQuestion(newQuestion);
				List<SecurityQuestion> sQuestion = testData.getSecurityQuestions();
				testData.setSecurityQuestions();
			}
		}
		
		
	}
}
