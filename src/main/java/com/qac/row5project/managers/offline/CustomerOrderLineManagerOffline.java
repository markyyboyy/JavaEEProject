package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.CustomerOrderLineManager;

@Stateless
@Default

public class CustomerOrderLineManagerOffline implements CustomerOrderLineManager {
	@Inject
	private TestData testData;
	
	//CREATE - Customer Only
	@Override
	public void createCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		List<CustomerOrderLine> newCOLine = testData.getCustomerOrderLines();
		newCOLine.add(customerOrderLine);
		testData.setCustomerOrderLines(newCOLine);
	}
		
	//READ - Customer and Inventory Manager Only
	@Override
	public CustomerOrderLine readById(int id) {
		List<CustomerOrderLine> rQuantity = testData.getCustomerOrderLines();
		for (CustomerOrderLine col : rQuantity) {
			if (col.getQuantity() == id) {
				return col;
			}
		}
		return null;
	}
	
	@Override
	public CustomerOrderLine readByCustomerOrder_idOrder(CustomerOrderLine CustomerOrder_idOrder) {
		List<CustomerOrderLine> rCO_idOrder = testData.getCustomerOrderLines();
		for (CustomerOrderLine col : rCO_idOrder) {
			if (col.getCustomerOrder_idOrder().getCustomerOrderId() == CustomerOrder_idOrder.getId()) {
				return col;
			}

		}
		return null;
	}
	
	@Override
	public CustomerOrderLine readByStock_idStock(CustomerOrderLine Stock_idStock) {
		List<CustomerOrderLine> rS_idStock = testData.getCustomerOrderLines();
		for (CustomerOrderLine col : rS_idStock) {
			if (col.getStock_idStock().getStockID() == Stock_idStock.getId()) {
				return col;
			}

		}
		return null;
	}
		
	//UPDATE - Customer Only
	@Override
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		List<CustomerOrderLine> uCOrders = testData.getCustomerOrderLines();
		uCOrders.add(customerOrderLine);

		testData.setCustomerOrderLines(uCOrders);
		}

	
}