package com.qac.row5project.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Feedback")


public class Feedback {

	@Id @Column (nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFeedback;
	
	@Size(min=3, max=225)
	@Column(name="feedbackRating_id", nullable=true)
	private int feedbackRating;
	
	@Size(min=3, max=225)
	@Column(name="comment_id", nullable=true)
	private String comment;

	public Feedback() {
	}

	public Feedback(int idFeedback, int feedbackRating, String comment) {
		this.idFeedback = idFeedback;
		this.feedbackRating = feedbackRating;
		this.comment = comment;
	}
	
	public int getIdFeedback() {
		return idFeedback;
	}
	
	public int getFeedbackRating() {
		return feedbackRating;
	}
	
	public String getComment() {
		return comment;
	}

	public void setIdFeedback(int idFeedback) {
		this.idFeedback = idFeedback;
	}
	
	public void setFeedbackRating(int feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

}
