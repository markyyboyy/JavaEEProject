package com.qac.row5project.managers;

import com.qac.row5project.entities.Address;
import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.Payment;

public interface PaymentManager {
	//CREATE - Customer Only
	public void createPayment(Payment payment);
	
	//READ - Customer Only
	public Payment readPayment(int ID);
	public Payment readPaymentCard(String cardNumber);
	
	//UPDATE - Customer Only
	public void updatePayment(Payment payment);
	//Methods
	//public Customer findCustomer(int ID);
	//public Address findAddress(int ID);
}
