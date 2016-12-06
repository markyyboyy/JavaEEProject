package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import java.util.List;

import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.Stock;
import com.qac.services.BasketService;

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
	private CurrentUser currentUser;
	private List<ProductItem> basket;
	
	/**
	 * Adding product item to basket if customer is logged in
	 * @param id
	 */
	public void addToBasket(Stock id) {
		if (currentUser.isLoggedIn()) 
			basketService.addToBasket(currentUser.getCustomer().getID(), id);
		
	}
	
	/**
	 * Removing a selected item from the customer's basket
	 * @param id
	 * @return
	 */
	public String removeItem(long id) {
		
		if (basket == null)
			basket = basketService.getBasket(currentUser.getCustomer().getID());
		return "basket";
		
	}
	
	/**
	 * selecting the basket for the customer when logged in
	 * @return
	 */
	public List<ProductItem> getBasket() {
		if (basket == null)
			basket = basketService.getBasket(currentUser.getCustomer().getID());
		return basket;
	}
	


}
