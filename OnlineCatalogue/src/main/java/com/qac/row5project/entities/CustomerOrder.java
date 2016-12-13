/**
 *CUSTOMERORDER HOLDS ALL OF THE INFORMATION REGARDING AN INDIVIDUAL CUSTOMER ORDER
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
	private long id;
	
	@OneToOne 
	@NotNull
	@JoinColumn(name = "feedbackId", nullable = false, unique = false)
	private long feedbackID;
	
	@OneToOne 
	@NotNull
	@JoinColumn(name = "customerId", nullable = false, unique = false)
	private long customerID;
	
	@OneToMany
	@NotNull
	@JoinColumn(name = "customerOrderLines", nullable = false, unique = false)
	private List<CustomerOrderLine> customerOrderLines = new ArrayList<>();
	
	@OneToOne
	@NotNull
	@JoinColumn(name="totalPrice", nullable=false)
	
	private double totalPrice;
	private Calendar datePlaced;
	private Calendar dateReceived;
	private long addressID;
	private long paymentID;


	//NO-ARGS CONSTRUCTOR FOR A CUSTOMER ORDER V1
	public CustomerOrder() {
		customerOrderLines = new ArrayList<>();
	};
	
	//CONSTRUCTOR V2
	public CustomerOrder(long customerOrderID, long customerID, Calendar datePlaced, long addressID, long paymentID) {
		super();
		this.id = customerOrderID;
		this.customerID = customerID;
		this.datePlaced = datePlaced;
		this.addressID = addressID;
		this.paymentID = paymentID;
		
		customerOrderLines = new ArrayList<>();

		deriveTotalPrice();
		
	}
	//CONSTRUCTOR V3
	
	public long getAddressID() {
		return addressID;
	}

	public void setAddressID(long addressID) {
		this.addressID = addressID;
	}

	public long getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(long paymentID) {
		this.paymentID = paymentID;
	}

	public void setFeedbackID(long feedbackID) {
		this.feedbackID = feedbackID;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	//BIG D ;) LONG, DOUBLE
	public CustomerOrder(long customerOrderID, long feedbackID, long customerID, Calendar datePlaced,long addressID) {
		super();
		this.id = customerOrderID;
		this.feedbackID = feedbackID;
		this.customerID = customerID;
		this.datePlaced = datePlaced;
		this.addressID = addressID;
		customerOrderLines = new ArrayList<>();

		deriveTotalPrice();
	}
/**
 * ADDS ALL PRICES ON THE ORDER AND RETURNS A TOTALCOST
 */
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
	
	/**00
	 * 
	 * @param cL
	 */
	public void removeFromCustomerOrderLine(CustomerOrderLine cL){
		customerOrderLines.remove(cL);
	}
	public List<CustomerOrderLine> getCustomerOrderLines() {
		return customerOrderLines;
	}

	public double getTotalPrice() {
		deriveTotalPrice();
		return totalPrice;
	}

	public void setCustomerOrderLines(List<CustomerOrderLine> customerOrderLine) {
		this.customerOrderLines = customerOrderLine;
	}


	public void setCustomerOrderId(int customerOrderId) {
		this.id = customerOrderId;
	}

	public long getFeedbackID() {
		return feedbackID;
	}

	public void setFeedbackID(int fID) {
		this.feedbackID = fID;
	}

	public long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(long l) {
		this.customerID = l;
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


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CustomerOrder [customerOrderId=" + id + ", feedbackId=" + feedbackID + ", customerId="
				+ customerID + ", datePlaced=" + datePlaced + ", dateReceived=" + dateReceived + ", addressId="
				+ addressID + ", paymentId=" + paymentID + "]";
	}

}
