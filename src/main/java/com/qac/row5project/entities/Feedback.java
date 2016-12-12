
package com.qac.row5project.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Feedback")

/**
 * 
 * @author Iman Hassan
 *
 */
public class Feedback {

	@Id @Column (nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFeedback; //long / just id
	
	@Size(min=3, max=225)
	@Column(name="feedbackRating_id", nullable=true)
	private int feedbackRating; //byte
	
	@Size(min=3, max=225)
	@Column(name="comment_id", nullable=true)
	private String comment;

	/**
	 * Constructor with no arguments
	 */
	public Feedback() {
	}

	/**
	 * Create a new feedback with all elements completed
	 * @param idFeedback
	 * @param feedbackRating
	 * @param comment
	 */
	public Feedback(int idFeedback, int feedbackRating, String comment) {
		this.idFeedback = idFeedback;
		this.feedbackRating = feedbackRating;
		this.comment = comment;
	}
	
	// Getters and Setters
	
	/**
	 * 
	 * @return feedback id
	 */
	public int getIdFeedback() {
		return idFeedback;
	}
	
	/**
	 * 
	 * @return feedback rating
	 */
	public int getFeedbackRating() {
		return feedbackRating;
	}
	
	/**
	 * 
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * Set the feedback Id
	 * @param idFeedback
	 */
	public void setIdFeedback(int idFeedback) {
		this.idFeedback = idFeedback;
	}
	
	/**
	 * Set the feedback rating
	 * @param feedbackRating
	 */
	public void setFeedbackRating(int feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
	
	/**
	 * Set the comment
	 * @param comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
