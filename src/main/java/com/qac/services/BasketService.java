package com.qac.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

//import com.qac.row5project.entities;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.Stock;
//import com.qac.row5project.managers;
import com.qac.row5project.managers.CustomerOrderManager;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.StockManager;


/**
 * 
 * @author Iman Hassan
 *
 */

public class BasketService {
	
	@Inject
	private CustomerOrderManager customerOrderManager;
	@Inject
	private ProductManager productManager;
	@Inject
	private ProductService productService;
	@Inject
	private StockManager stockManager;
	
	/**
	 * To get basket for the customer order
	 * @param id
	 * @return
	 */
	public List<ProductItem> getBasket(long id) {
		List<ProductItem> basket = new ArrayList<>();		
		try {
			CustomerOrder customerOrder = customerOrderManager.readCustomerOrderById(id); 
	} 
		finally { }
		return basket;
	} 
	
	/**
	 * Adding a product to a customer's basket
	 * @param customerId
	 * @param stockID
	 */
	public void addToBasket(long customerId, Stock stock) {
		CustomerOrder customerOrder = customerOrderManager.readCustomerOrderById(customerId);
		if (!customerOrder.getCustomerOrderLines().isEmpty()) {
			
			for (CustomerOrderLine customerOrderLine : customerOrder.getCustomerOrderLines()){
				if (stock.getStockID() == customerOrderLine.getStock().getStockID())
				{
					customerOrderLine.setQuantity(customerOrderLine.getQuantity() + 1);
					return;
				}
			}
				//stockId or Product ID
				customerOrder.addToCustomerOrderLine(new CustomerOrderLine());
		}
		
		for(Stock stock : customerOrder)
			if (stock.getstockID() == stockID)
				return;
		customerOrder.add(stockManager.findStocksbyID(stockID));
		customerOrderManager.updateCustomerOrder(customerOrder);
			
	}
	
	/**
	 * removing an item from the basket
	 * @param customerId
	 * @param stockID
	 */
	public void removeFromBasket(long customerId, long stockID) {
		CustomerOrder customerOrder = new ArrayList<>();
		for (Stock stock : customerOrderManager.readCustomerOrderById(customerId))
			if (stock.getstockID() != stockID)
				customerOrder.add(stock);
		customerOrderManager.updateCustomerOrder(customerOrder);

	}
	
	
}


