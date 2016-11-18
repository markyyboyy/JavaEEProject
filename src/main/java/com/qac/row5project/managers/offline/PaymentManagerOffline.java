package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Address;
import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.Payment;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.PaymentManager;

@Stateless
@Default

public class PaymentManagerOffline implements PaymentManager {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public void createPayment(Payment payment){
		ArrayList<Payment> returned = testData.getPayments();
		returned.add(payment);
		testData.setPayments(returned);
	}
	@Override
	public Payment readPayment(int ID){
		ArrayList<Payment> returned = testData.getPayments();
		for(Payment l: returned){
			if (l.getID() ==ID){
				return l;
			}
		}
		return null;
	}
	@Override
	public Payment readPaymentCard(String cardNumber){
		ArrayList<Payment> returned = testData.getPayments();
		for(Payment l: returned){
			if (l.getCardNumber() == cardNumber){
				return l;
			}
		}
		return null;
	}
	@Override
	public void updatePayment(Payment payment){
		ArrayList<Payment> returned = testData.getPayments();
		int i = 0;
		for(Payment p: returned){
			if (p.getID() == payment.getID()){
				returned.remove(i);
				returned.add(i, payment);
			}
			i++;
		}
		testData.setPayments(returned);
	}
}