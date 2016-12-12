package com.qac.services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import com.qac.row5project.helpers.ProductItem;
import com.qac.row5project.helpers.TestData;
import com.qac.row5project.managers.ProductManager;
/**
 * @author Mark Freeman
**/
@Stateless
public class GenerateService {
	@Inject
	private ProductManager productManager;
	@Inject
	private ProductService productService;
	private TestData testData;
	/**
	 * This method gets all of the products in the system, but only returns those with a low stock count.
	 * @return	All of the products with a low stock count.
	 */
	public List<ProductItem> getProducts(){
		List<ProductItem> productItems = new ArrayList<ProductItem>();
		List<ProductItem> productsInStock = productService.findAllProducts();	//Get all products
		Iterator i = productsInStock.iterator();
		while (i.hasNext()){
			ProductItem product = (ProductItem) i.next();	//If a ProductItem has less than 5 items then we add it to the list.
			if (product.getStockLevel() < 5){
				productItems.add(product);
			} 
		}
		return productItems;	//Return the final list.
	}

	public List<Integer> getQuantities() {
		List<Integer> productQuantities = new ArrayList<Integer>();
		List<ProductItem> productsInStockQuantities = productService.findAllProducts();	//Get all products
		//change reference type
		Iterator i = productsInStockQuantities.iterator();
		while (i.hasNext()){
			ProductItem product = (ProductItem) i.next();	
			
			int stockLevel = product.getStockLevel();
			if (stockLevel < 5){					//If a ProductItem has less than 5 items then we add it to the list.
				productQuantities.add(5-stockLevel);
			} 
		}
		return productQuantities;
	}
	/**
	 * This method generates an order in test data for a product the user wants to generate an order for.
	 * @param	The productID the user entered.
	 * @return	The suggested quantities for the user.
	 */
	public void generateOrder(String poID){
		/*List<Stock> stock = new ArrayList<Stock>();
		Stock e = stockManager.findStocksbyID(Integer.parseInt(poID));	//Find all items of stock with the productID the user gave.
		stock.add(e);
		PurchaseOrder po = new PurchaseOrder(0, null);	//Create a new purchaseorder
		po.setStockList(stock);	//Add the users stock to it.
		List<PurchaseOrder> current = testData.getPurchaseOrders();
		current.add(po);
		testData.setPurchaseOrders(current);*/
	}
}