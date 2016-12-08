/**
 * @Author RyanB
 */

package com.qac.row5project.entities;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CustomerOrder")
public class CustomerOrder {

	//JOINS ORDER ID, FEEDBACK ID AND CUSTOMER ID TOGETHER TO ENABLE REVIEWS TO BE RETRIEVED
	@OneToOne 
	@NotNull
	@JoinColumn(name = "customerOrderId", nullable = false, unique = true)
	private int customerOrderId;
	
	@OneToOne 
	@NotNull
	@JoinColumn(name = "feedbackId", nullable = false, unique = false)
	private int feedbackId;
	
	@OneToOne 
	@NotNull
	@JoinColumn(name = "customerId", nullable = false, unique = false)
	private long customerId;
	
	@OneToMany
	@NotNull
	@JoinColumn(name = "customerOrderLines", nullable = false, unique = false)
	private List<CustomerOrderLine> customerOrderLines = new ArrayList<>();

	//ADD Total Price - derived from order lines
	
	@OneToOne
	@NotNull
	@JoinColumn(name="totalPrice", nullable=false)
	private float totalPrice;
	
	private enum status {
		PLACED, PICKED, CHECKED, PACKED, DISPATCHED
	};

	private Calendar datePlaced;
	private Calendar dateReceived;
	private int addressId;
	private int paymentId;

	//NO-ARGS CONSTRUCTOR FOR A CUSTOMER ORDER
	public CustomerOrder() {
		customerOrderLines = new ArrayList<>();
	};
	
	
	public CustomerOrder(int customerOrderId, int customerId, Calendar datePlaced,int addressId) {
		super();
		this.customerOrderId = customerOrderId;
		this.customerId = customerId;
		this.datePlaced = datePlaced;
		this.addressId = addressId;

		this.paymentId = paymentId;
		customerOrderLines = new ArrayList<>();

		deriveTotalPrice();
		
	}
	//CONSTRUCTOR FOR CUSTOMER ORDER THAT TAKES ALL VARIABLES
	public CustomerOrder(int customerOrderId, int feedbackId, int customerId, Calendar datePlaced,int addressId) {
		super();
		this.customerOrderId = customerOrderId;
		this.feedbackId = feedbackId;
		this.customerId = customerId;
		this.datePlaced = datePlaced;
		this.addressId = addressId;

		this.paymentId = paymentId;
		customerOrderLines = new ArrayList<>();

		deriveTotalPrice();
	}
	public void deriveTotalPrice(){
		totalPrice=0;
		for (CustomerOrderLine customerOrderLine : customerOrderLines ) {
			totalPrice += customerOrderLine.getTotalPrice(); 
		}
	}
	
	
	//GETTERS AND SETTERS
	public void addToCustomerOrderLine(CustomerOrderLine cL){
		customerOrderLines.add(cL);
	}
	public void removeFromCustomerOrderLine(CustomerOrderLine cL){
		customerOrderLines.remove(cL);
	}
	public int getCustomerOrderId() {
		return customerOrderId;
	}

	public List<CustomerOrderLine> getCustomerOrderLines() {
		return customerOrderLines;
	}



	public float getTotalPrice() {
		deriveTotalPrice();
		return totalPrice;
	}

	public void setCustomerOrderLines(List<CustomerOrderLine> customerOrderLine) {
		this.customerOrderLines = customerOrderLine;
	}


	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long l) {
		this.customerId = l;
	}

	public Calendar getDatePlaced() {
		return datePlaced;
	}

	public void setDatePlaced(Calendar datePlaced) {
		this.datePlaced = datePlaced;
	}

	public Calendar getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(Calendar dateReceived) {
		this.dateReceived = dateReceived;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}



	@Override
	public String toString() {
		return "CustomerOrder [customerOrderId=" + customerOrderId + ", feedbackId=" + feedbackId + ", customerId="
				+ customerId + ", datePlaced=" + datePlaced + ", dateReceived=" + dateReceived + ", addressId="
				+ addressId + ", paymentId=" + paymentId + "]";
	}

}
