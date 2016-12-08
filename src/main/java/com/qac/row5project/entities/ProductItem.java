package com.qac.row5project.entities;



	import java.util.List;



	public class ProductItem {
		private long id;
		private String name;
		private String description;
		private double size;
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
		 * @param size
		 * @param weight
		 * @param stockLevel
		 * @param price
		 */
		public ProductItem(long id, String name, String description, double size, double weight, 
			 String status, String supplier, String category) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.weight = weight;
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
		public void addProductInfo(long id, String name, String description, double size, double weight, String status, String supplier, String category) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.weight = weight;
			this.averageRating = 0;
			this.status = status;
			this.supplier = supplier;
			this.category = category;
		}

		public void addStockInfo(int stockLevel, float price) {
			this.stockLevel = stockLevel;
			this.price = price;
		}
		
		public void addRatingInfo(List<Rating> r){
			this.ratings = r;
		}
		
		

		public long getId() { return id; }
		public String getName() { return name; }
		public String getDescription() { return description; }
		public double getSize() {return size;}
		public int getStockLevel() { return stockLevel; }
		public double getPrice() { return price; }
		public List<Rating> getRating() { return ratings; }

		public double getWeight() {
			return weight;
		}

		public List<Rating> getRatings() {
			return ratings;
		}

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

