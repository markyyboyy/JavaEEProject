package com.qac.row5project.managers;

import java.util.Calendar;

import com.qac.row5project.entities.PurchaseOrder;

/** 
 * 
 * @author Richard Allen
 *
 */

public interface PurchaseOrderManager {
	
	//CREATE - INVENTORY MANAGER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * Create a new purchase order
	 */
	public void createPurchaseOrder(PurchaseOrder newPOrder);	
	
	//READ - INVENTORY MANAGER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * @return PurchaseOrder
	 * Find a purchase order by ID
	 */
	public PurchaseOrder readByID(int pOrdID);
	/** 
	 * 
	 * @author Richard Allen
	 * @return PurchaseOrder]
	 * Find a purchase order by supplier ID
	 */
	public PurchaseOrder readBySupplier(int supID);
	/** 
	 * 
	 * @author Richard Allen
	 * @return Purchase Order
	 * Find purchase order by the status of the order
	 */
	public PurchaseOrder readByStatus(String status);
	/** 
	 * 
	 * @author Richard Allen
	 * @return Purchase Order
	 * Find purchase order by the date placed
	 */
	public PurchaseOrder readByDatePlaced(Calendar datePlace);
	/** 
	 * 
	 * @author Richard Allen
	 * @return Purchase Order
	 * Find purchase order by the date received
	 */
	public PurchaseOrder readByDateReceived(Calendar dateRecd);
	
	//UPDATE - INVENTORY MANAGER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * Update an existing purchase order
	 */
	public void updatePurchaseOrder(PurchaseOrder purchaseOrder);

	
	
}
