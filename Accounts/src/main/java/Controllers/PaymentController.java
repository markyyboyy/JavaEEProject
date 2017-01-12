package Controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.Payment;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.managers.PaymentManager;

/**
 * Session Bean implementation class StockController
 */
@Named("payment")
@RequestScoped

public class PaymentController {
	@Inject
	PaymentManager paymentManager;
	private String paid;
	private List<Payment> payments = new ArrayList<Payment>();
	public List<Payment> getPayments() {
		if (payments.size() == 0){
		setPayments(paymentManager.readPayments());
		}
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		System.out.println("set payments");
		this.payments = payments;
	}
	public String getPaid() {
		return paid;
	}
	public void setPaid(String paid) {
		this.paid = paid;
	}
	public void read(){
		if (paid.equals("Paid")){
			setPayments(paymentManager.readPaidPayments());
		}
		else if(paid.equals("Unpaid")){
			setPayments(paymentManager.readUnpaidPayments());
			System.out.println("UNPAID");
		}
	}

}
