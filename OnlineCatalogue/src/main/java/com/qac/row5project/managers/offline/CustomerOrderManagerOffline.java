/**
 * @Author RyanB & Iman Hassan & Ynyr
 */
package com.qac.row5project.managers.offline;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.CustomerOrderManager;

@Stateless
@Default
public class CustomerOrderManagerOffline implements CustomerOrderManager {

	@Inject
	private TestDataCatalogue testData;

	// CREATE - CUSTOMER
	@Override
	// RETUSN A CUSTOMER ORDER
	public CustomerOrder createCustomerOrder(CustomerOrder co) {
		List<CustomerOrder> co1 = testData.getCustomerOrders();
		co.setCustomerOrderId(co1.size() + 1);
		co1.add(co);
		testData.setCustomerOrders(co1);
		return co;
	}
	// UPDATE - CUSTOMER
	@Override
	// UPDATES CUSTOMER ORDER DETAILS BASED ON THE ORDER THAT IS PASSED TO IT
	public void updateCustomerOrder(CustomerOrder co) {
		List<CustomerOrder> co1 = testData.getCustomerOrders();
		for (int i = 0; i < co1.size(); i++)
			if (co1.get(i).getCustomerID() == co.getCustomerID())
				co1.set(i, co);
	}

	// READ - CUSTOMER/INVENTORY MANAGER
	@Override
	// ALLOWS A CUSTOMER ORDER TO BE VIEWED BASED ON THE ORDER ID
	public CustomerOrder readCustomerOrderById(long id) {
		for (CustomerOrder co : testData.getCustomerOrders())
			if (co.getCustomerID() == id)
				return co;
		return null;
	}
	@Override
	public List<CustomerOrder> readCustomerOrders()
	{
		return testData.getCustomerOrders();
	}   
	@Override
	// ALLOWS A CUSTOMER ORDER TO BE VIEWED BASED ON THE ORDER DATE
	public List<CustomerOrder> readCustomerOrderByDatePlaced(Calendar date) {
		List<CustomerOrder> co1 = new ArrayList<>();
		for (CustomerOrder co : testData.getCustomerOrders())
			if (co.getDatePlaced() == date)
				co1.add(co);
		return co1;
	}

	@Override
	public void addToBasket(long customerId, Stock stock, int quantity) {		
		
		CustomerOrder cOrder = readCustomerOrderById(customerId);
		
		// if product is already in basket, increase the quanity
		// Need a check to see if there is enough sotck todo!!!!!
		for (CustomerOrderLine customerOrderLine : cOrder.getCustomerOrderLines()) {
			if (stock.getID() == customerOrderLine.getStock().getID()) {
				customerOrderLine.setQuantity(customerOrderLine.getQuantity() + 1);
				return;
			}
		}		
		
		CustomerOrderLine cl = new CustomerOrderLine(customerId, quantity, stock);
		
		cOrder.addToCustomerOrderLine(cl);
		

		
		
		
	}

	@Override
	public void removeFromBasket(long customerId, Stock stock, int quantity) {
		CustomerOrder cOrder = readCustomerOrderById(customerId);
		for (CustomerOrderLine customerOrderLine : cOrder.getCustomerOrderLines()) {
			if (stock.getID() == customerOrderLine.getStock().getID()) {
				if (customerOrderLine.getQuantity() > 1) {
					customerOrderLine.setQuantity(customerOrderLine.getQuantity() - 1);
				} else {
					cOrder.removeFromCustomerOrderLine(customerOrderLine);
				}
			}
		}
	}
}
