/**
 * @author Mark Freeman
 */
package com.qac.row5project.managers;

import com.qac.row5project.entities.Payment;

public interface PaymentManager {
	/**
	We want to create, read and update employees
	 */
	//CREATE - Customer Only
	public void createPayment(Payment payment);
	
	//READ - Customer Only
	public Payment readPayment(int ID);
	public Payment readPaymentCard(String cardNumber);
	
	//UPDATE - Customer Only
	public void updatePayment(Payment payment);
}
