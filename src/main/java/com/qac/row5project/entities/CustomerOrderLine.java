
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

/**
 * 
 * @author Iman Hassan & Ynyr Williams
 *
 */
@Entity
@Table(name="CustomerOrderLine")
public class CustomerOrderLine {
	
	@Id
	@Column(nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Size(min=3, max=225)
	@Column(name="quantity", nullable=false)
	@NotNull
	private int quantity;
	
	@Size(min=5, max=12)
	@Column(name="totalPrice", nullable = false)
	@NotNull
	private float totalPrice;
		

	@ManyToOne
	@JoinColumn(name="stock", nullable=false)
	@NotNull
	private Stock stock;

	/**
	 * Constructor with no arguments
	 */
	public CustomerOrderLine() {
	}

	/**
	 * Constructor for each variable
	 * @param id
	 * @param quantity
	 * @param stock
	 */
	public CustomerOrderLine(long id, int quantity, Stock stock) {
		this.id = id;
		this.quantity = quantity;
		this.stock = stock;
		updateTotalPrice();
	}

	/**
	 * 
	 * @return Getters and Setters
	 */
	public long getId() {
		return id;
	}
	
	public int getQuantity() {
		return quantity;
	}

	/**
	 * A method to get the total price
	 * Total price is updated before being called
	 */
	public float getTotalPrice() {
		updateTotalPrice();
		return totalPrice;
	}
	
	/**
	 * This is a method get stock
	 * @return
	 */
	public Stock getStock() {
		return stock;
	}

	/**
	 * Method to set the Id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * A derived method to get total price from stock 
	 */
	public void updateTotalPrice() {
		totalPrice = stock.getPrice() * stock.getQuantity();
	}
	
	/**
	 * A method to 
	 * @param stock
	 */
	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
