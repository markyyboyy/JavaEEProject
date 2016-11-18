package com.qac.row5project.managers.offline;

import java.util.ArrayList;
import javax.inject.Inject;

import com.qac.row5project.entities.Address;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.AddressManager;

public class AddressManagerOffline implements AddressManager {
	@Inject
	private TestData testData;

	@Override
	public Address createAddress(Address address) {

		ArrayList<Address> newFeedback = testData.getAddresses();
		
		address.setID(newFeedback.size() + 1);
		newFeedback.add(address);
		testData.setAddress(newFeedback);
		
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
