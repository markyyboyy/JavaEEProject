package com.qac.row5project.helpers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import com.qac.row5project.entities.*;

/***
 * This class represents dummy data to be used for testing purposes.
 * 
 * @author Mark Freeman & Ynyr Williams
 *
 */
@Startup
@Singleton
public class TestDataIMS {
	private List<Employee> employees;
	private List<LoginDetails> loginDetails;
	private List<Payment> payments;
	private List<Customer> customers;

	/***
	 * 
	 * This method runs after the object is made and initialises all the
	 * variables and adds the data.
	 *
	 */
	@PostConstruct
	private void setupData() {
		loginDetails = new ArrayList<LoginDetails>();
		employees = new ArrayList<Employee>();
		LoginDetails testLogin = new LoginDetails("test@test.com", "password");
		loginDetails.add(testLogin);
		LoginDetails imsLogin = new LoginDetails("m@nb.com", "p");
		loginDetails.add(imsLogin);
		//employees.add(new Employee(imsLogin, 10));
		payments = new ArrayList<Payment>();
		Calendar cal = new GregorianCalendar(2016,10,06);
		CustomerOrder customerordernew = new CustomerOrder(1L,1L,cal,1L,1L);
		String totalPrice = Double.toString(customerordernew.getTotalPrice());
		Customer customernew = new Customer(1L,"Smith", "Dave", "Blue", cal,new LoginDetails("dave@msn.com","password"),"01534112678");
		Payment p3 = new Payment(totalPrice, customerordernew.getDatePlaced(), customernew, "Paid", customerordernew);
		payments.add(p3);
		Calendar cal2 = new GregorianCalendar(2017,02,10);
		customers = new ArrayList<Customer>();
		Customer customernew2 = new Customer(2L,"Freeman", "Mark", "Blue", cal2,new LoginDetails("mark559862@msn.com","password"),"01509559862");
		customers.add(customernew2);
		customers.add(customernew);
		CustomerOrder customerordernew2 = new CustomerOrder(1L,1L,cal2,1L,1L);
		String totalPrice2 = Double.toString(customerordernew.getTotalPrice());
		Payment p4 = new Payment(totalPrice2, customerordernew2.getDatePlaced(), customernew2, "Unpaid", customerordernew2);
		payments.add(p4);
		Address address = new Address("Mark Freeman","Orchard House", "16 Brookside", "East Leake", "Loughborough", "LE12 6PB", "Leicestershire");
		List addresses = new ArrayList<Address>();
		Address address2 = new Address("Dave Smith","The House", "12 Main Road", "Croydon", "London", "LDNA 123", "London");
		customernew2.setAddress(address);
		customernew.setAddress(address2);
	}

	public List<LoginDetails> getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(List<LoginDetails> loginDetails) {
		this.loginDetails = loginDetails;
	}
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Payment> getPayments() {
		// TODO Auto-generated method stub
		System.out.println("getPayments called");
		return payments;
	}
	
	public void setPayments(List<Payment> payments){
		this.payments = payments;
	}

	public List<Customer> getCustomers() {
		System.out.println("the length was" + customers.size());
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
}