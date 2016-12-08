package com.qac.row5project.managers;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import com.qac.row5project.entities.Rating;
/***
 * 
 * @author Ynyr Williams
 *
 */

@Stateless
@Alternative
public interface RatingManager {
	//CREATE: CUSTOMER
	public void createRating(Rating rating);
	
	
	//what if someone buys a product twice
	//READ: CUSTOMER, VISITOR INVENTORY MANAGER

	//READ - CUSTOMER/VISITOR/INV MANAGER
	public Rating findRatingsbyProductCustomerID(int productID, int CustomerID);
	public List<Rating> findRatingsbyCustomerID(int CustomerID);
	public List<Rating> findRatingsbyProductID(long l);
	public List<Rating> findRatingsbyScore(int Score);
	public int findAvgRatingsbyProductID(long l);

	//UPDATE	
	public void updateRating(Rating rating);
	
}
