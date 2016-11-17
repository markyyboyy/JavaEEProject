import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Stateless
@Default

public class FeedbackManagerOffline implements FeedbackManger {
	@Inject
	private TestData testData;
	
	
	//CREATE - Customer Only
	@Override 
	public void createFeedback(Feedback feedback) {
		List<Feedback> newFeedback = testData.getFeedback();
		newFeedback.setIdFeedback(newFeedback.size()+1);
		newFeedback.add(feedback);
		testData.setFeedback(newFeedback);
		
	}
			
	//READ 
	@Override
	public Feedback readById(int idFeedback) {
		for (Feedback feedback : testData.getIdFeedback()) {
			if (feedback.getIdFeedback() == idFeedback) {
				return feedback;
			}
			return null;
		}
			
	}
	
	@Override
	public List<Feedback> readByFeedbackRating(int feedbackRating) {
		for (Feedback feedback : testData.getFeedbackRating()) {
			if (feedback.getFeedbackRating() == feedbackRating) {
				return feedback;
			}
			return null;
		}
			
	}
	
	@Override
	public List<Feedback> readByComment(String comment) {
		for (Feedback feedback : testData.getComment()) {
			if (feedback.getComment() == comment) {
				return feedback;
			}
			return null;
		}
	}
		
	//UPDATE - Customer Only
	public void updateFeedback(Feedback feedback) {
	
	}

}