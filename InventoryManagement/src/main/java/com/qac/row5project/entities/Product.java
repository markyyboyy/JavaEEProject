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
	private Supplier supplier;
	private static final long serialVersionUID = 7526472295622776147L;


	//NO ARGS CONSTRUCTOR FOR A PRODUCT
	public Product() {
	}
	
	//CONSTRUCTOR FOR PRODUCT THAT TAKES ALL VARIABLES
	public Product(String name, String desc, double price, double weight, String colour, double size,
			Supplier supplier, Category category, ItemStatus status) {
		
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
		this.size = size;
		this.supplier = supplier;
	}

	//GETTERS AND SETTERS
	public long getProductID() {
		return productID;
	}

	public void setProductID(long productId) {
		this.productID = productId;
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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Product [supplier=" + supplier + "]";
	}
	
}
