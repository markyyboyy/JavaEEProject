package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.Feedback;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.FeedbackManager;

@Stateless
@Default

/**
 * 
 * @author Iman Hassan
 *
 */
public class FeedbackManagerOffline implements FeedbackManager {
	@Inject
	private TestDataCatalogue testData;
	
	
	//CREATE - Customer Only
	/**
	 * creating a new feedback
	 */
	@Override 
	public void createFeedback(Feedback feedback) {
		List<Feedback> newFeedback = testData.getFeedbacks();
		feedback.setID(newFeedback.size()+1);
		newFeedback.add(feedback);
		testData.setFeedbacks(newFeedback);
		
	}
			
	//READ 
	
	/**
	 * reading feedback by id
	 */
	@Override
	public Feedback readById(int idFeedback) {
		for (Feedback feedback : testData.getFeedbacks()) {
			if (feedback.getID() == idFeedback) {
				return feedback;
			}
		}
		return null;
			
	}
	
	/**
	 * reading feedback by rating
	 */
	@Override
	public List<Feedback> readByFeedbackRating(int feedbackRating) {
		
		List<Feedback> arrFeedback = new ArrayList<>();
		
		for (Feedback feedback : testData.getFeedbacks()) {
			if (feedback.getFeedbackRating() == feedbackRating) {							
				arrFeedback.add(feedback);
			}
		}			
		
		return arrFeedback;		
	}
	

		
	//UPDATE - Customer Only
	/**
	 * upading reedback by customer
	 */
	public void updateFeedback(Feedback feedback) {
	
		List<Feedback> co1 = testData.getFeedbacks();

		for (int i = 0; i < co1.size(); i++) {
			if (co1.get(i).getID() == feedback.getID())
				co1.set(i, feedback);
		}

		

	}
	
	
	
	
	
	
	

}