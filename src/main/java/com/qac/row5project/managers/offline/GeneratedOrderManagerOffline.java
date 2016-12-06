package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.Feedback;
import com.qac.row5project.entities.GeneratedOrder;
import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.FeedbackManager;
import com.qac.row5project.managers.GeneratedOrderManager;

@Stateless
@Default

/**
 * 
 * @author Mark Freeman
 *
 */
public class GeneratedOrderManagerOffline implements GeneratedOrderManager {
	@Inject
	private TestData testData;
	private GeneratedOrder generatedorder;
	private PurchaseOrder purchaseOrder;
	@Override
	public void createOrder(PurchaseOrder p) {
		purchaseOrder = p;
		GeneratedOrder generatedOrder = null;
		// TODO Auto-generated method stub
		testData.setGeneratedOrder(generatedOrder);
	}

	@Override
	public void updateProduct(PurchaseOrder p) {
		// TODO Auto-generated method stub
		purchaseOrder = p;
		GeneratedOrder current = testData.getGeneratedOrder();
		current.setGoStock(p);
		testData.setGeneratedOrder(current);
	}

	@Override
	public List<Stock> readOrderByQuantity() {
		// TODO Auto-generated method stub
		List<Stock> stock = purchaseOrder.getStockList()
		Collections.sort(stock, (s1, s2) -> s1.getQuantity() - s2.getQuantity());
		return stock;
		
	}
		
	}
	