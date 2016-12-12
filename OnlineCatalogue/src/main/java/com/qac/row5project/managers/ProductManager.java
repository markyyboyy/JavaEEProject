/**
 * PRODUCTMANAGER IS AN INTERFACE TOHOLDS ALL OF THE METHODS THAT WILL BE IMPLEMENTED BY THE CONTROLLER/SERVICE
 * @Author RyanB(Ynyr edited)
 */

package com.qac.row5project.managers;

import java.util.List;
import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.Stock;

public interface  ProductManager {

	
	//CREATE - INVENTORY MANAGER
	/**
	 * ALLOWS A NEW PRODUCT TO BE CREATED
	 * @param PRODUCT
	 */
	public void createProduct(Product p);
	
	//UPDATE - INVENTORY MANAGER
	/**
	 * UPDATES A PRODUCT'S INFORMATION
	 * @param PRODUCT
	 */
	public void updateProduct(Product p);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	/**
	 * READ A PRODUCT BY ITS ID 
	 * @param id
	 * @return PRODUCT
	 */
	public Product readProductById(long id);
	
	/**
	 * FIND PRODUCTS BY THEIR NAME 
	 * @param NAME
	 * @return List<Product>
	 */
	public List<Product> readProductByName(String name);
	
	/**
	 * FIND PRODUCTS BY THEIR COLOUR 
	 * @param COLOUR
	 * @return List<Product>
	 */
	public List<Product> readProductByColour(String colour);
	
	/**
	 * FIND PRODUCTS BY THEIR DESCRIPTION (PARTIAL DESCRIPTION IS OKAY)
	 * @param DESCRIPTION
	 * @return List<Product>
	 */
	public List<Product> readProductByDescription(String desc);
	
	/**
	 * FIND ALL PRODUCTS 
	 * @return List<Product>
	 */
	public List<Product> findAllProducts();
	
	/**
	 * FIND TOTAL STOCK LEVEL OF EACH PRODUCT
	 * @param List<Stock>
	 * @return int
	 */
	public int findsTotalStockLevel(List<Stock> stocks);
}
