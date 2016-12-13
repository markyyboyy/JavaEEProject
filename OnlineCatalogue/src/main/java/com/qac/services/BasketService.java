package com.qac.services;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.TestDataCatalogue;
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
	private CustomerOrderManager custOrderMan;
	
	@Inject
	private StockManager stockManager;
	
	@Inject
	TestDataCatalogue testDataCat;
	
	/**
	 * To get basket for the customer order
	 * 
	 * @param id
	 * @return customer's basket
	 */
	public CustomerOrder getBasket(long id) {
		return custOrderMan.readCustomerOrderById(id);
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
	public void addToBasket(Stock stock, CurrentUser cu, int quantity) {
				
		
		if (cu.isLoggedIn()){		
			
			long customerID =  cu.getCustomer().getID();
			Calendar cNow = Calendar.getInstance();
		
			CustomerOrder custOrder = custOrderMan.readCustomerOrderById(customerID);

	
			if (custOrder == null) {
				custOrder = new CustomerOrder(5, customerID, cNow, 0, 0);
				List<CustomerOrder> orders = testDataCat.getCustomerOrders();
				orders.add(custOrder);
				testDataCat.setCustomerOrders(orders);

			}
				
			custOrderMan.addToBasket(customerID, stock, 1);
		
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
	public void removeFromBasket(long cID, Stock stock, int quantity) {
		if (!custOrderMan.readCustomerOrderById(cID).getCustomerOrderLines().isEmpty()) {
			custOrderMan.removeFromBasket(cID, stock, quantity);
		}

	}
//check if logged in
	/**
	 * Getting the total price of the basket
	 * 
	 * @param id
	 * @return total price in basket
	 */
	public double getTotalBasketPrice(long id) {
		return getBasket(id).getTotalPrice();
	}
}
