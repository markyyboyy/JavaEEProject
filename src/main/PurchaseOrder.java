import java.util.Calendar;

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
	private int Order_id;
	
	@OneToOne
	@JoinColumn(name = "Supplier_id", nullable = false)
	@NotNull
	private Supplier Supplier_id;
	
	@Column(name = "Supplier_idSupplier", nullable = true)
	private String status;
	
	@Column(name = "datePlaced", nullable = true)
	private Calendar datePlaced;
	
	@Column(name = "dateReceived", nullable = true)
	private Calendar dateReceived;

	public PurchaseOrder() {
	}

	public PurchaseOrder(int Order_id, Supplier Supplier_id, String status, Date datePlaced, Date dateReceived) {
		this.Order_id= Order_id;
		this.Supplier_id= Supplier_id;
		this.status = status;
		this.datePlaced = datePlaced;
		this.dateReceived = dateReceived;
	}
	
	public PurchaseOrder(int Order_id, Supplier Supplier_id) {
		this.Order_id= Order_id;
		this.Supplier_id= Supplier_id;
	}

	public int getOrder_idOrder()
	{
		return this.Order_id;
	}
	
	public void setOrder_idOrder(int Order_id)
	{
		this.Order_id= Order_id;
	}
	
	public Supplier getSupplier_id()
	{
		return this.Supplier_id;
	}
	
	public void setSupplier_idSupplier(Supplier Supplier_id)
	{
		this.Supplier_id= Supplier_id;
	}
	
	public String getstatus()
	{
		return this.status;
	}
	
	public void setstatus(String status)
	{
		this.status = status;
	}
	
	public Calendar getdatePlaced()
	{
		return this.datePlaced;
	}
	
	public void setdatePlaced(Calendar datePlaced)
	{
		this.datePlaced = datePlaced;
	}
	
	public Calendar getdateReceived()
	{
		return this.dateReceived;
	}
	
	public void setdateReceived(Calendar dateReceived)
	{
		this.dateReceived = dateReceived;
	}

}
