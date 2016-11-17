package com.qac.row5project.managers;

import java.util.List;

import com.qac.row5project.entities.Feedback;

public interface FeedbackManager {
	
	//CREATE - Customer Only
	public void createFeedback(Feedback feedback);
		
	//READ 
	public Feedback readById(int idFeedback);
	public List<Feedback> readByFeedbackRating(int feedbackRating);
	public List<Feedback> readByComment(String comment);
	
	//UPDATE - Customer Only
	public void updateFeedback(Feedback feedback);
}
