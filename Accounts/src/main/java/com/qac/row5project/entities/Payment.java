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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//VARIABLES
	//id
	@Id private long productID;
	private String price;
	private Calendar duedate;
	private Customer customer;
	private String paidStatus;
	private CustomerOrder customerOrder;
	
	//CONSTRUCTOR FOR PRODUCT THAT TAKES ALL VARIABLES
	public Payment(String price, Calendar dueDate, Customer customer, String paidStatus, CustomerOrder customerOrder) {
		this.price = price;
		this.duedate = dueDate;
		this.customer = customer;
		this.setPaidStatus(paidStatus);
		this.setCustomerOrder(customerOrder);
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Calendar getDuedate() {
		return duedate;
	}

	public void setDuedate(Calendar duedate) {
		this.duedate = duedate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getPaidStatus() {
		return paidStatus;
	}

	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}

	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
}