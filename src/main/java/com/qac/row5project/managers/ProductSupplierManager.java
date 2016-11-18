package com.qac.row5project.managers;

import com.qac.row5project.entities.ProductSupplier;

public interface ProductSupplierManager {
	
	//CREATE - INVENTORY MANAGER ONLY
	public void createSupplierSuppliesProduct();	
	
	//READ - INVENTORY MANAGER ONLY
	public ProductSupplier readSupplierSuppliesProductByProductID(int pID);
	public ProductSupplier readSupplierSuppliesProductBySupplierID(int sID);

}
