package com.qac.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.TestData;
import com.qac.row5project.managers.GeneratedOrderManager;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.WishlistManager;
import com.qac.row5project.managers.offline.GeneratedOrderManagerOffline;
import com.qac.row5project.managers.offline.WishlistManagerOffline;

@Stateless

public class Generate {
	@Inject
	private GeneratedOrderManager generatedOrderManager;
	@Inject
	private ProductManager productManager;
	private List<Stock> stock;
	public List<Stock> getStock() {
		// TODO Auto-generated method stub
		stock = generatedOrderManager.readOrderByQuantity();
		Iterator i = stock.iterator();
		return stock;
	}
	public List<Product> getProducts(){
		return productManager.findAllProducts();
	}
	/*@Inject
	private GeneratedOrderManager manager = new GeneratedOrderManagerOffline();
	public List<Product> findWishList(long id)
	{
		return manager.findByCustomerId(id);
	}
	public void updateWishlist(long id,List<Product> w)
	{
		manager.updateWishlist(id, w);
	}*/
	public List<Integer> getQuantities() {
		// TODO Auto-generated method stub
		return generatedOrderManager.getQuantities();
	}
}
