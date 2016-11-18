package com.qac.row5project.managers;

import com.qac.row5project.entities.ProductSupplier;

public interface ProductSupplierManager {
	
	//CREATE - INVENTORY MANAGER ONLY
	public void createProductSupplier(ProductSupplier p);	
	
	//READ - INVENTORY MANAGER ONLY
	public ProductSupplier readProductSupplierByProductID(int pID);
	public ProductSupplier readProductSupplierBySupplierID(int sID);

}
