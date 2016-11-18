package com.qac.row5project.entities;
import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment implements Serializable{
	private String Type;
	private String CardNumber;
	private Calendar ExpiryDate;
	private String NameOnCard;
	private String IssueNumber;
	private Customer Customer;
	private Address Address;
	@Id private int id;

	private static final long serialVersionUID = -2174734891446114791L;

	
	public Payment() {
	}

	public Payment(String Type, String CardNumber, Calendar ExpiryDate, String NameOnCard, String IssueNumber,
			Customer Customer, Address Address, int id) {
		this.Type = Type;
		this.CardNumber = CardNumber;
		this.ExpiryDate = ExpiryDate;
		this.NameOnCard = NameOnCard;
		this.IssueNumber = IssueNumber;
		this.Customer = Customer;
		this.Address = Address;
		this.id = id;
	}

	public String getType() {
		return this.Type;
	}

	public String getCardNumber() {
		return this.CardNumber;
	}

	public Calendar getExpiryDate() {
		return this.ExpiryDate;
	}

	public String getNameOnCard() {
		return this.NameOnCard;
	}

	public String IssueNumber() {
		return this.IssueNumber;
	}

	public Customer getCustomer() {
		return this.Customer;
	}

	public Address getAddress() {
		return this.Address;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	public void setCardNumber(String CardNumber) {
		this.CardNumber = CardNumber;
	}

	public void setExpiryDate(Calendar ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public void setNameOnCard(String NameOnCard) {
		this.NameOnCard = NameOnCard;
	}

	public void setIssueNumber(String IssueNumber) {
		this.IssueNumber = IssueNumber;
	}

	public void setCustomer(Customer Customer) {
		this.Customer = Customer;
	}

	public void setAddress(Address Address) {
		this.Address = Address;
	}

	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}

}
