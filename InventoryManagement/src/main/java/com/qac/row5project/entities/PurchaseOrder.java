package com.qac.row5project.entities;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PurchaseOrder")


//@NamedQuery(name = "FindByOrderID", query = "SELECT * FROM PurchaseOrder pO WHERE pO.Order_id = :Order_id")
//@NamedQuery(name = "FindBySupplierID", query = "SELECT * FROM PurchaseOrder pO WHERE pO.Supplier_id = :Supplier_id")
//@NamedQuery(name = "FindByStatus", query = "SELECT * FROM PurchaseOrder pO WHERE pO.Status = :Status")
//@NamedQuery(name = "FindBydatePlaced", query = "SELECT * FROM PurchaseOrder pO WHERE pO.datePlaced = :datePlaced")
//@NamedQuery(name = "FindBydateReceived", query = "SELECT * FROM PurchaseOrder pO WHERE pO.dateReceived = :dateReceived ")

/** 
 * Purchase Order object, to store all of the information related to the purchase order.
 * 
 * @author Richard Allen
 *
 */

public class PurchaseOrder {
	
	@Id
	@Column(name = "OrderID", nullable = false, unique = true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderID;
	
	@OneToOne
	@JoinColumn(name = "Supplier_id", nullable = false)
	@NotNull
	private Supplier supplierID;
	
	@Column(name = "Status", nullable = true)
	private String status;
	
	@Column(name = "datePlaced", nullable = true)
	private Calendar datePlaced;
	
	@Column(name = "dateReceived", nullable = true)
	private Calendar dateReceived;
	
	private List<Stock> stockList = new ArrayList<Stock>();

	/** 
	 * 
	 * @author Richard Allen
	 * Create a new purchase order with all the elements completed
	 * parameters
	 */
	public PurchaseOrder(int Order_id, Supplier Supplier_id, String status, Calendar datePlaced, Calendar dateReceived) {
		this.orderID= Order_id;
		this.supplierID= Supplier_id;
		this.status = status;
		this.datePlaced = datePlaced;
		this.dateReceived = dateReceived;
	}
	/** 
	 * 
	 * @author Richard Allen
	 * Create a new purchase order with only the order and supplier IDs
	 */
	public PurchaseOrder(int Order_id, Supplier Supplier_id) {
		this.orderID= Order_id;
		this.supplierID= Supplier_id;
	}

	/** 
	 * 
	 * @author Richard Allen
	 * @return the order ID
	 */
	//change
	public int getOrderID()
	{
		return this.orderID;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * Set the order ID
	 */
	public void setOrderID(int Order_id)
	{
		this.orderID= Order_id;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * @return the supplier ID
	 */
	public Supplier getSupplier_id()
	{
		return supplierID;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * Set the order ID
	 */
	public void setSupplierID(Supplier supplierID)
	{
		this.supplierID= supplierID;
	}
	/** 
	 * 
	 * @author Richard Allen
	 * @return the order status
	 */
	public String getstatus()
	{
		return this.status;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * set the order status
	 */
	public void setstatus(String status)
	{
		this.status = status;
	}
	/** 
	 * 
	 * @author Richard Allen
	 * @return the order placed date
	 */
	public Calendar getdatePlaced()
	{
		return this.datePlaced;
	}
	/** 
	 * 
	 * @author Richard Allen
	 * Set the date order was placed
	 */
	public void setdatePlaced(Calendar datePlaced)
	{
		this.datePlaced = datePlaced;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * @return date order was received
	 */
	public Calendar getdateReceived()
	{
		return this.dateReceived;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * Set the order date received
	 */
	public void setdateReceived(Calendar dateReceived)
	{
		this.dateReceived = dateReceived;
	}
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	
	public void addToStockList(Stock stock){
		this.stockList.add(stock);
	}
}
