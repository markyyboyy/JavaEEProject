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
	TestDataCatalogue testData;
	
	//CREATE, UPDATE: INVENTORY MANAGER
	@Override	
	public Stock createStock(Stock stock){
		List<Stock> stockList = testData.getStockItems();
		stock.setID(stockList.size()+1);
		stockList.add(stock);
		testData.setStockItems(stockList);
		return stock;
	}
	
	/**
	 * @param stock stock to be updated
	 */
	public void updateStock(Stock stock){

		List<Stock> stockList = testData.getStockItems();
		for(Stock s: stockList)
		{
			if(s.getID()==stock.getID()){
				s=stock;
				testData.setStockItems(stockList);
				break;
			}
		}
	}
	
	//READ: VISITOR, CUSTOMER, INVENTORY MANAGER
	public Stock findStocksbyID(long stockID){
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.getID()==stockID)
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
		
	/***
	 * 
	 */
	public List<Stock> getStockByProductID(long productId) {

		List<Stock> tStockList= new ArrayList<Stock>();
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.getProductID().getProductID()==productId)
				tStockList.add(s);
		}
		return tStockList;
	}
}
