package com.qac.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Payment;
import com.qac.row5project.entities.Product;
import com.qac.row5project.helpers.TestDataCatalogue;
import com.qac.row5project.managers.PaymentManager;
import com.qac.row5project.managers.WishlistManager;
import com.qac.row5project.managers.offline.PaymentManagerOffline;
import com.qac.row5project.managers.offline.WishlistManagerOffline;

import Controllers.session.CurrentUser;

@Stateless

public class UpdatePaymentService {
	
	@Inject
	private PaymentManager manager = new PaymentManagerOffline();
	
	@Inject
	private CurrentUser currentUser;
	
	@Inject
	private TestDataCatalogue testData;
	
	public void update(String type, String cardNumber, String expiryDate, String nameOnCard, String issueNumber, String addressLine1, String addressLine2, String addressLine3, String town, String postcode, String county)
	{
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		Date date = null;
		try {
			date = formatter.parse(expiryDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		Payment payment = new Payment(type,cardNumber,calendar,nameOnCard,issueNumber, currentUser.getCustomer(), null, 0);
		List<Payment> currentPayments = testData.getPayments();
		currentPayments.add(payment);
		testData.setPayments(currentPayments);
	}
}
