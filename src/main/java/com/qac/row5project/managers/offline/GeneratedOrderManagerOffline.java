package com.qac.row5project.managers.offline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.FeedbackManager;
import com.qac.row5project.managers.GeneratedOrderManager;
import com.qac.row5project.managers.ProductManager;

@Stateless
@Default

/**
 * 
 * @author Mark Freeman
 *
 */


public class GeneratedOrderManagerOffline implements GeneratedOrderManager {
	@Inject
	private TestData testData;
	@Inject
	private ProductManager productManager;
	private PurchaseOrder purchaseOrder;
	/**
	 * This method returns the stock in the system. It is due for removal due to being obsolete.
	 * @return	The stock in the system.
	 */
	public List<Stock> generateOrder(){
		List<Stock> returnable = new ArrayList<Stock>();
		List<Stock> stock = testData.getStockItems();	//Get the stock
		Iterator stockIT = stock.iterator();
		while(stockIT.hasNext()){
			Stock stockItem = (Stock) stockIT.next();	//If the stock has less than 5 items then add it to the list.
			if (stockItem.getQuantity() < 5){
				returnable.add(stockItem);
			}
		}
		return returnable;	//Return the list.
	}
	/**
	 * This method was intended to create a PurchaseOrder. It has not been implemented and is probably obsolete.
	 * @return	A generated PurchaseOrder.
	 */
	@Override
	public PurchaseOrder createOrder() {
		return null;
	}
	/**
	 * This method sorts all of the StockItems and return them in a list.
	 * @return	A list of stock items.
	 */
	@Override
	public List<Stock> readOrderByQuantity() {
		// TODO Auto-generated method stub
		List<Stock> stock = generateOrder();	//Get the stock
		Collections.sort(stock, (s1, s2) -> s1.getQuantity() - s2.getQuantity());	//Sort the stock by the quantity available in the warehouse.
		return stock;
	}
	/**
	 * This method returns the suggested quantities for the user.
	 * @return	The suggested quantities for the user.
	 */
	@Override
	public List<Integer> getQuantities() {
		List<Product> products = testData.getProducts();
		List<Integer> productsToReturn = new ArrayList<Integer>();
		Iterator it = products.iterator();
		while(it.hasNext()){
			Product p = (Product) it.next();
			if (p.getQuantity() < 5){
				productsToReturn.add(5-p.getQuantity());
			}
	}
		return productsToReturn;

	}	
	}
