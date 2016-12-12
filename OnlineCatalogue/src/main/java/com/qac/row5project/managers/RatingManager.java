package com.qac.row5project.managers;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import com.qac.row5project.entities.Rating;
/***
 * This is the entity manager for the rating entity
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
	/**
	 * CUSTOMER/VISITOR/INV MANAGER
	 *  finds a specific rating by product ID and customer ID
	 * 
	 * @param productID
	 * @param customerID
	 * @return
	 */
	public Rating findRatingsbyProductCustomerID(long pID, long cID);
	/**
	 * CUSTOMER/VISITOR/INV MANAGER
	 * finds a collection of ratings of a customer
	 * 
	 * @param customerID
	 * @return
	 */
	public List<Rating> findRatingsbyCustomerID(long cID);
	/**
	 * CUSTOMER, VISITOR INVENTORY MANAGER
	 * finds a collection of ratings of a product by id
	 * 
	 * @param pID
	 * @return
	 */
	public List<Rating> findRatingsbyProductID(long pID);
	/**
	 * CUSTOMER, VISITOR INVENTORY MANAGER
	 * finds a collection of ratings by score
	 * 
	 * @param score
	 * @return
	 */
	public List<Rating> findRatingsbyScore(int Score);
	/**
	 * CUSTOMER, VISITOR INVENTORY MANAGER
	 * finds a collection of ratings by score
	 * 
	 * @param score
	 * @return 
	 */
	public int findAvgRatingsbyProductID(long l);
	/**
	 * CUSTOMER, VISITOR INVENTORY MANAGER
	 * Updates a collection of ratings by rating
	 * 
	 * @param rating
	 * 
	 */
	//UPDATE	
	public void updateRating(Rating rating);
	
}
