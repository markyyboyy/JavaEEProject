package com.qac.row5project.managers.offline;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.helpers.TestData;
import com.qac.row5project.managers.CustomerOrderLineManager;

@Stateless
@Default

/**
 * 
 * @author Iman Hassan
 *
 */
public class CustomerOrderLineManagerOffline implements CustomerOrderLineManager {
	
	@Inject
	private TestData testData;
	
	//CREATE - Customer Only
	/**
	 * creating a new customer order line
	 */
	@Override
	public void createCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		List<CustomerOrderLine> newCOLine = testData.getCustomerOrderLine();
		customerOrderLine.setID(newCOLine.size()+1);
		newCOLine.add(customerOrderLine);
		testData.setCustomerOrderLine(customerOrderLine);
	}
	
	/**
	 * READ - Customer and Inventory Manager Only
	 * reading a new customer order line by id
	 */
	@Override
	public CustomerOrderLine readById(int id) {
		List<CustomerOrderLine> rQuantity = testData.getCustomerOrderLine();
		for (CustomerOrderLine col : rQuantity) {
			if (col.getQuantity() == id) {
				return col;
			}
		}
		return null;
	}
	
	/**
	 * READ - Customer and Inventory Manager Only
	 * reading a customer order line by customer order id
	 */
	@Override
	public CustomerOrderLine readByCustomerOrder_idOrder(CustomerOrderLine CustomerOrder_idOrder) {
		List<CustomerOrderLine> rCO_idOrder = testData.getCustomerOrderLine();
		for (CustomerOrderLine col : rCO_idOrder) {
			if (col.getID() == CustomerOrder_idOrder.getID()) {
				return col;
			}
		}
		return null;
	}
	
	/**
	 * READ - Customer and Inventory Manager Only
	 * reading a customer order line by stock id
	 */
	@Override
	public CustomerOrderLine readByStock_idStock(CustomerOrderLine Stock_idStock) {
		List<CustomerOrderLine> rS_idStock = testData.getCustomerOrderLine();
		for (CustomerOrderLine col : rS_idStock) {
			if (col.getStock().getStockID() == Stock_idStock.getID()) {
				return col;
			}

		}
		return null;
	}
		
	
	/**
	 * UPDATE - Customer Only
	 * updating customer order line from customer order 
	 */
	@Override
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		List<CustomerOrderLine> uCOrders = testData.getCustomerOrderLine();
		
		for (int i = 0; i < uCOrders.size(); i++) {
			if (uCOrders.get(i).getID() == customerOrderLine.getID())
				uCOrders.set(i, customerOrderLine);
		}
		
		}

	@Override
	public void deriveTotalPrice(long id) {
		// TODO Auto-generated method stub
		
	}

	
}