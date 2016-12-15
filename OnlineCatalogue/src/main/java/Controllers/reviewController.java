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

/**
 * Session Bean implementation class wishListController
 */

@Named("review")
@RequestScoped
public class reviewController {


	@Inject
	ReviewService reviewService;
	
	@Inject
	TestDataCatalogue testData;
	
	@Inject
	CurrentUser currentUser;
	
	@Inject
	ProductService productService;
	
	
	private DataModel<ProductWrapper> reviewView;
	private DataModel<ProductItem> productView;
	
	public ListDataModel<ProductWrapper> getReviewView() {
		System.out.println("Called");
		if(currentUser != null && currentUser.getCustomer() != null && 
				currentUser.getCustomer().getWishList() != null){
			List<ProductWrapper> wrapper = new ArrayList<ProductWrapper>();
			List<Rating> ratings = reviewService.getReviewByID(currentUser.getCustomer().getID());
			List<ProductItem> items = new ArrayList<ProductItem>();
			Iterator i = ratings.iterator();
			while (i.hasNext()){
				Rating rating = (Rating) i.next();
				items.add(productService.getProductItem(rating.getProductID()));
				wrapper.add(new ProductWrapper(productService.getProductItem(rating.getProductID()),rating));
			}
			
			reviewView = new ListDataModel<ProductWrapper>(wrapper);
			return (ListDataModel<ProductWrapper>) reviewView;
		}
		
		List<ProductWrapper> ls = new ArrayList<ProductWrapper>();
		reviewView = new ListDataModel<ProductWrapper>( ls);
		return (ListDataModel<ProductWrapper>) reviewView;		
	}
}
