/**
 * @author Mark Freeman
 */
package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Employee;
import com.qac.row5project.entities.Payment;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.EmployeeManager;
import com.qac.row5project.managers.PaymentManager;

@Stateless
@Default
public class PaymentManagerOffline implements PaymentManager {
    @Inject
    TestDataIMS testData;

	@Override
	public List<Payment> readPayments() {
		// TODO Auto-generated method stub
		return testData.getPayments();
	}

	@Override
	public List<Payment> readPaidPayments() {
		// TODO Auto-generated method stub
		List<Payment> payments = testData.getPayments();
		List<Payment> returnable = new ArrayList<Payment>();
		Iterator i = payments.iterator();
		while(i.hasNext()){
			Payment payment = (Payment) i.next();
			if (payment.getPaidStatus() == "Paid"){
				returnable.add(payment);
			}
		}
		return returnable;
	}

	@Override
	public List<Payment> readUnpaidPayments() {
		// TODO Auto-generated method stub
		List<Payment> payments = testData.getPayments();
		List<Payment> returnable = new ArrayList<Payment>();
		Iterator i = payments.iterator();
		while(i.hasNext()){
			Payment payment = (Payment) i.next();
			if (payment.getPaidStatus() == "Unpaid"){
				returnable.add(payment);
			}
		}
		return returnable;
	}
    
}