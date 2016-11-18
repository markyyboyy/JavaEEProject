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

@Entity
@Table(name="Stock")
public class Stock {
	
	//should stock id be generated if its the same as product
	@Id
	@Column(name="id", nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int stockID;
	@NotNull @Column(name="poroursware", nullable=false)
	private boolean porousware;
	@NotNull @Column(name="refurbished", nullable=false)
	private boolean refurbished;
	@NotNull @Column(name="quantity", nullable=false)
	private int quantity;
	
	//does this need to be changed to Product isntead of int
	@ManyToOne 
	@NotNull @JoinColumn(name="productID", nullable=false)
	private int productID;
		
	public Stock(int stockID, boolean porousware, int quantity,boolean refurbished, int productID) {
		super();
		this.stockID = stockID;
		this.porousware = porousware;
		this.refurbished = refurbished;
		this.quantity = quantity;
		this.productID = productID;
	}
	
	public Stock(int stockID, int quantity, boolean refurbished, int productID) {
		super();
		this.porousware=false;
		this.stockID = stockID;
		this.refurbished = refurbished;
		this.quantity = quantity;
		this.productID = productID;
	}
	

	public Stock(int stockID, boolean porousware, int quantity, int productID) {
		super();
		this.refurbished = false;
		this.porousware=porousware;
		this.stockID = stockID;
		this.porousware=porousware;
		this.quantity = quantity;
		this.productID = productID;
	}
	
	public Stock(int stockID, int quantity, int productID) {
		super();
		this.porousware=false;
		this.refurbished=false;
		this.stockID = stockID;
		this.quantity = quantity;
		this.productID = productID;
	}

	public int getStockID() {
		return stockID;
	}
	public void setStockID(int stockID) {
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
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", porousware=" + porousware + ", refurbished=" + refurbished
				+ ", quantity=" + quantity + ", productID=" + productID + "]";
	}
}