package com.qac.row5project.managers;

import com.qac.row5project.entities.ProductSupplier;

public interface SupplierSuppliesProductManager {
	
	//CREATE - INVENTORY MANAGER ONLY
	public void createSupplierSuppliesProduct(ProductSupplier newSSP);	
		
	//READ - INVENTORY MANAGER ONLY
	public ProductSupplier readSupplierSuppliesProductByProductID(int pID);
	public ProductSupplier readSupplierSuppliesProductBySupplierID(int sID);

}
