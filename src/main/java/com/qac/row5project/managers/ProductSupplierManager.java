package com.qac.row5project.managers;

import com.qac.row5project.entities.ProductSupplier;

/** 
 * 
 * @author Richard Allen & Ynyr Williams
 *
 */

public interface ProductSupplierManager {
	
	//CREATE - INVENTORY MANAGER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * Create new supplier with an ID 
	 * 
	 */
	public void createProductSupplier(ProductSupplier p);	
	
	//READ - INVENTORY MANAGER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * @return supplier by product ID
	 */
	public ProductSupplier readProductSupplierByProductID(int pID);
	/** 
	 * 
	 * @author Richard Allen
	 * @return Supplier by supplier ID
	 */
	public ProductSupplier readProductSupplierBySupplierID(int sID);

}
