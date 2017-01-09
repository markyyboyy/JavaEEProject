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
	
	//should stock id be generated if its the same as product
	
	//change to id
	@Id
	@Column(name="id", nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long id;
	@NotNull @Column(name="poroursware", nullable=false)
	private boolean porousware;
	@NotNull @Column(name="refurbished", nullable=false)
	private boolean refurbished;
	@NotNull @Column(name="quantity", nullable=false)
	private int quantity;
	//double
	@NotNull @Column(name="price", nullable=false)
	private float price;
	//does this need to be changed to Product instead of int
	//change to long
	@ManyToOne 
	@NotNull @JoinColumn(name="productID", nullable=false)
	
	//CHANGE OF NAME vvv
	private Product productID;
	//TODO
	
	//java dog for parameters
	public Stock(long id, boolean porousware, int quantity,boolean refurbished, Product productID, float price) {
		super();
		this.id = id;
		this.porousware = porousware;
		this.refurbished = refurbished;
		this.quantity = quantity;
		this.productID = productID;
		this.price = price;
	}
	
	public Stock(long id, int quantity, boolean refurbished, Product productID, float price) {
		super();
		this.porousware=false;
		this.id = id;
		this.refurbished = refurbished;
		this.quantity = quantity;
		this.productID = productID;
		this.price = price;
	}
	

	public Stock(long id, boolean porousware, int quantity, Product productID, float price) {
		super();
		this.refurbished = false;
		this.porousware=porousware;
		this.id = id;
		this.porousware=porousware;
		this.quantity = quantity;
		this.productID = productID;
		this.price = price;
	}
	
	public Stock(long id, int quantity, Product productID, float price) {
		super();
		this.porousware=false;
		this.refurbished=false;
		this.id = id;
		this.quantity = quantity;
		this.productID = productID;
		this.price = price;
	}

	public long getID() {
		return id;
	}
	public void setID(long id) {
		this.id = id;
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
	public Product getProductID() {
		return productID;
	}
	public void setProductID(Product productID) {
		this.productID = productID;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", porousware=" + porousware + ", refurbished=" + refurbished
				+ ", quantity=" + quantity + ", productID=" + productID + "]";
	}
}
