import java.List;
import java.Rating;

public interface RatingManager {
<<<<<<< HEAD
	//CREATE: CUSTOMER
	public void createRating(Rating rating);
	
	
	//what if someone buys a product twice
	//READ: CUSTOMER, VISITOR INVENTORY MANAGER
=======
	
	//CREATE - CUSTOMER
	public void createRating(Rating rating);
	//READ - CUSTOMER/VISITOR/INV MANAGER
>>>>>>> 1d2b870261de31c734a6802c0d0a7f8f03285aad
	public Rating findRatingsbyProductCustomerID(int productID, int CustomerID);
	public List<Rating> findRatingsbyCustomerID(int CustomerID);
	public List<Rating> findRatingsbyProductID(int productID);
	public List<Rating> findRatingsbyScore(int Score);
	
	//UPDATE	
	public void updateRating(Rating rating);
	//what if someone buys a product twice
	
}
