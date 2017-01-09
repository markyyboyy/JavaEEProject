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

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.Employee;
import com.qac.row5project.entities.Payment;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.AccountManager;
import com.qac.row5project.managers.EmployeeManager;
import com.qac.row5project.managers.PaymentManager;

@Stateless
@Default
public class AccountManagerOffline implements AccountManager {
    @Inject
    TestDataIMS testData;

	@Override
	public List<Customer> readAccounts() {
		// TODO Auto-generated method stub
		System.out.println("getting customers");
		return testData.getCustomers();
	}

	@Override
	public List<Customer> readAccountsByID(String id) {
		// TODO Auto-generated method stub
		List<Customer> accounts = testData.getCustomers();
		List<Customer> returnable = new ArrayList<Customer>();
		Iterator i = accounts.iterator();
		long accountid = Long.parseLong(id);
		while (i.hasNext()){
			Customer customer = (Customer) i.next();
			if (customer.getID() == accountid)
				returnable.add(customer);
		}
		return returnable;
	}
}