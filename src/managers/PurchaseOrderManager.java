
public interface PurchaseOrderManager {
	
	//CREATE - INVENTORY MANAGER ONLY
	public void createPurchaseOrder();	
	
	//READ - INVENTORY MANAGER ONLY
	public PurchaseOrder readByID(int pOrdID);
	public PurchaseOrder readBySupplier(int supID);
	public PurchaseOrder readByStatus(String status);
	public PurchaseOrder readByDatePlaced(Calendar datePlace);
	public PurchaseOrder readByDateReceived(Calendar dateRecd);
	
	//UPDATE - INVENTORY MANAGER ONLY
	public void updatePurchaseOrder(PurchaseOrder purchaseOrder);

	
	
}
