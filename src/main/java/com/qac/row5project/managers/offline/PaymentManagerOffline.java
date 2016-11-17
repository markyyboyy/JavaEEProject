package com.qac.row5project.managers.offline;
import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Stateless
@Default

public class SupplierManagerOffline implements SupplierManger {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public void createPayment(Payment payment){
		ArrayList<> returned = testData.getPayments();
		returned.add(payment);
		testData.setPayments(returned);
	}
		
	public Payment readPayment(int ID){
		ArrayList<> returned = testData.getPayments();
		for(Payment l: returned){
			if (l.getID().equals(ID)){
				return l
			}
		}
		return null;
	}
	public Payment readPayment(String cardNumber){
		ArrayList<> returned = testData.getPayments();
		for(LoginDetails l: returned){
			if (l.getCardNumber().equals(emailAddress)){
				return l
			}
		}
		return null;
	}
	public Payment readPayment(String issueNumber){
		ArrayList<> returned = testData.getPayments();
		for(LoginDetails l: returned){
			if (l.getIssueNumber().equals(issueNumber)){
				return l
			}
		}
		return null;
	}
	
	public void updatePayment(Payment payment){
		ArrayList<> returned = testData.getPayments();
		int i = 0;
		for(Payment p: returned){
			if (p.getID() == payment.getID()){
				returned.remove(i)
				returned.add(i, payment);
			}
			i++;
		}
		testData.setPayments(returned);
	}
	
}