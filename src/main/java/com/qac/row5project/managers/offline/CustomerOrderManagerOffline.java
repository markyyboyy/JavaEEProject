/**
 * @Author RyanB
 */
package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.CustomerOrderManager;

@Stateless
@Default
public class CustomerOrderManagerOffline implements CustomerOrderManager {
	
	@Inject
	private TestData testData;
	
	//CREATE - CUSTOMER
	@Override
	//RETUSN A CUSTOMER ORDER
	public CustomerOrder createCustomerOrder(CustomerOrder co) {
		ArrayList<CustomerOrder> co1 = testData.getCustomerOrders();
		co.setCustomerOrderId(co1.size()+1);
		co1.add(co);
		testData.setCustomerOrders(co1);
		return co;
		}
	
	//UPDATE - CUSTOMER
	@Override
	//UPDATES CUSTOMER ORDER DETAILS BASED ON THE ORDER THAT IS PASSED TO IT
	public void updateCustomerOrder(CustomerOrder co){
		List<CustomerOrder> co1 = testData.getCustomerOrders();
		for(int i=0;i<co1.size();i++)
			if(co1.get(i).getCustomerId() == co.getCustomerId())
				co1.set(i, co);
	}
	
	//READ - CUSTOMER/INVENTORY MANAGER
	@Override
	//ALLOWS A CUSTOMER ORDER TO BE VIEWED BASED ON THE ORDER ID
	public CustomerOrder readCustomerOrderById(long id) {
			for(CustomerOrder co : testData.getCustomerOrders())
				if(co.getCustomerId() == id)
					return co;
			return null;
	}
	
	@Override
	//ALLOWS A CUSTOMER ORDER TO BE VIEWED BASED ON THE ORDER DATE
	public CustomerOrder readCustomerOrderByDatePlaced(Calendar date){
		for(CustomerOrder co : testData.getCustomerOrders())
			if(co.getDatePlaced() == date)
				return co;
		return null;
	
}
}
