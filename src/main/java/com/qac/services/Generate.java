package com.qac.services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.TestData;
import com.qac.row5project.managers.GeneratedOrderManager;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.StockManager;
import com.qac.row5project.managers.GeneratedOrderManager;
import com.qac.row5project.managers.WishlistManager;
import com.qac.row5project.managers.offline.GeneratedOrderManagerOffline;
import com.qac.row5project.managers.offline.WishlistManagerOffline;

@Stateless

public class Generate {
	@Inject
	private GeneratedOrderManager generatedOrderManager;
	@Inject
	private ProductManager productManager;
	private StockManager stockManager;
	private List<Stock> stock;
	private String poID;
	public List<Stock> getStock() {
		// TODO Auto-generated method stub
		stock = generatedOrderManager.readOrderByQuantity();
		Iterator i = stock.iterator();
		return stock;
	}
	public List<Product> getProducts(){
		List<Product> returnable = new ArrayList<Product>();
		List<Product> stock = productManager.findAllProducts();
		Iterator i = stock.iterator();
		while (i.hasNext()){
			Product p = (Product) i.next();
			if (p.getQuantity() < 5){
				returnable.add(p);
			}
		}
		return returnable;
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
	public void generateOrder(String poID){
		List<Stock> stock = new ArrayList<Stock>();
		Stock e = stockManager.findStocksbyID(Integer.parseInt(poID));
		stock.add(e);
		PurchaseOrder po = new PurchaseOrder(0, null);
		po.setStockList(stock);
	}
	public String getPoID() {
		return poID;
	}
	public void setPoID(String poID) {
		this.poID = poID;
	}
}
