package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Stateless
@Default

public class CustomerOrderLineManagerOffline implements CustomerOrderLineManager {
	@Inject
	private TestData testData;
	
	//CREATE - Customer Only
	@Override
	public void createCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		List<CustomerOrderLine> newCOLine = testData.getCustomerOrderLine();
		newCOLine.setId(newCOLine.size()+1);
		newCOLine.add(customerOrderLine);
		testData.setCustomerOrderLine(newCOLine);
	}
		
	//READ - Customer and Inventory Manager Only
	@Override
	public CustomerOrderLine readbyId(int id) {
		for 
	}
	
	@Override
	public List<CustomerOrderLine> readByQuantity(int quantity) {
		ArrayList<> rQuantity = testData.getCustomerOrderLine();
		for (CustomerOrderLine c : rQuantity) {
			if (c.getQuantity() == quantity) {
				return c;
			}

		}
		return null;
	}
	
	@Override
	public List<CustomerOrderLine> readByTotalPrice(int totalPrice) {
		ArrayList<> rTotalPrice = testData.getCustomerOrderLine();
		for (CustomerOrderLine c : rTotalPrice) {
			if (c.getTotalPrice() == totalPrice) {
				return c;
			}

		}
		return null;
	}
	
	@Override
	public List<CustomerOrderLine> readByCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder) {
		ArrayList<> rCO_idOrder = testData.getCustomerOrderLine();
		for (CustomerOrderLine c : rCO_idOrder) {
			if (c.getCustomerOrder_idOrder().getId() == CustomerOrder_idOrder.getId()) {
				return c;
			}

		}
		return null;
	}
	
	@Override
	public List<CustomerOrderLine> readByStock_idStock(CustomerOrder Stock_idStock) {
		ArrayList<> rS_idStock = testData.getCustomerOrderLine();
		for (CustomerOrderLine c : rS_idStock) {
			if (c.getStock_idStock().getId() == Stock_idStock.getId()) {
				return c;
			}

		}
		return null;
	}
		
	//UPDATE - Customer Only
	@Override
	public void updateCustomerOrderLine(CustomerOrderLine customerOrderLine);
	
}