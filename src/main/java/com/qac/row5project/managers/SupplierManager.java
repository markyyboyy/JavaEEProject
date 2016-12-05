package com.qac.row5project.managers;

import com.qac.row5project.entities.Supplier;

/**
 * 
 * @author Iman Hassan
 *
 */
public interface SupplierManager {
	
	/**
	 * CREATE - Inventory Manager Only
	 * A method to create a new supplier
	 * @param supplier
	 * @return
	 */
	public Supplier createSupplier(Supplier supplier);
	
	/**
	 * READ - Inventory Manager Only
	 * A method to read the supplier id
	 * @param idSupplier
	 * @return
	 */
	public Supplier readByIdSupplier(int idSupplier);
}
