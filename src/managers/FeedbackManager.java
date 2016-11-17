
public interface FeedbackManager {
	
	//CREATE - Customer Only
	public void createFeedback(Feedback feedback);
		
	//READ 
	public Feedback readById(int id);
	public List<Feedback> readByFeedbackRating(int feedbackRating);
	public List<Feedback> readByComment(String comment);
	
	//UPDATE - Customer Only
	public void updateFeedback(Feedback feedback);
}