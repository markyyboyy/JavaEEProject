package com.qac.row5project.managers;
public interface SupplierManager {
	
	//CREATE - Inventory Manager Only
	public void createSupplier(Supplier supplier);
	
	//READ - Inventory Manager Only
	public Supplier readByIdSupplier(int idSupplier);
}
