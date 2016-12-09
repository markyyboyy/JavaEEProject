package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import java.util.ArrayList;
import java.util.List;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.managers.CustomerOrderLineManager;
import com.qac.row5project.managers.CustomerOrderManager;
import com.qac.services.BasketService;
import com.qac.services.ProductService;
import com.qac.services.StockService;

import Controllers.session.CurrentUser;

/**
 * 
 * @author Iman Hassan & Mike Crowther
 *
 */

/**
 * Adding basket functionality
 */
@Named("basket")
@RequestScoped
public class BasketController {

	@Inject
	private BasketService basketService;

	@Inject
	private StockService stockService;

	@Inject
	private ProductService productService;

	@Inject
	private CurrentUser user;
	
	@Inject
	private CustomerOrderManager cM;
	
	@Inject
	private CustomerOrderLineManager olM;

	private CustomerOrder cOrder;
	
	private List<CustomerOrderLine> custOrderMdl = null;
	//private List<CustomerOrderLine> custOrderResults = null;

	
	
	
	public List<CustomerOrderLine> getCustOrderMdl(){
		try {
			
			
			Customer currentUser = user.getCustomer();
			CustomerOrder basket = basketService.getBasket(currentUser.getID());
			custOrderMdl = basket.getCustomerOrderLines();
						
			if(custOrderMdl == null)
				custOrderMdl = new ArrayList<>();
			
		} catch (Exception e) {
			custOrderMdl = new ArrayList<>();
		}
		return custOrderMdl;
	}
	
	
	
	/**
	 * Adding product item to basket if customer is logged in
	 * 
	 * @param id
	 */
	public void addToBasket(Stock stock, int quantity) {
		if (user.isLoggedIn() && user.getCustomer() != null){
			//Stock stock = stockService.getStockByProductID(id);
			basketService.addToBasket(stock, user);

			
			
		}
	}

	//add to basker stuff    vvv
	//user.getCustomer().getID(), id, quantity
	
	public void addToBasket(String id) {

		int productID = 0;

		try {

			productID = Integer.valueOf(id);

			Stock stock = stockService.getStockByProductID(productID);
			addToBasket(stock, 1);

		} catch (NumberFormatException nm) {
			System.out.println(nm.getMessage());

		}
		catch(NullPointerException e){
			CustomerOrder newOrder = new CustomerOrder();
			CustomerOrderLine newOL = new CustomerOrderLine();
			Stock stock = stockService.getStockByProductID(productID);
			newOrder.setCustomerId(user.getCustomer().getID());
			newOL.setStock(stock);
			olM.createCustomerOrderLine(newOL);
			newOrder.addToCustomerOrderLine(newOL);
			cM.createCustomerOrder(newOrder);
		}

	}

	/**
	 * Removing a selected item from the customer's basket
	 * 
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
	 * 
	 * @return
	 */
	public CustomerOrder getBasket() {
	
		if (cOrder == null && user.getCustomer() != null)
			cOrder = new CustomerOrder();
			cOrder = basketService.getBasket(user.getCustomer().getID());
		return cOrder;
	}
	
	

	public float getTotalBasketPrice() {
		return cOrder.getTotalPrice();

	}

}
