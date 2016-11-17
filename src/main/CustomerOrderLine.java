import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="CustomerOrderLine")
public class CustomerOrderLine {
	
	@Id
	@Column(nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Size(min=3, max=225)
	@Column(name="quantity_id", nullable=false)
	@NotNull
	private int quantity;
	
	@Size(min=5, max=12)
	@Column(name="totalPrice_id", nullable = false)
	@NotNull
	private float totalPrice;
		
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

	public CustomerOrderLine(int id, int quantity, float totalPrice, CustomerOrder CustomerOrder_idOrder, Stock Stock_idStock) {
		this.id = id;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.CustomerOrder_idOrder = CustomerOrder_idOrder;
		this.Stock_idStock = Stock_idStock;
	}

	public int getId() {
		return id;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public float getTotalPrice() {
		return totalPrice;
	}
	
	public CustomerOrder getCustomer_idOrder() {
		return CustomerOrder_idOrder;
	}

	public Stock getStock_idStock() {
		return Stock_idStock;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void setCustomerOrder_idOrder(CustomerOrder CustomerOrder_idOrder) {
		this.CustomerOrder_idOrder = CustomerOrder_idOrder;
	}

	public void setStock_idStock(Stock Stock_idStock) {
		this.Stock_idStock = Stock_idStock;
	}

}
