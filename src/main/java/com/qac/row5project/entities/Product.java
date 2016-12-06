/**
 * @Author RyanB
 */
package com.qac.row5project.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{
	
	//VARIABLES
	@Id private int productId;
	private String name;
	private String desc;
	private double price;
	private double weight;
	private String colour;
	private int size;
	private int quantity;
	private String category;
	private String status;
	private static final long serialVersionUID = 7526472295622776147L;

	private enum status {
		COMINGSOON, ACTIVE, DISCONTINUED
	}

	//NO ARGS CONSTRUCTOR FOR A PRODUCT
	public Product() {
	}
	
	//CONSTRUCTOR FOR PRODUCT THAT TAKES ALL VARIABLES
	public Product(String name, String desc, double price, double weight, String colour, int size,
			int quantity, String category, String status) {
		
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
		this.size = size;
		this.quantity = quantity;
		this.category = category;
		this.status = status;
	}

	//GETTERS AND SETTERS
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
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
	
	public int getCategory() {
		return quantity;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getStatus() {
		return quantity;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
