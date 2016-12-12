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
	/**
	 * Creates stock and adds to list
	 * 
	 * @param stock
	 * 
	 * @return newly created stock
	 * 
	 */
	@Override	
	public Stock createStock(Stock stock){
		List<Stock> stockList = testData.getStockItems();
		stock.setStockID(stockList.size()+1);
		stockList.add(stock);
		testData.setStockItems(stockList);
		return stock;
	}
	
	/**
	 * @param stock stock to be updated
	 */
	/**
	 * Updates stock in stock list
	 * 
	 * @param stock
	 * 
	 */
	public void updateStock(Stock stock){

		List<Stock> stockList = testData.getStockItems();
		for(Stock s: stockList)
		{
			if(s.getStockID()==stock.getStockID()){
				s=stock;
				testData.setStockItems(stockList);
				break;
			}
		}
	}
	
	//READ: VISITOR, CUSTOMER, INVENTORY MANAGER
	/**
	 * Finds stock by ID
	 * 
	 * @param sID
	 * 
	 * @return stock
	 * 
	 */
	public Stock findStocksbyID(long sID){
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.getStockID()==sID)
				return s;
		}
		return null;
		
	}
	/**
	 * Finds a collection of stocks that are porouswared
	 * 
	 * @param porous
	 * 
	 * @return list of stocks 
	 * 
	 */
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
	/**
	 * Finds stocks stocks that are refurbished
	 * 
	 * @param refurbished
	 * 
	 * @return collection of stock that are refurbished
	 * 
	 */
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
		
	/**
	 * Gets a collection of stock that are associated with a product
	 * 
	 * @param pID
	 * 
	 * @return collection of stocks with a product
	 * 
	 */
	public List<Stock> getStockByProductID(long pID) {

		List<Stock> tStockList= new ArrayList<Stock>();
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.getProductID()==pID)
				tStockList.add(s);
		}
		return tStockList;
	}
}
