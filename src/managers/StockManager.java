public interface StockManager {
	
<<<<<<< HEAD
	//CREATE, UPDATE: INVENTORY MANAGER
	public Stock createStock(Stock Stock);
	public void updateStock(Stock Stock);
	
	
	//READ: VISITOR, CUSTOMER, INVENTORY MANAGER
=======
	//CREATE - INV MANAGER
	public Stock createStock(Stock Stock);
	
	//READ - CUSTOMER/VISITOR/INV MANAGER
>>>>>>> 1d2b870261de31c734a6802c0d0a7f8f03285aad
	public Stock findStocksbyID(int stockID);
	public List<Stock> findStocksbyPorousware(boolean porous);
	public List<Stock> findStocksbyRefurbished(boolean refurbished);
	
	//UPDATE-INV MANAGER
	public void updateStock(Stock Stock);
	//what if someone buys a product twice could do by order
	
}
