package com.qac.row5project.managers.offline;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.CustomerManager;

public class CustomerManagerOffline implements CustomerManager {

	@Inject
	private TestData testData;

	@Override
	public void createCustomer(Customer newCustomer) {

		ArrayList<Customer> customerList = testData.getCustomers();

		newCustomer.setID(customerList.size() + 1);
		customerList.add(newCustomer);
		testData.setCustomers(customerList);

		
	}

	@Override
	public Customer readCustomerByID(int cID) {

		for (Customer a : testData.getCustomers()) {
			if (a.getID() == cID)
				return a;
		}

		return null;
	}

	@Override
	public Customer readCustomerByNames(String fName, String sName) {

		for (Customer a : testData.getCustomers()) {
			if (a.getFirstname().equals(fName) && a.getSurname().equals(sName))
				return a;
		}

		return null;	
	}

	@Override
	public void updateCustomer(Customer customer) {

		List<Customer> co1 = testData.getCustomers();

		for (int i = 0; i < co1.size(); i++) {
			if (co1.get(i).getID() == customer.getID())
				co1.set(i, customer);
		}

	}

}
