/**
 * @Author RyanB
 */

package com.qac.row5project.entities;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
	private int customerId;

	private enum status {
		PLACED, PICKED, CHECKED, PACKED, DISPATCHED
	};

	private Calendar datePlaced;
	private Calendar dateReceived;
	private int addressId;
	private int paymentId;

	//NO-ARGS CONSTRUCTOR FOR A CUSTOMER ORDER
	public CustomerOrder() {
	};
	
	

	//CONSTRUCTOR FOR CUSTOMER ORDER THAT TAKES ALL VARIABLES
	public CustomerOrder(int customerOrderId, int feedbackId, int customerId, Calendar datePlaced,int addressId, int paymentId) {
		super();
		this.customerOrderId = customerOrderId;
		this.feedbackId = feedbackId;
		this.customerId = customerId;
		this.datePlaced = datePlaced;
		this.addressId = addressId;
		this.paymentId = paymentId;

	}
	
	//GETTERS AND SETTERS
	public int getCustomerOrderId() {
		return customerOrderId;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	@Override
	public String toString() {
		return "CustomerOrder [customerOrderId=" + customerOrderId + ", feedbackId=" + feedbackId + ", customerId="
				+ customerId + ", datePlaced=" + datePlaced + ", dateReceived=" + dateReceived + ", addressId="
				+ addressId + ", paymentId=" + paymentId + "]";
	}

}
