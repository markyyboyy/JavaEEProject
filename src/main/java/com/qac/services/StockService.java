package com.qac.services;


import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Stock;
import com.qac.row5project.managers.StockManager;
/**
 * 
 * @author Iman Hassan
 *
 */

@Stateless
public class StockService {
	
	@Inject
	private StockManager stockManager;
	
	public Stock getStockByProductID(long id) {
		return stockManager.findStocksbyID(id);
	}
	
	
	
}