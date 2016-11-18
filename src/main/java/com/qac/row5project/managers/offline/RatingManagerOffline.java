package com.qac.row5project.managers.offline;
import java.List;
import java.Rating;

public interface RatingManager {
	//CREATE: CUSTOMER
	public void createRating(Rating rating);
	
	
	//what if someone buys a product twice
	//READ: CUSTOMER, VISITOR INVENTORY MANAGER

	//READ - CUSTOMER/VISITOR/INV MANAGER
	public Rating findRatingsbyProductCustomerID(int productID, int CustomerID);
	public List<Rating> findRatingsbyCustomerID(int CustomerID);
	public List<Rating> findRatingsbyProductID(int productID);
	public List<Rating> findRatingsbyScore(int Score);
	
	//UPDATE	
	public void updateRating(Rating rating)
	
}