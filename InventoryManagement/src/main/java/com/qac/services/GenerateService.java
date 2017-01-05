package com.qac.services;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.entities.Supplier;
import com.qac.row5project.helpers.ProductItem;
import com.qac.row5project.helpers.TestDataIMS;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.StockManager;
import com.qac.row5project.managers.SupplierManager;
/**
 * @author Mark Freeman
**/
@Stateless
public class GenerateService {
	@Inject
	private ProductManager productManager;
	@Inject
	private StockManager stockManager;
	@Inject
	private ProductService productService;
	@Inject
	private SupplierManager supplierManager;
	@Inject
	private TestDataIMS testData;
	/**
	 * This method gets all of the products in the system, but only returns those with a low stock count.
	 * @return	All of the products with a low stock count.
	 */
	public List<ProductItem> getProducts(){
		System.out.println("ran2");
		List<ProductItem> productItems = new ArrayList<ProductItem>();
		List<ProductItem> returnable = new ArrayList<ProductItem>();
		List<ProductItem> productsInStock = productService.findAllProducts();	//Get all products
		Iterator i = productsInStock.iterator();
		while (i.hasNext()){
			ProductItem product = (ProductItem) i.next();	//If a ProductItem has less than 5 items then we add it to the list.
			if (product.getStockLevel() < 5){
				productItems.add(product);
			} 
		}
		//System.out.println(productItems.size());
		int[] strings = new int[productsInStock.size() + 1];
		Iterator i2 = productItems.iterator();
		while(i2.hasNext()){
			ProductItem p = (ProductItem) i2.next();
			if (strings[(int) p.getID()] == 0){
				strings[(int) p.getID()] = 1;
				returnable.add(p);
			}
		}
		//System.out.println("found" + productItems.size() + "items");
		return returnable;	//Return the final list.
	}

	public List<Integer> getQuantities() {
		List<Integer> productQuantities = new ArrayList<Integer>();
		List<ProductItem> productsInStockQuantities = productService.findAllProducts();	//Get all products
		//change reference type
		for(ProductItem prod: productsInStockQuantities)
			{
			int stockLevel = prod.getStockLevel();
			if (stockLevel < 5){					//If a ProductItem has less than 5 items then we add it to the list.
				productQuantities.add(5-stockLevel);
			} 
		}
		return productQuantities;
	}
	/**
	 * This method generates an order in test data for a product the user wants to generate an order for.
	 * @param quantity
	 * @param	The productID the user entered.
	 * @return	The suggested quantities for the user.
	 */
	public void generateOrder(int quantity, String poID){
		System.out.println("Generating");
		List<Stock> stock = new ArrayList<Stock>();
		long productID = Integer.parseInt(poID);
		stock.add(new Stock(1, quantity, Integer.parseInt(poID), 14.99f));
		Calendar cal = Calendar.getInstance();
		long supplierID = productManager.readProductById(productID).getSupplierID();
		Supplier supplier = supplierManager.readByIdSupplier(supplierID);
		PurchaseOrder po = new PurchaseOrder(quantity, supplier, poID, cal, cal);	//Create a new purchaseorder
		po.setStockList(stock);	//Add the users stock to it.
		List<PurchaseOrder> current;
	if (!testData.getPurchaseOrders().isEmpty()){
				current = testData.getPurchaseOrders();
		}
		else{
			current = new ArrayList<PurchaseOrder>();
		}
		//System.out.println(current.size());
		current.add(po);
		//System.out.println(current.size());
		testData.setPurchaseOrders(current);
	}
}
