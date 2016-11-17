
public interface FeedbackManager {
	
	//CREATE - Customer Only
	public void createFeedback();
		
	//READ 
	public void readById(int id);
	public void readByRating(int rating);
	public void readByComment(int comment);
	
	//UPDATE - Customer Only
	public void updateRating(int rating);
	public void updateComment(String comment);
}
