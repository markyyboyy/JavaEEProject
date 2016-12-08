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
	private TestData testData;
	//CREATE: CUSTOMER
	public void createRating(Rating rating){
		List<Rating> ratingList = testData.getRatings();
		ratingList.add(rating);
		testData.setRatings(ratingList);
	}
	
	//what if someone buys a product twice
	//READ: CUSTOMER, VISITOR INVENTORY MANAGER

	//READ - CUSTOMER/VISITOR/INV MANAGER
	public Rating findRatingsbyProductCustomerID(int productID, int customerID){
		
		List<Rating> ratingList = testData.getRatings();
		for(Rating r:ratingList)
		{
			if(r.getProductID()==productID&&r.getCustomerID()== customerID)
				return r;
		}
		return null;
	}
	public List<Rating> findRatingsbyCustomerID(int customerID){
		List<Rating> tRatingList = new ArrayList<Rating>();
		List<Rating> ratingList = testData.getRatings();
		for(Rating r:ratingList)
		{
			if(r.getCustomerID()== customerID)
				tRatingList.add(r);
		}
		if(tRatingList.isEmpty())
			return null;
		else
			return tRatingList;
	}
	public List<Rating> findRatingsbyProductID(int productID){
		List<Rating> tRatingList = new ArrayList<Rating>();
		List<Rating> ratingList = testData.getRatings();
		
		for(Rating r:ratingList)
		{
			if(r.getProductID()== productID)
				tRatingList.add(r);
		}
		if(tRatingList.isEmpty())
			return null;
		else
			return tRatingList;
	}
	
	
	public int findAvgRatingsbyProductID(int productID){
		
		List<Rating> tRatingList = findRatingsbyProductID(productID);
		int average =0;
		
		if(tRatingList ==null)
			return 0;
		
		for (Rating rating : tRatingList) {
			average += rating.getScore();
		}
		
		return average/ tRatingList.size();		
		
	}
	
	
	public List<Rating> findRatingsbyScore(int score)
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

	@Override
	public List<Rating> findRatingsbyProductID(long l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findAvgRatingsbyProductID(long l) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
