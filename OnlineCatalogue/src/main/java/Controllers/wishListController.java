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
	
	
	private DataModel<ProductItem> wishlistView;
	
	
	@SuppressWarnings("unchecked")
	public DataModel<ProductItem> getWishlistView() {
		List<ProductItem> ls3 = new ArrayList<>();

		if(currentUser != null && currentUser.getCustomer() != null && 
				currentUser.getCustomer().getWishList() != null){
			
			List<Product> ls = currentUser.getCustomer().getWishList();				
			List<ProductItem> ls2 = productService.findAllProducts();

			
			for (Product product : ls) {
				
				for (ProductItem productItem : ls2) {
					if(product.getProductID() == productItem.getID())
						ls3.add(productItem);
				}
				
			}
			
			
			
			
			return new ListDataModel<ProductItem>( ls3);

		}
		
		List<ProductItem> ls = new ArrayList<ProductItem>();
		return new ListDataModel<ProductItem>( ls3);

		
	}


	public void setWishlistView(DataModel<ProductItem> wishlistView) {
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
