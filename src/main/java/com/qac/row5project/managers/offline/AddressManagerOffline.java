package com.qac.row5project.managers.offline;

import java.util.ArrayList;
import javax.inject.Inject;
import com.qac.row5project.entities.*;
import com.qac.row5project.managers.*;
/***
 * 
 * @author Michael Crowther
 *
 */
public class AddressManagerOffline implements AddressManager {
	@Inject
	private TestData testData;

	@Override
	public Address createAddress(Address address) {

		ArrayList<Address> newFeedback = testData.getAddresses();
		
		address.setID(newFeedback.size() + 1);
		newFeedback.add(address);
		testData.setAddresses(newFeedback);
		
		return address;

	}

	@Override
	public Address readEmployee(int id) {

		for (Address a : testData.getAddresses()) {
			if (a.getID() == id)
				return a;
		}

		return null;
	}

}
