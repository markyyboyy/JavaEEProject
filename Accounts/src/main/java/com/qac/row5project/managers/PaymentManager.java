/**
 * @author Mark Freeman
 */
package com.qac.row5project.managers;

import java.util.List;

import com.qac.row5project.entities.Payment;

public interface PaymentManager {
	public List<Payment> readPayments();
	public List<Payment> readPaidPayments();
	public List<Payment> readUnpaidPayments();
}
