import java.util.Date;

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

	public int getOrder_idOrder()
	{
		return this.Order_idOrder;
	}
	
	public void setOrder_idOrder(int Order_idOrder)
	{
		this.Order_idOrder = Order_idOrder;
	}
	
	public Supplier getSupplier_idSupplier()
	{
		return this.Supplier_idSupplier;
	}
	
	public void setSupplier_idSupplier(Supplier Supplier_idSupplier)
	{
		this.Supplier_idSupplier = Supplier_idSupplier;
	}
	
	public String getstatus()
	{
		return this.status;
	}
	
	public void setstatus(String status)
	{
		this.status = status;
	}
	
	public Date getdatePlaced()
	{
		return this.datePlaced;
	}
	
	public void setdatePlaced(Date datePlaced)
	{
		this.datePlaced = datePlaced;
	}
	
	public Date getdateReceived()
	{
		return this.dateReceived;
	}
	
	public void setdateReceived(Date dateReceived)
	{
		this.dateReceived = dateReceived;
	}

}
