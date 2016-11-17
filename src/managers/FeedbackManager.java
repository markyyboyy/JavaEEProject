
public interface FeedbackManager {
	
	//CREATE - Customer Only
	public void createFeedback();
		
	//READ 
	public Feedback readById(int id);
	public List<Feedback>Feedback readByRating(int rating);
	public List<Feedback> readByComment(int comment);
	
	//UPDATE - Customer Only
	public void updateFeedback(Feedback feedback);
}
