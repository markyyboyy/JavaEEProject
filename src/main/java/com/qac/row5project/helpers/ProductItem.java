package com.qac.row5project.helpers;
	import java.util.List;

import com.qac.row5project.entities.Category;
import com.qac.row5project.entities.ItemStatus;
import com.qac.row5project.entities.Rating;
import com.qac.row5project.entities.Supplier;

	public class ProductItem {
		private long ID;
		private String name;
		private String description;
		private double size;
		private double weight;
		private int stockLevel;
		private double price;
		private List<Rating> ratings;
		private int averageRating;
		Category category;
		ItemStatus status;
		private long supplierID;

		
		public ProductItem(){}
		
		public ProductItem(long ID) {
			this.ID = ID;
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
		public ProductItem(long ID, String name, String description, double size, double weight, 
			 ItemStatus status, Category category, long supplierID) {
			this.ID = ID;
			this.name = name;
			this.description = description;
			this.weight = weight;
			this.averageRating = 0;
			this.status = status;
			this.supplierID = supplierID;
			this.category = category;
		}
		//update javadoc
		/***
		 * @param id
		 * @param name
		 * @param description
		 * @param height
		 * @param width
		 * @param 
		 * @param weight
		 */
		public void addProductInfo(long ID, String name, String description, double size, double weight, ItemStatus status, long supplierID, Category category) {
			this.ID = ID;
			this.name = name;
			this.description = description;
			this.weight = weight;
			this.averageRating = 0;
			this.status = status;
			this.supplierID = supplierID;
			this.category = category;
		}
		//constructor for average rating

		public void addStockInfo(int stockLevel, float price) {
			this.stockLevel = stockLevel;
			this.price = price;
		}
		
		public void addRatingInfo(List<Rating> r){
			this.ratings = r;
		}

		public long getID() {
			return ID;
		}

		public void setID(long ID) {
			this.ID = ID;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getSize() {
			return size;
		}

		public void setSize(double size) {
			this.size = size;
		}

		public int getStockLevel() {
			return stockLevel;
		}

		public void setStockLevel(int stockLevel) {
			this.stockLevel = stockLevel;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public void setRatings(List<Rating> ratings) {
			this.ratings = ratings;
		}

		public double getWeight() {
			return weight;
		}

		public List<Rating> getRatings() {
			return ratings;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public ItemStatus getStatus() {
			return status;
		}

		public void setStatus(ItemStatus status) {
			this.status = status;
		}

		public int getAverageRating() {
			return averageRating;
		}

		public void setAverageRating(int averageRating) {
			this.averageRating = averageRating;
		}

	}

