
public class Supplier_Supplies_Product {
	
	private Supplier supplier;
	private	Product product;
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
