/**
 *This represents the data associated with a product.
 * @Author RyanB
 */
package com.qac.row5project.entities;
import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment implements Serializable{
	
	//VARIABLES
	//id
	@Id private long productID;
	private String price;
	private Calendar duedate;
	private Customer customer;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ItemStatus getItemStatus() {
		return status;
	}

	public void setItemStatus(ItemStatus status) {
		this.status = status;
	}

	//NO ARGS CONSTRUCTOR FOR A PRODUCT
	public Payment() {
	}
	
	//CONSTRUCTOR FOR PRODUCT THAT TAKES ALL VARIABLES
	public Payment(String name, String desc, double price, double weight, String colour, double size,
			long supplierID, Category category, ItemStatus status) {
		
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
		this.size = size;
		this.supplierID = supplierID;
		this.category = category;
		this.status = status;
	}
}
