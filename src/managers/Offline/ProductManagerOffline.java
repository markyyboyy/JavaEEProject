
@Stateless
@Default

public class ProductManager
implement ProductManagerOffline
{
	@Inject
	private TestData testData;

	// CREATE - INVENTORY MANAGER
	@Override
	public void createProduct(Product p) {
		List<Product> p = testData.getProduct();
		p.setProductId(customerOrder.size()+1));
		Product.add(p);
		testData.setProduct();
		}

	// UPDATE - INVENTORY MANAGER
	@Override
	public void updateProduct(Product p);

	List<Product> p = testData.getProduct();for(
	Product p:Product)if(product.getId())==productId)testData.setProduct();

	// READ - CUSTOMER/INVENTORY MANAGER
	@Override
	public Product readProductById(long id);

	{for(Product p : testData.getProduct())
		if(p.getId() == Id))
			return p;
		else {return null;}

	@Override
	public Product readProductByName(String name);

	{for(Product p : testData.getProduct())
		if(p.getName() == name))
			return p;
		else {return null;}

	@Override
	public Product readProductByColour(String colour);

	{for(Product p : testData.getProduct())
		if(p.getColour() == colour))
			return p;
		else {return null;}
	
}
