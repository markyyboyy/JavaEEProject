package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import java.util.List;

@Stateless
@Default
public class PurchaseOrderOffline implements PurchaseOrderManager {

	@Inject
	private TestData testData;

	// CREATE - INVENTORY MANAGER ONLY
	@Override
	public void createPurchaseOrder(PurchaseOrder newPOrder) {
		List<PurchaseOrder> pOrders = testData.getPurchaseOrder();
		newPOrder.setOrder_idOrder(pOrders.size() + 1);
		pOrders.add(newPorder);
		testData.setPurchaseOrder();
		
	}

	// READ - INVENTORY MANAGER ONLY
	@Override
	public PurchaseOrder readByID(int pOrdID) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrder()) {
			if (purchaseOrder.getOrder_id() == pOrdID) {
				return purchaseOrder;
			}
			return null;
		}
	}

	@Override
	public PurchaseOrder readBySupplier(int supID) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrder()) {
			if (purchaseOrder.getSupplier_id() == supID) {
				return purchaseOrder;
			}
			return null;
		}
	}

	@Override
	public PurchaseOrder readByStatus(String status) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrder()) {
			if (purchaseOrder.getstatus() == status) {
				return purchaseOrder;
			}
			return null;
		}
	}

	@Override
	public PurchaseOrder readByDatePlaced(Calendar datePlaced) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrder()) {
			if (purchaseOrder.getdatePlaced() == datePlaced) {
				return purchaseOrder;
			}
			return null;
		}
	}

	@Override
	public PurchaseOrder readByDateReceived(Calendar dateRecd) {
		for (PurchaseOrder purchaseOrder : testData.getPurchaseOrder()) {
			if (purchaseOrder.getdateReceived() == dateRecd) {
				return purchaseOrder;
			}
			return null;
		}
	}

	// UPDATE - INVENTORY MANAGER ONLY
	@Override
	public void updatePurchaseOrder(PurchaseOrder newPOrder) {
		PurchaseOrder existingPOrder = readByID(newPorder.getOrder_id());
		existingPOrder.setSupplier_idSupplier(newPOrder.getSupplier_id());
		existingPOrder.setstatus(newPOrder.getstatus());
		existingPOrder.setdatePlaced(newPOrder.getdatePlaced());
		existingPOrder.setdateReceived(newPOrder.getdateReceived());

	}

}
