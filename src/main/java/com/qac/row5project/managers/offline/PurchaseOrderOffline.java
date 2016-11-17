package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.PurchaseOrderManager;

import java.util.Calendar;
import java.util.List;

@Stateless
@Default
public class PurchaseOrderOffline implements PurchaseOrderManager {

	@Inject
	private TestData testData;

	// CREATE - INVENTORY MANAGER ONLY
	@Override
	public void createPurchaseOrder(PurchaseOrder newPOrder) {
		List<PurchaseOrder> pOrders = testData.getPurchaseOrders();
		newPOrder.setOrder_idOrder(pOrders.size() + 1);
		pOrders.add(newPOrder);
		testData.setPurchaseOrders(pOrders);
		
	}

	// READ - INVENTORY MANAGER ONLY
	@Override
	public PurchaseOrder readByID(int pOrdID) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getOrder_id() == pOrdID) {
				return purchaseOrder;
			}
		}
		return null;
		
	}

	@Override
	public PurchaseOrder readBySupplier(int supID) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getSupplier_id().getIdSupplier() == supID) {
				return purchaseOrder;
			}
		}
		return null;
		
	}

	@Override
	public PurchaseOrder readByStatus(String status) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getstatus() == status) {
				return purchaseOrder;
			}
		}
		return null;
		
	}

	@Override
	public PurchaseOrder readByDatePlaced(Calendar datePlaced) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getdatePlaced() == datePlaced) {
				return purchaseOrder;
			
			}
		}
		return null;
		
	}

	@Override
	public PurchaseOrder readByDateReceived(Calendar dateRecd) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrders()) {
			if (purchaseOrder.getdateReceived() == dateRecd) {
				return purchaseOrder;
			}	
		}
		return null;
		
	}

	// UPDATE - INVENTORY MANAGER ONLY
	@Override
	public void updatePurchaseOrder(PurchaseOrder newPOrder) {
		List<PurchaseOrder> pOrders = testData.getPurchaseOrders();
		pOrders.add(newPOrder);
		testData.setPurchaseOrders(pOrders);

	}

}
