package Controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.Stock;
import com.qac.services.Generate;

@Named("generated")
@RequestScoped
public class GeneratedOrder {
	@Inject
	private Generate generateService;
	private String ProductID;
	private List<Stock> stockItems;
	private List<ProductItem> productItems = new ArrayList<ProductItem>();
	private List<String> products = new ArrayList<String>();
	List<Integer> suggestedQuanity = new ArrayList<Integer>();
	
	/**
	 * This method returns a list of all of the products in the system.
	 * @return All of the products in the system.
	 */
	public List<ProductItem> getProductItems() {
		if (productItems.size() == 0){	//If we already have a list then the user called sort, so dont display the unsorted list.
				productItems = generateService.getProducts();
		}
		return productItems;
	}
	/**
	 * This method is used to add a product that will be ordered.
	 */
	public void addProductItem() {
		products.add(ProductID);
	}
	/**
	 * This method returns the amount of stock items you need to get a product back to its recommended stokc level of 5.
	 * @return	A list of integers, each represents a suggestion stock quantity.
	 */
	public List<Integer> getSuggestedQuanity(){
		if (suggestedQuanity.size() == 0){	//If we dont already have a list then display the suggested qunatiries, else the user has called search.
		suggestedQuanity = generateService.getQuantities();
		}
		return suggestedQuanity;
	}
	/**
	 * This method returns the amount of stock items you need to get a product back to its recommended stock level of 5, but this time sorted by the amount needed..
	 * @return	A list of integers, each represents a suggestion stock quantity.
	 */
	public List<Integer> getSuggestedQuanitySorted(){
		Collections.sort(suggestedQuanity, (s1, s2) -> s1.intValue() - s2.intValue());	//Get the suggested quantities and sort them.
		return suggestedQuanity;
	}
	/**
	 * This method returns the amount of stock items you need to get a product back to its recommended stock level of 5, but this time sorted by the amount needed..
	 * @return	A list of integers, each represents a suggestion stock quantity.
	 */
	public List<ProductItem> sortByQuantity(){
		Collections.sort(productItems, (s1, s2) -> s1.getStockLevel() - s2.getStockLevel());	//Get the products and sort them.
		getSuggestedQuanitySorted();
		return productItems;
	}
	/**
	 * This method returns the product the user wanted to order.
	 * @return	The productID of the product the user wanted to order.
	 */
	public String getProductID() {
		return ProductID;
	}
	/**
	 * This method sets the product the user wanted to order.
	 * @param	The productID of the product the user wanted to order.
	 */
	public void setProductID(String productID) {
		ProductID = productID;
	}
	/**
	 * This method returns an unsorted list of all the products in the system.
	 * @return	The productID of the product the user wanted to order.
	 */
	public List<ProductItem> unsort(){
		getSuggestedQuanity();
		productItems = generateService.getProducts();
		return productItems;
	}
	/**
	 * This method generates an order from a productID
	 * @param	The productID of the product the user wanted to order.
	 */
	public void generateOrder(String poID){
		generateService.generateOrder(poID);
	}
}