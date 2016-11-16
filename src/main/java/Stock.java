public class Stock {

	private int stockID;
	private boolean porousware;
	private boolean refurbished;
	private int quantity;
	private int productID;
		
	public Stock(int stockID, boolean porousware, int quantity,boolean refurbished, int productID) {
		super();
		this.stockID = stockID;
		this.porousware = porousware;
		this.refurbished = refurbished;
		this.quantity = quantity;
		this.productID = productID;
	}
	
	public Stock(int stockID, int quantity, boolean refurbished, int productID) {
		super();
		this.porousware=false;
		this.stockID = stockID;
		this.refurbished = refurbished;
		this.quantity = quantity;
		this.productID = productID;
	}
	

	public Stock(int stockID, boolean porousware, int quantity, int productID) {
		super();
		this.refurbished = false;
		this.porousware=porousware;
		this.stockID = stockID;
		this.porousware=porousware;
		this.quantity = quantity;
		this.productID = productID;
	}
	
	public Stock(int stockID, int quantity, int productID) {
		super();
		this.porousware=false;
		this.refurbished=false;
		this.stockID = stockID;
		this.quantity = quantity;
		this.productID = productID;
	}

	public int getStockID() {
		return stockID;
	}
	public void setStockID(int stockID) {
		this.stockID = stockID;
	}
	public boolean isPorousware() {
		return porousware;
	}
	public void setPorousware(boolean porousware) {
		this.porousware = porousware;
	}
	public boolean isRefurbished() {
		return refurbished;
	}
	public void setRefurbished(boolean refurbished) {
		this.refurbished = refurbished;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", porousware=" + porousware + ", refurbished=" + refurbished
				+ ", quantity=" + quantity + ", productID=" + productID + "]";
	}
}
