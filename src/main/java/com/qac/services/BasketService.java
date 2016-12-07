package com.qac.services;


import javax.ejb.Stateless;
import javax.inject.Inject;

//import com.qac.row5project.entities;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.Stock;
//import com.qac.row5project.managers;
import com.qac.row5project.managers.CustomerOrderManager;

/**
 * 
 * @author Iman Hassan & Ynyr Williams
 *
 */
@Stateless
public class BasketService {

	@Inject
	private CustomerOrderManager customerOrderManager;


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
	 */
	public void addToBasket(long customerId, Stock stock, int quantity) {
		CustomerOrder customerOrder = customerOrderManager.readCustomerOrderById(customerId);
		if (!customerOrder.getCustomerOrderLines().isEmpty()) {

			for (CustomerOrderLine customerOrderLine : customerOrder.getCustomerOrderLines()) {
				if (stock.getStockID() == customerOrderLine.getStock().getStockID()) {
					customerOrderLine.setQuantity(customerOrderLine.getQuantity() + 1);
					return;
				}
			}
			customerOrder.addToCustomerOrderLine(new CustomerOrderLine(customerId, quantity, stock));
		}
	}

	/**
	 * removing an item from customer's basket
	 * 
	 * @param customerId
	 * @param stock
	 */
	public void removeFromBasket(long customerId, Stock stock) {
		CustomerOrder customerOrder = customerOrderManager.readCustomerOrderById(customerId);
		if (!customerOrder.getCustomerOrderLines().isEmpty()) {

			for (CustomerOrderLine customerOrderLine : customerOrder.getCustomerOrderLines()) {
				if (stock.getStockID() == customerOrderLine.getStock().getStockID()) {
					if (customerOrderLine.getQuantity() > 1) {
						customerOrderLine.setQuantity(customerOrderLine.getQuantity() - 1);
					} else {
						customerOrder.removeFromCustomerOrderLine(customerOrderLine);
					}
				}
			}
		}
	}

	/**
	 * Getting the total price of the basket
	 * @param id
	 * @return total price in basket
	 */
	public float totalBasketPrice(long id) {
		CustomerOrder cOrder = getBasket(id);
		return cOrder.getTotalPrice();

	}
}
