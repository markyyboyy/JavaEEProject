package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.PurchaseOrderManager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/** 
 * 
 * @author Richard Allen & Ynyr Williams
 *
 */

@Stateless
@Default
public class PurchaseOrderOffline implements PurchaseOrderManager {

	@Inject
	private TestData testData;

	// CREATE - INVENTORY MANAGER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * Create a new purchase order
	 */
	@Override
	public void createPurchaseOrder(PurchaseOrder newPOrder) {
		List<PurchaseOrder> pOrders = testData.getPurchaseOrders();
		newPOrder.setOrder_idOrder(pOrders.size() + 1);
		pOrders.add(newPOrder);
		testData.setPurchaseOrders(pOrders);
		
	}

	// READ - INVENTORY MANAGER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * @return the purchase order with a certain ID or return null if no order exists
	 */
	@Override
	public PurchaseOrder readByID(int pOrdID) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getOrder_id() == pOrdID) {
				return purchaseOrder;
			}
		}
		return null;
		
	}
	/** 
	 * 
	 * @author Richard Allen
	 * @return purchase order by supplier ID
	 */
	@Override
	public PurchaseOrder readBySupplier(int supID) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getSupplier_id().getIdSupplier() == supID) {
				return purchaseOrder;
			}
		}
		return null;
		
	}
	/** 
	 * 
	 * @author Richard Allen
	 * @return purchase order by current status
	 */
	@Override
	public PurchaseOrder readByStatus(String status) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getstatus() == status) {
				return purchaseOrder;
			}
		}
		return null;
		
	}

	/** 
	 * 
	 * @author Richard Allen
	 * @return the purchase order by date placed
	 */
	@Override
	public PurchaseOrder readByDatePlaced(Calendar datePlaced) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getdatePlaced() == datePlaced) {
				return purchaseOrder;
			
			}
		}
		return null;
		
	}
	/** 
	 * 
	 * @author Richard Allen
	 * @return purchase order by date order was received
	 */
	@Override
	public PurchaseOrder readByDateReceived(Calendar dateRecd) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getdateReceived() == dateRecd) {
				return purchaseOrder;
			}	
		}
		return null;
		
	}
	/** 
	 * 
	 * @author Richard Allen
	 * Update a purchase order
	 */
	// UPDATE - INVENTORY MANAGER ONLY
	@Override
	public void updatePurchaseOrder(PurchaseOrder newPOrder) {
		List<PurchaseOrder> pOrders = testData.getPurchaseOrders();
		pOrders.add(newPOrder);
		testData.setPurchaseOrders(pOrders);
	}

}
