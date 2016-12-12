package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.managers.PurchaseOrderManager;
import com.qac.services.IMSPurchaseService;


/**
 * @Author Richard Allen
 */
@Named("purchaseOrder")
@RequestScoped
public class PurchaseOrderController {
	
	@Inject
	private IMSPurchaseService purchaseService;
	
	@Inject
	private PurchaseOrderManager purchaseManager;
	
	
	private List<PurchaseOrder> purchaseList = new ArrayList<>();
	

	public List<PurchaseOrder> getPurchaseList() {
		purchaseList = purchaseManager.returnPurchaseOrders();
		
		if(purchaseList.size() == 0)
		{
			return null;
		}
		else{
			return purchaseList;
		}
	}

	public void setPurchaseList(List<PurchaseOrder> purchaseList) {
		this.purchaseList = purchaseList;
	}

}
