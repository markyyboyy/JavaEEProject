package Controllers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.managers.CustomerOrderManager;
import com.qac.row5project.managers.StockManager;

import Controllers.session.CurrentUser;

/**
 * Session Bean implementation class StockController
 */
@Named("stock")
@RequestScoped
public class StockController {

	@Inject
	StockManager stockManager;

	@Inject
	CustomerOrderManager custOrder;

	@Inject
	CurrentUser cu;

	private int stockLevel;

	public int getStockLevel() {

		return stockLevel;
	}

	public int getStockLevel(long productID) {

		if (productID < 0)
			return 0;

		if (cu.getCustomer() != null) {
			CustomerOrder order = custOrder.readCustomerOrderById(cu.getCustomer().getID());

			if (order == null) // 
				return 1;
			else {
						
				// get how much quanity the user has of the product
				for (CustomerOrderLine orderLine : order.getCustomerOrderLines()) {

					if (orderLine.getStock().getProductID().getProductID() == productID)
						return orderLine.getStock().getQuantity() + 1;
				}

			}

		} else {

			return 1;
			
		}

		return 1;
		

	}

	
	public boolean isInStock(long productID) {

		Stock s = stockManager.findStocksbyID(productID);

		if (s == null || s.getQuantity() <=0 )
			return false;
			
		return getStockLevel(productID) < s.getQuantity();
		
		
	}

	private void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}

}
