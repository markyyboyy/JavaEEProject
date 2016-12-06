package com.qac.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

//import com.qac.row5project.entities;
import com.qac.row5project.entities.CustomerOrder;
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
	private CustomerOrderManager custoemrOrderManager;
	@Inject
	private ProductManager productManager;
	@Inject
	private ProductService productService;
	@Inject
	private StockManager stockManager;
	
	
	public List<ProductItem> getBasket(long id) {
		List<ProductItem> basket = new ArrayList<>();		
		try {
			CustomerOrder customerOrder = custoemrOrderManager.readCustomerOrderById(id); 
		
	} finally { }
		return basket;
	} 
	
	public void addToBasket(long customerId, long productId) {
		CustomerOrder customerOrder = custoemrOrderManager.readCustomerOrderById(customerId);
		if ( customerOrder == null) {
			customerOrder = new ArrayList<Stock>();
		}
		
		for(Stock stock : customerOrder)
			
	}
}


