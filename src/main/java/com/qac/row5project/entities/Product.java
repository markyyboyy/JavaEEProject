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
	@Id private long productId;
	private String name;
	private String desc;
	private double price;
	private double weight;
	private String colour;
	//double size
	private int size;
	//get rid
	private int quantity;
	//enum
	private String category;
	private String status;
	private Supplier supplier;
	private static final long serialVersionUID = 7526472295622776147L;


	//NO ARGS CONSTRUCTOR FOR A PRODUCT
	public Product() {
	}
	
	//CONSTRUCTOR FOR PRODUCT THAT TAKES ALL VARIABLES
	public Product(String name, String desc, double price, double weight, String colour, int size,
			int quantity, String category, String status, Supplier supplier) {
		
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
		this.size = size;
		this.quantity = quantity;
		this.category = category;
		this.status = status;
		this.supplier = supplier;
	}

	//GETTERS AND SETTERS
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
}
