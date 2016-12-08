package com.qac.services;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.managers.CustomerOrderManager;

/**
 * 
 * @author Ynyr Williams
 *
 */
@Stateless
public class CustomerOrderImsService {
	@Inject
	private CustomerOrderManager customerOrderManager;
	
	public CustomerOrder readCustomerOrderById(long id)
	{
		return customerOrderManager.readCustomerOrderById(id);
	}
	public List<CustomerOrder> readCustomerOrderByDatePlaced(Calendar date)
	{
		return customerOrderManager.readCustomerOrderByDatePlaced(date);
	}
	public List<CustomerOrder> readCustomerOrders()
	{
		return customerOrderManager.readCustomerOrders();
	}	
}
