/**
 * @author Mark Freeman
 */
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
		returned.add(payment);	//Add a payment to the list.
		testData.setPayments(returned);	//Update the list in the database.
	}
	@Override
	public Payment readPayment(int ID){
		ArrayList<Payment> returned = testData.getPayments();
		for(Payment l: returned){	//For each payment
			if (l.getID() ==ID){	//If the current object is the one we are looking for return it
				return l;
			}
		}
		return null;	//If the payment did not exist then just return null.
	}
	@Override
	public Payment readPaymentCard(String cardNumber){
		ArrayList<Payment> returned = testData.getPayments();
		for(Payment l: returned){	//For each payment
			if (l.getCardNumber() == cardNumber){ //If the current object is the one we are looking for return it
				return l;
			}
		}
		return null;	//If the payment did not exist then just return null.
	}
	@Override
	public void updatePayment(Payment payment){
		ArrayList<Payment> returned = testData.getPayments();
		int i = 0;	//Used as a counter variable.
		for(Payment p: returned){	//For each payment
			if (p.getID() == payment.getID()){	//If the current payment is the one we are looking then replace it with the updated payment
				returned.remove(i);
				returned.add(i, payment);
			}
			i++;
		}
		testData.setPayments(returned);	//Update the payment list in the database.
	}
}