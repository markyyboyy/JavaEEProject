package com.qac.row5project.entities;



	import java.util.List;



	public class ProductItem {
		private long id;
		private String name;
		private String description;
		private double height;
		private double width;
		private double depth;
		private double weight;
		private List<String> categories;
		private int stockLevel;
		private double price;
		List<Rating> ratings;
		
		
		public ProductItem(){}
		
		public ProductItem(long id) {
			this.id = id;
		}
		
		/***
		 * 
		 * @param id
		 * @param name
		 * @param description
		 * @param height
		 * @param width
		 * @param depth
		 * @param weight
		 * @param categories
		 * @param stockLevel
		 * @param price
		 */
		public ProductItem(long id, String name, String description, double height, double width, double depth, double weight,
						List<String> categories, int stockLevel, double price) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.height = height;
			this.width = width;
			this.depth = depth;
			this.weight = weight;
			this.categories = categories;
			this.stockLevel = stockLevel;
			this.price = price;
		}

		/***
		 * 
		 * @param name
		 * @param description
		 * @param height
		 * @param width
		 * @param depth
		 * @param weight
		 */
		public void addProductInfo(String name, String description, double height, double width, double depth,
				double weight) {
			this.name = name;
			this.description = description;
			this.height = height;
			this.width = width;
			this.depth = depth;
			this.weight = weight;
		}

		public void addStockInfo(int stockLevel) {
			this.stockLevel = stockLevel;
		}
		
		public void addRatingInfo(List<Rating> r){
			this.ratings = r;
		}
		
		

		public long getId() { return id; }
		public String getName() { return name; }
		public String getDescription() { return description; }
		public double getHeight() { return height; }
		public double getWidth() { return width; }
		public double getDepth() { return depth; }
		public double getWeight() { return weight; }
		public List<String> getCategories() { return categories; }
		public int getStockLevel() { return stockLevel; }
		public double getPrice() { return price; }
		public List<Rating> getRating() { return ratings; }
		
	}

