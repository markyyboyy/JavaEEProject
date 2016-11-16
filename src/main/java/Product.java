
class Product {
	private int productId;
	private String name;
	private String desc;
	private double price;
	private double weight;
	private String colour;
	private int size;
	private int quantity;

	private enum status {
		COMINGSOON, ACTIVE, DISCONTINUED
	}

	public Product() {
	}

	public Product(Product product, String name, String desc, double price, double weight, String colour, int size,
			int quantity) {
		this.productId = productId;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
		this.size = size;
		this.quantity = quantity;
	}

	public void setProduct(Product product) {
		this.productId = productId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}