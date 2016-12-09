package com.qac.services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.TestData;
import com.qac.row5project.managers.GeneratedOrderManager;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.StockManager;

@Stateless

public class GenerateService {
	@Inject
	private GeneratedOrderManager generatedOrderManager;
	@Inject
	private ProductManager productManager;
	@Inject
	private ProductService productService;
	private StockManager stockManager;
	private TestData testData;
	/**
	 * This method gets all of the products in the system, but only returns those with a low stock count.
	 * @return	All of the products with a low stock count.
	 */
	public List<ProductItem> getProducts(){
		List<ProductItem> returnable = new ArrayList<ProductItem>();
		List<ProductItem> stock = productService.findAllProducts();	//Get all products
		Iterator i = stock.iterator();
		while (i.hasNext()){
			ProductItem p = (ProductItem) i.next();	//If a ProductItem has less than 5 items then we add it to the list.
			if (p.getStockLevel() < 5){
				returnable.add(p);
			} 
		}
		return returnable;	//Return the final list.
	}

	public List<Integer> getQuantities() {
		// TODO Auto-generated method stub
		return generatedOrderManager.getQuantities();
	}
	/**
	 * This method generates an order in test data for a product the user wants to generate an order for.
	 * @param	The productID the user entered.
	 * @return	The suggested quantities for the user.
	 */
	public void generateOrder(String poID){
		List<Stock> stock = new ArrayList<Stock>();
		Stock e = stockManager.findStocksbyID(Integer.parseInt(poID));	//Find all items of stock with the productID the user gave.
		stock.add(e);
		PurchaseOrder po = new PurchaseOrder(0, null);	//Create a new purchaseorder
		po.setStockList(stock);	//Add the users stock to it.
		List<PurchaseOrder> current = testData.getPurchaseOrders();
		current.add(po);
		testData.setPurchaseOrders(current);
	}
}
