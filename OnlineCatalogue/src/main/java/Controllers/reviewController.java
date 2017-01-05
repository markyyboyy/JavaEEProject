package Controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.Rating;
import com.qac.row5project.helpers.ProductItem;
import com.qac.row5project.helpers.ProductWrapper;
import com.qac.row5project.helpers.TestDataCatalogue;
import com.qac.services.ProductService;
import com.qac.services.ReviewService;

import Controllers.session.CurrentUser;
import Controllers.session.SelectedProduct;

/**
 * Session Bean implementation class wishListController
 */

@Named("review")
@RequestScoped
public class reviewController {

	@Inject
	ReviewService reviewService;

	@Inject
	CurrentUser currentUser;

	@Inject
	ProductService productService;
	
	@Inject
	SelectedProduct slctPrd;

	private String review;
	private short score;
	private String averageScore;
	
	
	private DataModel<ProductWrapper> reviewView;
	private DataModel<ProductItem> productView;
	private DataModel<Rating> productRating;

	public String getAverageScore(){
		return generateStarRating();
	}
	
	public void setAverageScore(String score){
		this.averageScore = score;
	}
	
	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public short getScore() {
		return score;
	}

	public void setScore(short score) {
		this.score = score;
	}

	public ListDataModel<ProductWrapper> getReviewByCustomer() {
		System.out.println("Called");
		if (currentUser != null && currentUser.getCustomer() != null
				&& currentUser.getCustomer().getWishList() != null) {
			List<ProductWrapper> wrapper = new ArrayList<ProductWrapper>();
			List<Rating> ratings = reviewService.getReviewByCustomerID(currentUser.getCustomer().getID());
			List<ProductItem> items = new ArrayList<ProductItem>();
			Iterator i = ratings.iterator();
			while (i.hasNext()) {
				Rating rating = (Rating) i.next();
				items.add(productService.getProductItem(rating.getProductID()));
				wrapper.add(new ProductWrapper(productService.getProductItem(rating.getProductID()), rating));
			}

			reviewView = new ListDataModel<ProductWrapper>(wrapper);
			return (ListDataModel<ProductWrapper>) reviewView;
		}

		List<ProductWrapper> ls = new ArrayList<ProductWrapper>();
		reviewView = new ListDataModel<ProductWrapper>(ls);
		return (ListDataModel<ProductWrapper>) reviewView;
	}

	
	
	public ListDataModel<Rating> getProductRating() {
		
		List<Rating> ratings = null;
		
		if (slctPrd != null && slctPrd.getProduct() != null)			
			ratings = reviewService.getReviewByCustomerID(slctPrd.getProduct().getID());				
			
		
		if(ratings == null)
			return new ListDataModel<>(new ArrayList<Rating>()) ;
		
		return new ListDataModel<>(ratings);		
		
	}
	
	public void addReview(){
		
		if(score >= 0 && score <= 5 && 
				review != null && review != "")	{			
	
			if(currentUser != null && currentUser.getCustomer() != null)
			{
				Customer customer = currentUser.getCustomer();						
				Rating r = new Rating(score, customer.getID(), slctPrd.getProduct().getID());
				r.setComment(review);
	
				reviewService.addReivew(r);				
			}	
		
		}

		
	}
	
	
	@SuppressWarnings("unused")
	public String generateStarRating(String productID){		
		
		try{
			
			long longID = Long.parseLong(productID);
			return generateStarRating(longID);
			
		}catch(Exception io){
			return "";
		}
		
	}
 	
	public String generateStarRating(){
		return generateStarRating(slctPrd.getProduct().getID());		
	}	
		
	public String generateStarRating(Long productID){
		
		final String css = "<span class='glyphicon glyphicon-star'></span>";
		StringBuilder strRating = new StringBuilder("<span></span>");	
		
		
		
		for(int i =0; i < reviewService.getAverageRating(productID); i++)			
			strRating.append(css);		
		
		
		
		
		
		return strRating.toString();		
	}

	
	

	
	
	
	
	
	
	
	
	
	
	

}
