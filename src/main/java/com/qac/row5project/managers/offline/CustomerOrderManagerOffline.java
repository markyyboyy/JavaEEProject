package com.qac.row5project.managers.offline;
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
	public CustomerOrder createCustomerOrder(CustomerOrder co) {
		List<CustomerOrder> co1 = testData.getCustomerorders();
		co.setCustomerOrderId(co1.size()+1);
		co1.add(co);
		testData.setCustomerorders(co1);
		return co;
		}
	
	//UPDATE - CUSTOMER
	@Override
	public void updateCustomerOrder(CustomerOrder co){
		List<CustomerOrder> co1 = testData.getCustomerorders();
		for(int i=0;i<co1.size();i++)
			if(co1.get(i).getCustomerId() == co.getCustomerId())
				co1.set(i, co);
	}
	
	//READ - CUSTOMER/INVENTORY MANAGER
	@Override
	public CustomerOrder readCustomerOrderById(long id) {
			for(CustomerOrder co : testData.getCustomerorders())
				if(co.getCustomerId() == id)
					return co;
			return null;
	}
	
	@Override
	public CustomerOrder readCustomerOrderByDatePlaced(Calendar date){
		for(CustomerOrder co : testData.getCustomerorders())
			if(co.getDatePlaced() == date)
				return co;
		return null;
	
}
}
