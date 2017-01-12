/**
 * @author Mark Freeman
 */
package com.qac.row5project.managers;

import java.util.List;

import com.qac.row5project.entities.Customer;

public interface AccountManager {
	public List<Customer> readAccounts();

	public List<Customer> readAccountsByID(String id);
}
