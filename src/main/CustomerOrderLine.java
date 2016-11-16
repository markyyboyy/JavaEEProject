@Entity
@Table(name="CustomerOrderLine")
public class CustomerOrderLine {
	
	@Id
	@Column(nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(min=3, max=225)
	@Column(name="quantity_id", nullable=false)
	private int quantity;
	
	@NotNull 
	@Size(min=5, max=12)
	@Column(name="price_id", nullable = false)
	private float price;
	
	@ManyToOne
	@JoinColumn(name="CustomerOrder_idOrder", nullable=false)
	@NotNull
	private CustomerOrder CustomerOrder_idOrder;
	
	@ManyToOne
	@JoinColumn(name="Stock_idStock", nullable=false)
	@NotNull
	private Stock Stock_idStock;

	public CustomerOrderLine() {
	}

	public CustomerOrderLine(int id, int quantity, float price, CustomerOrder CustomerOrder_idOrder, Stock Stock_idStock) {
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.CustomerOrder_idOrder = CustomerOrder_idOrder;
		this.Stock_idStock = Stock_idStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getPrice() {
		return price;
	}
	
	public CustomerOrder getCustomer_idOrder() {
		return CustomerOrder_idOrder;
	}

	public Stock getStock_idStock() {
		return Stock_idStock;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder) {
		this.CustomerOrder_idOrder = CustomerOrder_idOrder;
	}

	public void setStock_idStock(Stock Stock_idStock) {
		this.Stock_idStock = Stock_idStock;
	}

}
