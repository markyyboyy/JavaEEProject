package Controllers;

import java.util.ArrayList;
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

import com.qac.row5project.helpers.ProductItem;	
import com.qac.row5project.helpers.TestDataCatalogue;
import com.qac.services.ProductService;

import Controllers.session.CurrentUser;

/**
 * Session Bean implementation class wishListController
 */

@Named("wishlist")
@RequestScoped
public class wishListController {


	@Inject
	ProductService productService;
	
	@Inject
	TestDataCatalogue testData;
	
	@Inject
	CurrentUser currentUser;
	
	
	private DataModel<Product> wishlistView;
	
	
	@SuppressWarnings("unchecked")
	public DataModel<Product> getWishlistView() {
		
		if(currentUser != null && currentUser.getCustomer() != null && 
				currentUser.getCustomer().getWishList() != null){
			
			List<Product> ls = currentUser.getCustomer().getWishList();	

			return new ListDataModel<Product>( ls);

		}
		
		List<Product> ls = new ArrayList<Product>();
		return new ListDataModel<Product>( ls);

		
	}


	public void setWishlistView(DataModel<Product> wishlistView) {
		this.wishlistView = wishlistView;
	}

	public boolean isInWishlist(long productID){
		
		if(currentUser != null && currentUser.isLoggedIn()){
			
			Customer cu = currentUser.getCustomer();	
			Product p = productService.getProduct(productID);		
			
			return cu.getWishList().contains(p);			
			
		}else
			return false;		
	}

	public String addToWishlistToggle(long productID){	
		
		Product p = productService.getProduct(productID);			
		
		if(currentUser != null && currentUser.isLoggedIn()){
			
			Customer cu = currentUser.getCustomer();			
			
			if(cu.getWishList().contains(p))
				cu.removeProductToWishlist(p);
			else		
				cu.addProductToWishlist(p);
			
		}
		
		return "catalogue";	

	}
	
}
