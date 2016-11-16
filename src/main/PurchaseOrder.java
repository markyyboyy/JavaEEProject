import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "purchaseOrder")

public class PurchaseOrder {

	@Id
	@Column(name = "Order_idOrder", nullable = false, unique = true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Order_idOrder;
	
	@OneToOne
	@JoinColumn(name = "Supplier_idSupplier", nullable = false)
	@NotNull
	private Supplier Supplier_idSupplier;
	
	@Column(name = "Supplier_idSupplier", nullable = true)
	private String status;
	
	@Column(name = "datePlaced", nullable = true)
	private Date datePlaced;
	
	@Column(name = "dateReceived", nullable = true)
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
