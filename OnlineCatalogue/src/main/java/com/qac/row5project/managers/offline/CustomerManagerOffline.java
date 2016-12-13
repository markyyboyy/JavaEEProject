package com.qac.row5project.managers.offline;

import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import com.qac.row5project.entities.Customer;
import com.qac.row5project.helpers.TestDataCatalogue;
import com.qac.row5project.managers.CustomerManager;
/***
 * 
 * @author Michael Crowther
 * * Get the data from an offline state -- not  using a database

 */
@Stateless
@Default
public class CustomerManagerOffline implements CustomerManager {

	@Inject
	private TestDataCatalogue testData;
	
	@Override
	public void createCustomer(Customer newCustomer) {

		List<Customer> customerList = testData.getCustomers();
		newCustomer.setID(customerList.size() + 1);
		customerList.add(newCustomer);
		testData.setCustomers(customerList);
	}
	/**
	 * @cID id of the customer you want to retrieve
	 * @return Customer
	 */
	@Override
	public Customer readCustomerByID(int cID) {

		for (Customer a : testData.getCustomers()) {
			if (a.getID() == cID)
				return a;
		}
		return null;
	}
	//param
	/**
	 * @fName firstname of customer
	 * @sName surname of customer
	 * @return Customer
	 */
	@Override
	public Customer readCustomerByNames(String fName, String sName) {

		for (Customer a : testData.getCustomers()) {
			if (a.getFirstname().equals(fName) && a.getSurname().equals(sName))
				return a;
		}

		return null;	
	}
	
	//params
	/**
	 * Update a customer which is already in the system
	 * @customer customer with the update details
	 */
	@Override
	public void updateCustomer(Customer customer) {

		List<Customer> co1 = testData.getCustomers();

		for (int i = 0; i < co1.size(); i++) {
			if (co1.get(i).getID() == customer.getID())
				co1.set(i, customer);
		}
	}

	
	/***
	 * @param sEmail 
	 * @return the customer of the corresponding email, if no customer has sEmail, retuns null
	 */
	@Override
	public Customer readCustomerByEmail(String sEmail) {

		for (Customer a : testData.getCustomers()) {
			if (a.getLoginDetails().getEmail().equalsIgnoreCase(sEmail))
				return a;
		}
		return null;		
		}

}
