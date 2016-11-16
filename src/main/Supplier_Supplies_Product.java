import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Supplier_Supplies_Product")


public class Supplier_Supplies_Product {
	
	@OneToOne
	@JoinColumn(name = "Supplier_id", nullable = false)
	@NotNull
	private Supplier supplier;
	
	@OneToOne
	@JoinColumn(name = "Product_id", nullable = false)
	@NotNull
	private	Product product;
	
	@Column(name = "price", nullable = false)
	@NotNull
	private float price;
	
	public Supplier_Supplies_Product()
	{}
	
	public Supplier_Supplies_Product(Supplier supplier, Product product, float price)
	{
		this.supplier = supplier;
		this.product = product;
		this.price = price;
	}
	
	public Supplier getSupplier()
	{
		return this.supplier;
	}
	
	public void setSupplier(Supplier supplier)
	{
		this.supplier = supplier;
	}
	
	public Product getProduct()
	{
		return this.product;
	}
	
	public void setProduct(Product product)
	{
		this.product = product;
	}
	
	public float getPrice()
	{
		return this.price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}

}
