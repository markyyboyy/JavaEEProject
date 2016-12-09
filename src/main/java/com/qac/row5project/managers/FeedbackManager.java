package com.qac.row5project.managers;

import java.util.List;

import com.qac.row5project.entities.Feedback;

/**
 * 
 * @author Iman Hassan
 *
 */
public interface FeedbackManager {
	
	/**
	 * CREATE - Customer Only
	 * Method to create new feedback
	 * @param feedback
	 */
	public void createFeedback(Feedback feedback);

	/**
	 * READ 
	 * method to read feedback by id
	 * @param idFeedback
	 * @return feedback Id
	 */
	public Feedback readById(int idFeedback);
	
	/**
	 * READ 
	 * method to read feedback rating
	 * @param feedbackRating
	 * @return feedback rating
	 */
	public List<Feedback> readByFeedbackRating(int feedbackRating);
//	public List<Feedback> readByComment(String comment);
	
	/**
	 * UPDATE - Customer Only
	 * method to update feedback left by a customer
	 * @param feedback
	 */
	public void updateFeedback(Feedback feedback);
}
