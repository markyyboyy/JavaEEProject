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

	//ADD Total Price - derived from order lines
	
	@OneToOne
	@NotNull
	@JoinColumn(name="totalPrice", nullable=false)
	private double totalPrice;
	
	//MOVE ENUM
	private enum status {
		PLACED, PICKED, CHECKED, PACKED, DISPATCHED
	};

	private Calendar datePlaced;
	private Calendar dateReceived;
	private long addressID;
	private long paymentID;

	//NO-ARGS CONSTRUCTOR FOR A CUSTOMER ORDER V1
	public CustomerOrder() {
		customerOrderLines = new ArrayList<>();
	};
	
	//CONSTRUCTOR V2
	public CustomerOrder(long customerOrderID, long customerID, Calendar datePlaced, long addressID) {
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
	
	//BIG D ;) LONG, DOUBLE
	public CustomerOrder(int customerOrderId, int feedbackId, int customerId, Calendar datePlaced,int addressId) {
		super();
		this.id = customerOrderId;
		this.feedbackID = feedbackId;
		this.customerID = customerId;
		this.datePlaced = datePlaced;
		this.addressId = addressId;

		this.paymentId = paymentId;
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
	public int getCustomerOrderId() {
		return id;
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
		this.id = customerOrderId;
	}

	public int getFeedbackId() {
		return feedbackID;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackID = feedbackId;
	}

	public long getCustomerId() {
		return customerID;
	}

	public void setCustomerId(long l) {
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

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "CustomerOrder [customerOrderId=" + id + ", feedbackId=" + feedbackID + ", customerId="
				+ customerID + ", datePlaced=" + datePlaced + ", dateReceived=" + dateReceived + ", addressId="
				+ addressId + ", paymentId=" + paymentId + "]";
	}

}
