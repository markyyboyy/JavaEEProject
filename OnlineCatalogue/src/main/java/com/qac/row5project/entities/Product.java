/**
 *This represents the data associated with a product.
 * @Author RyanB
 */
package com.qac.row5project.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{
	
	//VARIABLES
	//id
	@Id private long productID;
	private String name;
	private String desc;
	private double price;
	private double weight;
	private String colour;
	private double size;
	private long supplierID;
	Category category;
	ItemStatus status;
	private static final long serialVersionUID = 7526472295622776147L;


	//NO ARGS CONSTRUCTOR FOR A PRODUCT
	public Product() {
	}
	
	//CONSTRUCTOR FOR PRODUCT THAT TAKES ALL VARIABLES
	public Product(long productID, String name, String desc, double price, double weight, String colour, double size,
			long supplierID, Category category, ItemStatus status) {
		this.productID = productID;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
		this.size = size;
		this.supplierID = supplierID;
		this.category = category;
	}

	//GETTERS AND SETTERS
	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public long getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(long supplierID) {
		this.supplierID = supplierID;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ItemStatus getStatus() {
		return status;
	}

	public void setStatus(ItemStatus status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	
}
