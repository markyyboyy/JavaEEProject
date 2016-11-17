public interface StockManager {
	
	//CREATE, UPDATE: INVENTORY MANAGER
	public Stock createStock(Stock Stock);
	public void updateStock(Stock Stock);
	
	//READ: VISITOR, CUSTOMER, INVENTORY MANAGER
	public Stock findStocksbyID(int stockID);
	public List<Stock> findStocksbyPorousware(boolean porous);
	public List<Stock> findStocksbyRefurbished(boolean refurbished);
	
	//UPDATE-INV MANAGER
	public void updateStock(Stock Stock);
	//what if someone buys a product twice could do by order
}
