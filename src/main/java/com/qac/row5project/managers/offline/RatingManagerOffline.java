package com.qac.row5project.managers.offline;
import java.util.ArrayList;

import com.qac.row5project.entities.*;
import com.qac.row5project.managers.RatingManager;

public class RatingManagerOffline implements RatingManager {
	
	TestData testData;
	//CREATE: CUSTOMER
	public void createRating(Rating rating){
		ArrayList<Rating> ratingList = testData.getRatings();
		ratingList.add(rating);
		testData.setRatings(ratingList);
	}
	
	//what if someone buys a product twice
	//READ: CUSTOMER, VISITOR INVENTORY MANAGER

	//READ - CUSTOMER/VISITOR/INV MANAGER
	public Rating findRatingsbyProductCustomerID(int productID, int customerID){
		
		ArrayList<Rating> ratingList = testData.getRatings();
		for(Rating r:ratingList)
		{
			if(r.getProductID()==productID&&r.getCustomerID()== customerID)
				return r;
		}
		return null;
	}
	public ArrayList<Rating> findRatingsbyCustomerID(int customerID){
		ArrayList<Rating> tRatingList = new ArrayList<Rating>();
		ArrayList<Rating> ratingList = testData.getRatings();
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
	public ArrayList<Rating> findRatingsbyProductID(int productID){
		ArrayList<Rating> tRatingList = new ArrayList<Rating>();
		ArrayList<Rating> ratingList = testData.getRatings();
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
	public ArrayList<Rating> findRatingsbyScore(int score)
	{
		ArrayList<Rating> tRatingList = new ArrayList<Rating>();
		ArrayList<Rating> ratingList = testData.getRatings();
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
		ArrayList<Rating> ratingList = testData.getRatings();
		for(Rating r: ratingList)
		{
			if(r.getProductID()==rating.getProductID()&&r.getCustomerID()== rating.getCustomerID())
				r=rating;
		}

		testData.setRatings(ratingList);
	}
	
}
