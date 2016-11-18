package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.SecurityQuestion;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.SecurityQuestionManager;

import java.util.ArrayList;
import java.util.List;

@Stateless
@Default

public class SecurityQuestionOffline implements SecurityQuestionManager {
	//CREATE - CUSTOMER ONLY
	@Inject
	private TestData testData;
	
	@Override
	public void createSecurityQuestion(SecurityQuestion newQuestion){
		ArrayList<SecurityQuestion> sQuestion = testData.getSecurityQuestions();
		sQuestion.add(newQuestion);
		testData.setSecurityQuestions(sQuestion);
		
	}
	
	//READ - CUSTOMER ONLY
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
	@Override
	public void updateSecurityQuestion(String newQuestion, String oldQuestion){
		for (SecurityQuestion sQuestion : testData.getSecurityQuestions()) {
			if (sQuestion.getQuestion().equalsIgnoreCase(oldQuestion)) {
				sQuestion.setQuestion(newQuestion);
				ArrayList<SecurityQuestion> sQuestions = testData.getSecurityQuestions();
				testData.setSecurityQuestions(sQuestions);
			}
		}
	}
}
