package com.qac.row5project.managers.offline;

import java.util.List;

import com.qac.row5project.entities.Rating;

public interface RatingManagerOffline {
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
	public void updateRating(Rating rating);
	
}
