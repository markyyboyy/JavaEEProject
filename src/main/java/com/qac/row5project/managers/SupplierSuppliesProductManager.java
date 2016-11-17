package com.qac.row5project.managers;

import com.qac.row5project.entities.Supplier_Supplies_Product;

public interface SupplierSuppliesProductManager {
	
	//CREATE - INVENTORY MANAGER ONLY
	public void createSupplierSuppliesProduct(Supplier_Supplies_Product newSSP);	
		
	//READ - INVENTORY MANAGER ONLY
	public Supplier_Supplies_Product readSupplierSuppliesProductByProductID(int pID);
	public Supplier_Supplies_Product readSupplierSuppliesProductBySupplierID(int sID);

}
