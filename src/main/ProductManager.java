
public interface  ProductManager {

	public Product createProduct(Product product);
	public void updateProduct(String name, String desc, double price, double weight, String colour, int size,
			int quantity);
	public Product readProduct(long id);
	
	
}
