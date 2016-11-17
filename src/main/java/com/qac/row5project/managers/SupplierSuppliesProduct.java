package com.qac.row5project.managers;

public interface SupplierSuppliesProduct {
	
	//CREATE - INVENTORY MANAGER ONLY
	public void createSupplierSuppliesProduct();	
	
	//READ - INVENTORY MANAGER ONLY
	public Supplier_Supplies_Product readSupplierSuppliesProductByProductID(int pID);
	public Supplier_Supplies_Product readSupplierSuppliesProductBySupplierID(int sID);

}
