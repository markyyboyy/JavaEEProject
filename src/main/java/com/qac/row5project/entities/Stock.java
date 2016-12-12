package com.qac.row5project.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/***
 * This represents the data associated with a stock.
 * 
 * @author Ynyr Williams
 *
 */
@Entity
@Table(name="Stock")
public class Stock {
	
	//should stock id be generated if its the same as long
	
	//change to id
	@Id
	@Column(name="id", nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long stockID;
	@NotNull @Column(name="poroursware", nullable=false)
	private boolean porousware;
	@NotNull @Column(name="refurbished", nullable=false)
	private boolean refurbished;
	@NotNull @Column(name="quantity", nullable=false)
	private int quantity;
	//double
	@NotNull @Column(name="price", nullable=false)
	private double price;
	
	@ManyToOne 
	@NotNull @JoinColumn(name="productID", nullable=false)
	private long productID;
		
	public Stock(long stockID, boolean porousware, int quantity,boolean refurbished, long productID, double price) {
		super();
		this.stockID = stockID;
		this.porousware = porousware;
		this.refurbished = refurbished;
		this.quantity = quantity;
		this.productID = productID;
		this.price = price;
	}
	
	public Stock(long stockID, int quantity, boolean refurbished, long productID, double price) {
		super();
		this.porousware=false;
		this.stockID = stockID;
		this.refurbished = refurbished;
		this.quantity = quantity;
		this.productID = productID;
		this.price = price;
	}
	

	public Stock(long stockID, boolean porousware, int quantity, long productID, double price) {
		super();
		this.refurbished = false;
		this.porousware=porousware;
		this.stockID = stockID;
		this.porousware=porousware;
		this.quantity = quantity;
		this.productID = productID;
		this.price = price;
	}
	
	public Stock(long stockID, int quantity, long productID, double price) {
		super();
		this.porousware=false;
		this.refurbished=false;
		this.stockID = stockID;
		this.quantity = quantity;
		this.productID = productID;
		this.price = price;
	}

	public long getStockID() {
		return stockID;
	}
	public void setStockID(long stockID) {
		this.stockID = stockID;
	}
	public boolean isPorousware() {
		return porousware;
	}
	public void setPorousware(boolean porousware) {
		this.porousware = porousware;
	}
	public boolean isRefurbished() {
		return refurbished;
	}
	public void setRefurbished(boolean refurbished) {
		this.refurbished = refurbished;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", porousware=" + porousware + ", refurbished=" + refurbished
				+ ", quantity=" + quantity + ", productID=" + productID + "]";
	}
}
