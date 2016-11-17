public interface StockManager {
	
	//CREATE - INV MANAGER
	public Stock createStock(Stock Stock);
	
	//READ - CUSTOMER/VISITOR/INV MANAGER
	public Stock findStocksbyID(int stockID);
	public List<Stock> findStocksbyPorousware(boolean porous);
	public List<Stock> findStocksbyRefurbished(boolean refurbished);
	
	//UPDATE-INV MANAGER
	public void updateStock(Stock Stock);
	//what if someone buys a product twice could do by order
	
}
