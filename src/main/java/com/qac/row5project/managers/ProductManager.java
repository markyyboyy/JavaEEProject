package com.qac.row5project.managers;
import com.qac.row5project.entities.Product;

public interface  ProductManager {

	
	//CREATE - INVENTORY MANAGER
	public void createProduct(Product p);
	
	//UPDATE - INVENTORY MANAGER
	public void updateProduct(Product p);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public Product readProductById(long id);
	public Product readProductByName(String name);
	public Product readProductByColour(String colour);
	
	
}
