/**
 * @Author RyanB(Ynyr edited)
 */

package com.qac.row5project.managers;

import java.util.List;
import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.Stock;

public interface  ProductManager {

	
	//CREATE - INVENTORY MANAGER
	public void createProduct(Product p);
	
	//UPDATE - INVENTORY MANAGER
	public void updateProduct(Product p);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public Product readProductById(long id);
	
	public List<Product> readProductByName(String name);
	public List<Product> readProductByColour(String colour);
	public List<Product> readProductByDescription(String desc);
	public List<Product> findAllProducts();
	public int findsTotalStockLevel(List<Stock> stocks);
}
