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
		stock.setStockID(stockList.size()+1);
		stockList.add(stock);
		testData.setStockItems(stockList);
		return stock;
	}
	public void updateStock(Stock stock){

		ArrayList<Stock> stockList = testData.getStockItems();
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
		ArrayList<Stock> stockList = testData.getStockItems();
		for(Stock s:stockList)
		{
			if(s.getStockID()==stockID)
				return s;
		}
		return null;
		
	}
	public ArrayList<Stock> findStocksbyPorousware(boolean porous){
		ArrayList<Stock> tStockList= new ArrayList<Stock>();
		ArrayList<Stock> stockList = testData.getStockItems();
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
	public ArrayList<Stock> findStocksbyRefurbished(boolean refurbished)
	{

		ArrayList<Stock> tStockList= new ArrayList<Stock>();
		ArrayList<Stock> stockList = testData.getStockItems();
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
}
