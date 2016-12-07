/**
 * @Author RyanB
 */
package com.qac.row5project.managers.offline;

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
	private TestData testData;
	private CustomerOrder customerOrder;

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
			if (co1.get(i).getCustomerId() == co.getCustomerId())
				co1.set(i, co);
	}

	// READ - CUSTOMER/INVENTORY MANAGER
	@Override
	// ALLOWS A CUSTOMER ORDER TO BE VIEWED BASED ON THE ORDER ID
	public CustomerOrder readCustomerOrderById(long id) {
		for (CustomerOrder co : testData.getCustomerOrders())
			if (co.getCustomerId() == id)
				return co;
		return null;
	}

	@Override
	// ALLOWS A CUSTOMER ORDER TO BE VIEWED BASED ON THE ORDER DATE
	public CustomerOrder readCustomerOrderByDatePlaced(Calendar date) {
		for (CustomerOrder co : testData.getCustomerOrders())
			if (co.getDatePlaced() == date)
				return co;
		return null;

	}

//	public CustomerOrder addToBasket(long customerId, Stock stock, int quantity) {
//		for (CustomerOrderLine customerOrderLine : customerOrder.getCustomerOrderLines()) {
//			if (stock.getStockID() == customerOrderLine.getStock().getStockID()) {
//				customerOrderLine.setQuantity(customerOrderLine.getQuantity() + 1);
//				return customerOrder;
//			}
//		}
//		return customerOrder.addToCustomerOrderLine(new CustomerOrderLine(customerId, quantity, stock));
//		
//	}

//	public CustomerOrder removeFromBasket(long customerId, Stock stock) {
//			for (CustomerOrderLine customerOrderLine : customerOrder.getCustomerOrderLines()) {
//				if (stock.getStockID() == customerOrderLine.getStock().getStockID()) {
//					if (customerOrderLine.getQuantity() > 1) {
//						customerOrderLine.setQuantity(customerOrderLine.getQuantity() - 1);
//					} else {
//						customerOrder.removeFromCustomerOrderLine(customerOrderLine);
//					}
//				}
//			}
//		}
	
	}

