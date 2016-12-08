package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import java.util.List;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.Stock;
import com.qac.services.BasketService;
import com.qac.services.ProductService;

import Controllers.session.CurrentUser;

/**
 * 
 * @author Iman Hassan
 *
 */

/**
 * Adding basket functionality
 */
@Named("basket")
@RequestScoped 
public class Basket {
	
	@Inject
	private BasketService basketService;
	
	
	@Inject
	private ProductService productService;
	
	@Inject
	private CurrentUser user;
	
	private CustomerOrder cOrder;
	
	/**
	 * Adding product item to basket if customer is logged in
	 * @param id
	 */
	public void addToBasket(Stock id, int quantity) {
		if (user.isLoggedIn()) 
			basketService.addToBasket(user.getCustomer().getID(), id, quantity);	
	}
	
	public void addToBasket(String id){
		
		int productID = 0;
		
		try{
			
			productID = Integer.valueOf(id);
			// create stock service to get Stock from id;
			
			// addToBasket(stock, 1)
			
			ProductItem temp = productService.getProductItem(productID);
			
			
			System.out.println("Added to basket " + productID);
			
			
			
		}catch(NumberFormatException nm){
			System.out.println(nm.getMessage());
			
		}
		
		
		
	}
	
	
	

	
	
	
	
	
	
	/**
	 * Removing a selected item from the customer's basket
	 * @param id
	 * @return
	 */
	public String removeItem(long id) {
		
		if (cOrder == null && user != null)
			cOrder = basketService.getBasket(user.getCustomer().getID());
		return "basket";
		
	}
	
	/**
	 * selecting the basket for the customer when logged in
	 * @return
	 */
	public CustomerOrder getBasket() {
		if (cOrder == null && user.getCustomer() != null)
			cOrder = basketService.getBasket(user.getCustomer().getID());
		return cOrder;
	}
	

	public float getTotalBasketPrice() {
		return cOrder.getTotalPrice();
		
	}

}
