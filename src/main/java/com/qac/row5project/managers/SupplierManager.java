package com.qac.row5project.managers;

import com.qac.row5project.entities.Supplier;

public interface SupplierManager {
	
	//CREATE - Inventory Manager Only
	public Supplier createSupplier(Supplier supplier);
	
	//READ - Inventory Manager Only
	public Supplier readByIdSupplier(int idSupplier);
}
