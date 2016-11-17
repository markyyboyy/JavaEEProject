package com.qac.row5project.managers;

import com.qac.row5project.entities.Address;
import com.qac.row5project.entities.Customer;

public interface PaymentManager {
	//CREATE - Customer Only
	public void createPayment(PaymentManager payment);
	
	//READ - Customer Only
	public PaymentManager readPayment(int ID);
	public PaymentManager readPaymentCard(String cardNumber);
	public PaymentManager readPaymentIssueNumber(String issueNumber);
	
	//UPDATE - Customer Only
	public void updatePayment(PaymentManager payment);
	
	//Methods
	public Customer findCustomer(int ID);
	public Address findAddress(int ID);
}
