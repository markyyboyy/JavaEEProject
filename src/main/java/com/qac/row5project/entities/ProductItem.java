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
		private int stockLevel;
		private double price;
		private List<Rating> ratings;
		private int averageRating;
		private String status;
		private String supplier;
		private String category;
		
		
		public ProductItem(){}
		
		public int getAverageRating() {
			return averageRating;
		}

		public void setAverageRating(int averageRating) {
			this.averageRating = averageRating;
		}

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
		 * @param stockLevel
		 * @param price
		 */
		public ProductItem(long id, String name, String description, double height, double width, double depth, double weight, 
				int stockLevel, double price, String status, String supplier, String category) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.height = height;
			this.width = width;
			this.depth = depth;
			this.weight = weight;
			this.stockLevel = stockLevel;
			this.price = price;
			this.averageRating = 0;
			this.status = status;
			this.supplier = supplier;
			this.category = category;
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
		public int getStockLevel() { return stockLevel; }
		public double getPrice() { return price; }
		public List<Rating> getRating() { return ratings; }

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getSupplier() {
			return supplier;
		}

		public void setSupplier(String supplier) {
			this.supplier = supplier;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
		
	}

