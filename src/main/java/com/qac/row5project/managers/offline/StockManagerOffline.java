package com.qac.row5project.managers.offline;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import com.qac.row5project.entities.*;
import com.qac.row5project.managers.StockManager;

@Stateless
@Default
public class StockManagerOffline implements StockManager {
	
		
	@Inject 
	TestData testData;
	
	@Override	
	//CREATE, UPDATE: INVENTORY MANAGER
	public Stock createStock(Stock stock){
		ArrayList<Stock> stockList = testData.getStockItems();
		stock.setId(stockList.size()+1);
		customers.add(stock);
		testData.setStockitems(stockList);
		return stock;
		return null;
	}
	public void updateStock(Stock stock){

		List<Stock> stockList = testData.getStockItems();
		for(Stock s: stockList)
		{
			if(s==stock)
				testData.setStockItems(stock);
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
		List<Stock> tStockList= new list<Stock>();
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.isPorousware()==porous)
				tStockList.add(s);
		}
		if(tstockList.size()!=0)
			return tStockList;
		else
			return null;
	}
	public List<Stock> findStocksbyRefurbished(boolean refurbished)
	{

		List<Stock> tStockList= new list<Stock>();
		List<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.isRefurbished()==refurbished)
				tStockList.add(s);
		}
		if(tstockList.size()!=0)
			return tStockList;
		else
			return null;
	}
}
