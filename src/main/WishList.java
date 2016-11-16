@Entity
@Table("WishList")
class WishList {

//	@Column(name = "customer id", nullable = false, unique = true)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long customerId;
//	
//	@Column(name = "stock id", nullable = false, unique = true)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long stockId;
//
//	@
	
	
	public WishList() {
	}

	public WishList(int customerId, int stockId) {
		this.customerId = customerId;
		this.stockId = stockId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	@Override
	public String toString() {
		return "WishList [customerId=" + customerId + ", stockId=" + stockId + "]";
	}

}
