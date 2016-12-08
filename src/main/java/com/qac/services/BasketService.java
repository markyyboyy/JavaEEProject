package com.qac.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

//import com.qac.row5project.entities;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.Stock;
//import com.qac.row5project.managers;
import com.qac.row5project.managers.CustomerOrderManager;

import Controllers.session.CurrentUser;

/**
 * 
 * @author Iman Hassan & Ynyr Williams
 *
 */
@Stateless
public class BasketService {

	@Inject
	private CustomerOrderManager customerOrderManager;

	@Inject
	CurrentUser cu;

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
	 * 
	 * @param customerId
	 * @param stock
	 * @param quantity
	 * @return
	 */
	
	//long customerId
	//, int quantity
	
	public void addToBasket(Stock stock) {
		
		cu.getBasket();
		
		
		
		/*if (cu != null) {

			if (!customerOrderManager.readCustomerOrderById(cu.getCustomer().getID()).getCustomerOrderLines()
					.isEmpty()) {
				customerOrderManager.addToBasket(customerId, stock, quantity);
			}

		}*/
	}

	/**
	 * removing an item from customer's basket
	 * 
	 * @param customerId
	 * @param stock
	 */
	public void removeFromBasket(long customerId, Stock stock, int quantity) {
		if (!customerOrderManager.readCustomerOrderById(customerId).getCustomerOrderLines().isEmpty()) {
			customerOrderManager.removeFromBasket(customerId, stock, quantity);
		}

	}

	/**
	 * Getting the total price of the basket
	 * 
	 * @param id
	 * @return total price in basket
	 */
	public float getTotalBasketPrice(long id) {
		CustomerOrder cOrder = getBasket(id);
		return cOrder.getTotalPrice();

	}
}
