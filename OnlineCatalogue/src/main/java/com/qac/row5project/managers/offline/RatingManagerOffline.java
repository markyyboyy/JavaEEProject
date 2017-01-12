/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers.offline;
import java.util.ArrayList;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.*;
import com.qac.row5project.managers.RatingManager;
import com.qac.row5project.helpers.*;

@Stateless
@Default
public class RatingManagerOffline implements RatingManager {

	@Inject
	private TestDataCatalogue testData;
	//CREATE: CUSTOMER
	/**
	 * Creates a rating object and adds to list of ratings
	 * 
	 * @param img
	 * 
	 */
	public void createRating(Rating rating){
		List<Rating> ratingList = testData.getRatings();
		ratingList.add(rating);
		testData.setRatings(ratingList);
	}
	
	//what if someone buys a product twice
	//READ: CUSTOMER, VISITOR INVENTORY MANAGER

	//READ - CUSTOMER/VISITOR/INV MANAGER
	
	/**
	 *  Finds one rating by product and customer ID.
	 * 
	 * @param productID
	 * @param customerID
	 * @return rating
	 * 
	 */
	public Rating findRatingsbyProductCustomerID(long productID, long customerID){
		
		List<Rating> ratingList = testData.getRatings();
		for(Rating r:ratingList)
		{
			if(r.getProductID()==productID&&r.getCustomerID()== customerID)
				return r;
		}
		return null;
	}
	/**
	 *Finds a list of ratings of by a customer with the ID.
	 * 
	 * @param cID
	 * 
	 * @return list of ratings by customer ID
	 */
	public List<Rating> findRatingsbyCustomerID(long cID){
		List<Rating> tRatingList = new ArrayList<Rating>();
		List<Rating> ratingList = testData.getRatings();
		for(Rating r:ratingList)
		{
			if(r.getCustomerID()== cID)
				tRatingList.add(r);
		}
		if(tRatingList.isEmpty())
			return null;
		else
			return tRatingList;
	}
	/**
	 * Finds a list of ratings for a product
	 * 
	 * @param pID
	 * 
	 * @return list of ratings of product
	 * 
	 */
	public List<Rating> findRatingsbyProductID(long pID){
		List<Rating> tRatingList = new ArrayList<Rating>();
		List<Rating> ratingList = testData.getRatings();
		
		for(Rating r:ratingList)
		{
			if(r.getProductID()== pID)
				tRatingList.add(r);
		}
		if(tRatingList.isEmpty())
			return new ArrayList<>();
		else
			return tRatingList;
	}
	
	/**
	 * inds the average rating for a product
	 * 
	 * @param pID
	 * 
	 * @return average rating
	 */
	public int findAvgRatingsbyProductID(long pID){
		
		List<Rating> tRatingList = findRatingsbyProductID(pID);
		int average =0;
		
		if(tRatingList ==null)
			return 0;
		
		for (Rating rating : tRatingList) {
			average += rating.getScore();
		}
		
		if(tRatingList.size() < 1)
			return 0;
		
		return average/ tRatingList.size();		
		
	}
	
	/**
	 * Creates an image object and adds to list of images
	 * 
	 * @param img
	 * 
	 */
	public List<Rating> findRatingsbyScore(short score)
	{
		List<Rating> tRatingList = new ArrayList<Rating>();
		List<Rating> ratingList = testData.getRatings();
		for(Rating r:ratingList)
		{
			if(r.getScore() == score)
				tRatingList.add(r);
		}
		if(tRatingList.isEmpty())
			return null;
		else
			return tRatingList;
	}
	
	/**
	 * Updates the rating
	 * 
	 * @param rating
	 * 
	 */
	//UPDATE	
	public void updateRating(Rating rating){
		List<Rating> ratingList = testData.getRatings();
		for(Rating r: ratingList)
		{
			if(r.getProductID()==rating.getProductID()&&r.getCustomerID()== rating.getCustomerID())
				r=rating;
		}
		testData.setRatings(ratingList);
	}
}
