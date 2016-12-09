/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers.offline;
import java.util.ArrayList;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import com.qac.row5project.entities.*;
import com.qac.row5project.managers.StockManager;
import com.qac.row5project.helpers.*;

@Default
@Stateless
public class StockManagerOffline implements StockManager {
	
		
	@Inject 
	TestData testData;
	
	//CREATE, UPDATE: INVENTORY MANAGER
	@Override	
	public Stock createStock(Stock stock){
		List<Stock> stockList = testData.getStockItems();
		stock.setStockID(stockList.size()+1);
		stockList.add(stock);
		testData.setStockItems(stockList);
		return stock;
	}
	public void updateStock(Stock stock){

		List<Stock> stockList = testData.getStockItems();
		for(Stock s: stockList)
		{
			if(s.getStockID()==stock.getStockID()){
				s=stock;
				testData.setStockItems(stockList);
				return;
			}
		}
	}
	
	//READ: VISITOR, CUSTOMER, INVENTORY MANAGER
	public Stock findStocksbyID(int stockID){
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.getStockID()==stockID)
				return s;
		}
		return null;
		
	}
	public List<Stock> findStocksbyPorousware(boolean porous){
		List<Stock> tStockList= new ArrayList<Stock>();
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.isPorousware()==porous)
				tStockList.add(s);
		}
		if(tStockList.size()!=0)
			return tStockList;
		else
			return null;
	}
	public List<Stock> findStocksbyRefurbished(boolean refurbished)
	{

		List<Stock> tStockList= new ArrayList<Stock>();
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.isRefurbished()==refurbished)
				tStockList.add(s);
		}
		if(tStockList.size()!=0)
			return tStockList;
		else
			return null;
	}
	
	//TODO
	@Override
	public Stock findStocksbyID(long id) {

		for (Stock stock : testData.getStocks()) {
			if(stock.getProductID().getProductId() == id)
				return stock;
		}
		
		return null;
		
	}
	@Override
	public Stock getStockByProductID(long productId, boolean bPourseware, boolean bRefurbised) {
		// TODO Auto-generated method stub
		return null;
	}
}
