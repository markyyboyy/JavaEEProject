import java.List;
import java.Rating;

public interface RatingManager {
	public void createRating(Rating rating);
	public void updateRating(Rating rating);
	//what if someone buys a product twice
	public Rating findRatingsbyProductCustomerID(int productID, int CustomerID);
	public List<Rating> findRatingsbyCustomerID(int CustomerID);
	public List<Rating> findRatingsbyProductID(int productID);
	public List<Rating> findRatingsbyScore(int Score);
}
