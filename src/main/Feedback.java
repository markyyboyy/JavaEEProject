
public class Feedback {

	private int idFeedback;
	private String rating;
	private String comment;

	public Feedback() {
	}

	public Feedback(int idFeedback, String rating, String comment) {
		this.idFeedback = idFeedback;
		this.rating = rating;
		this.comment = comment;
	}

	public String getRating() {
		return rating;
	}
	
	public String getComment() {
		return comment;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

}
