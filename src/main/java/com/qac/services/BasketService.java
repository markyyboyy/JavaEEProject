package com.qac.services;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.managers.CustomerOrderManager;
import com.qac.row5project.managers.StockManager;
import Controllers.session.CurrentUser;

/**
 * 
 * @author Iman Hassan & Ynyr Williams & Mike Crowther
 * 
 *  Basket is the an active customer order
 *  
 *  Orderline is added to the basket of the logged in customer 
 * 
 *
 */
@Stateless	
public class BasketService {

	@Inject
	private CustomerOrderManager customerOrderManager;
	
	@Inject
	private StockManager stockManager;
	
	/**
	 * To get basket for the customer order
	 * 
	 * @param id
	 * @return
	 */
	public CustomerOrder getBasket(long id) {
		return customerOrderManager.readCustomerOrderById(id);
	}

	/**
	 * Adding a product to a customer's basket
	 * Uses the stock item to input into the user basket
	 * The item is added to the active order, of the logged in customer
	 * @param customerId
	 * @param stock
	 * @param quantity
	 * @return
	 */	
	public void addToBasket(Stock stock, CurrentUser cu) {
				
		if (cu.isLoggedIn()){
			CustomerOrder custOrder = customerOrderManager.readCustomerOrderById(cu.getCustomer().getID());

			if (custOrder != null) {
				customerOrderManager.addToBasket(cu.getCustomer().getID(), stock, 1);
			}
		}
	}

	//change variable names cID
	//change from read to get
	//include currentuser in method
	/**
	 * removing an item from customer's active customer Order
	 * 
	 * @param customerId
	 * @param stock
	 */
	public void removeFromBasket(long customerId, Stock stock, int quantity) {
		if (!customerOrderManager.readCustomerOrderById(customerId).getCustomerOrderLines().isEmpty()) {
			customerOrderManager.removeFromBasket(customerId, stock, quantity);
		}

	}
//check if logged in
	/**
	 * Getting the total price of the basket
	 * 
	 * @param id
	 * @return total price in basket
	 */
	public float getTotalBasketPrice(long id) {
		return getBasket(id).getTotalPrice();
	}
}
