public interface StockManager {
	public Stock createStock(Stock Stock);
	public void updateStock(Stock Stock);
	//what if someone buys a product twice could do by order
	public Stock findStocksbyID(int stockID);
	public List<Stock> findStocksbyPorousware(boolean porous);
	public List<Stock> findStocksbyRefurbished(boolean refurbished);
}
