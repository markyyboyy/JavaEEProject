import java.List;
import java.Rating;

public interface RatingManager {
	//CREATE: CUSTOMER
	public void createRating(Rating rating);
	
	
	//what if someone buys a product twice
	//READ: CUSTOMER, VISITOR INVENTORY MANAGER
	public Rating findRatingsbyProductCustomerID(int productID, int CustomerID);
	public List<Rating> findRatingsbyCustomerID(int CustomerID);
	public List<Rating> findRatingsbyProductID(int productID);
	public List<Rating> findRatingsbyScore(int Score);
}
