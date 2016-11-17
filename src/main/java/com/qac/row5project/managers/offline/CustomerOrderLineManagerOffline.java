package com.qac.row5project.managers.offline;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.CustomerOrder;
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
	public CustomerOrderLine readbyId(int id) {
		for 
	}
	
	@Override
	public List<CustomerOrderLine> readByQuantity(int quantity) {
		ArrayList<> rQuantity = testData.getCustomerOrderLines();
		for (CustomerOrderLine c : rQuantity) {
			if (c.getQuantity() == quantity) {
				return c;
			}

		}
		return null;
	}
	
	@Override
	public List<CustomerOrderLine> readByTotalPrice(int totalPrice) {
		ArrayList<> rTotalPrice = testData.getCustomerOrderLines();
		for (CustomerOrderLine c : rTotalPrice) {
			if (c.getTotalPrice() == totalPrice) {
				return c;
			}

		}
		return null;
	}
	
	@Override
	public List<CustomerOrderLine> readByCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder) {
		ArrayList<> rCO_idOrder = testData.getCustomerOrderLines();
		for (CustomerOrderLine c : rCO_idOrder) {
			if (c.getCustomerOrder_idOrder().getId() == CustomerOrder_idOrder.getId()) {
				return c;
			}

		}
		return null;
	}
	
	@Override
	public List<CustomerOrderLine> readByStock_idStock(CustomerOrder Stock_idStock) {
		ArrayList<> rS_idStock = testData.getCustomerOrderLines();
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

	@Override
	public void createCustomerOrderLine(com.qac.row5project.managers.CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.qac.row5project.managers.CustomerOrderLine readbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByQuantity(
			int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByTotalPrice(
			int totalPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByCustomerOrder_idOrder(
			CustomerOrder CustomerOrder_idOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByStock_idStock(
			CustomerOrder Stock_idStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomerOrderLine(com.qac.row5project.managers.CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCustomerOrderLine(com.qac.row5project.managers.CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.qac.row5project.managers.CustomerOrderLine readbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByQuantity(
			int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByTotalPrice(
			int totalPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByCustomerOrder_idOrder(
			CustomerOrder CustomerOrder_idOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByStock_idStock(
			CustomerOrder Stock_idStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomerOrderLine(com.qac.row5project.managers.CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCustomerOrderLine(com.qac.row5project.managers.CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.qac.row5project.managers.CustomerOrderLine readbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByQuantity(
			int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByTotalPrice(
			int totalPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByCustomerOrder_idOrder(
			CustomerOrder CustomerOrder_idOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByStock_idStock(
			CustomerOrder Stock_idStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomerOrderLine(com.qac.row5project.managers.CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCustomerOrderLine(com.qac.row5project.managers.CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.qac.row5project.managers.CustomerOrderLine readbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByQuantity(
			int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByTotalPrice(
			int totalPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByCustomerOrder_idOrder(
			CustomerOrder CustomerOrder_idOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.qac.row5project.managers.List<com.qac.row5project.managers.CustomerOrderLine> readByStock_idStock(
			CustomerOrder Stock_idStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomerOrderLine(com.qac.row5project.managers.CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		
	}
	
}