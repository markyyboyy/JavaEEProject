package com.qac.row5project.managers.offline;
@Stateless
	@Default
public interface StockManagerOffline implements StockManager {
	
		
	@Inject
	private TestData testData;
	
	@Override	
	
	//CREATE, UPDATE: INVENTORY MANAGER
	public Stock createStock(Stock stock){
		List<Stock> stockList = testData.getStockItems();
		stock.setId(stockList.size()+1);
		customers.add(stock);
		testData.setStockitems(stockList);
		return stock;
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
