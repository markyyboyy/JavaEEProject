
public interface FeedbackManager {
	
	//CREATE - Customer Only
	public void createFeedback();
		
	//READ 
	public Feedback readById(int id);
	public Feedback readByRating(int rating);
	public Feedback readByComment(int comment);
	
	//UPDATE - Customer Only
	public void updateRating(int rating);
	public void updateComment(String comment);
}
