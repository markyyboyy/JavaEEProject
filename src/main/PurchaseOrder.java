
public class PurchaseOrder {

	private int Order_idOrder;
	private Supplier Supplier_idSupplier;
	private String status;
	private Date datePlaced;
	private Date dateReceived;

	public PurchaseOrder() {
	}

	public PurchaseOrder(int Order_idOrder, Supplier Supplier_idSupplier, String status, Date datePlaced, Date dateReceived) {
		this.Order_idOrder = Order_idOrder;
		this.Supplier_idSupplier = Supplier_idSupplier;
		this.status = status;
		this.datePlaced = datePlaced;
		this.dateReceived = dateReceived;
	}
	
	public PurchaseOrder(int Order_idOrder, Supplier Supplier_idSupplier) {
		this.Order_idOrder = Order_idOrder;
		this.Supplier_idSupplier = Supplier_idSupplier;
	}

	public getOrder_idOrder()
	{
		return this.Order_idOrder;
	}
	
	public setOrder_idOrder(int Order_idOrder)
	{
		this.Order_idOrder = Order_idOrder;
	}
	
	public getSupplier_idSupplier()
	{
		return this.Supplier_idSupplier;
	}
	
	public setOrder_idOrder(int Supplier Supplier_idSupplier)
	{
		this.Supplier_idSupplier = Supplier_idSupplier;
	}
	
	public getstatus()
	{
		return this.status;
	}
	
	public setstatus(int String status)
	{
		this.status = status;
	}
	
	public getdatePlaced()
	{
		return this.datePlaced;
	}
	
	public setdatePlaced(int Date datePlaced)
	{
		this.datePlaced = datePlaced;
	}
	
	public getdateReceived()
	{
		return this.dateReceived;
	}
	
	public setdateReceived(int Date dateReceived)
	{
		this.dateReceived = dateReceived;
	}

}
