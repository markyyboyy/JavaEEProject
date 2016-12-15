package com.qac.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.Rating;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.TestDataCatalogue;
import com.qac.row5project.managers.CustomerOrderManager;
import com.qac.row5project.managers.StockManager;
import Controllers.session.CurrentUser;

/**
 * 
 * @author Mark Freeman
 * 
 *
 */
@Stateless	
public class ReviewService {

	@Inject
	private CustomerOrderManager custOrderMan;
	
	@Inject
	private StockManager stockManager;
	
	@Inject
	TestDataCatalogue testDataCat;

	public List<Rating> getReviewByID(long id) {
		// TODO Auto-generated method stub
		Iterator i = testDataCat.getRatings().iterator();
		List<Rating> returnable = new ArrayList<Rating>();
		while (i.hasNext()){
			Rating rating = (Rating) i.next();
			if (rating.getCustomerID() == id){
				returnable.add(rating);
			}
		}
		return returnable;
	}
}
