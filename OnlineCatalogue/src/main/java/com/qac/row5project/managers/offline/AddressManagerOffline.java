package com.qac.row5project.managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Address;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.AddressManager;
/***
 * 
 * @author Michael Crowther
 * 
 * Get the data from an offline state -- not  using a database
 *
 */

@Stateless
@Default
public class AddressManagerOffline implements AddressManager {
	@Inject
	private TestDataCatalogue testData;

	/***
	 *
	 * 
	 * @param address new address filled with all necceasry attributes	
	 */
	@Override
	public Address createAddress(Address address) {

		List<Address> newFeedback = testData.getAddresses();
		
		address.setID(newFeedback.size() + 1);
		newFeedback.add(address);
		testData.setAddresses(newFeedback);
		
		return address;

	}

	//change method name b y id
	/***
	 * 
	 * @param id of employees address you want to get
	 */
	@Override
	public Address readEmployee(int id) {

		for (Address a : testData.getAddresses()) {
			if (a.getID() == id)
				return a;
		}
		return null;
	}

	@Override
	public Address readAddressById(long id) {
		
		for (Address a : testData.getAddresses()) {
			if (a.getID() == id)
				return a;
		} return null;
	} 
}
