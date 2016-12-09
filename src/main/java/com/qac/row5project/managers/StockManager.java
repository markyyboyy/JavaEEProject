/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers;
import java.util.List;

import com.qac.row5project.entities.Stock;

public interface StockManager {
	
	//CREATE, UPDATE: INVENTORY MANAGER
	public Stock createStock(Stock Stock);
	
	//READ: VISITOR, CUSTOMER, INVENTORY MANAGER
	public Stock findStocksbyID(long id);
	public List<Stock> findStocksbyPorousware(boolean porous);
	public List<Stock> findStocksbyRefurbished(boolean refurbished);
	
	//UPDATE-INV MANAGER
	public void updateStock(Stock Stock);
	//what if someone buys a product twice could do by order
	
	public List<Stock> getStockByProductID(long productId);
}
