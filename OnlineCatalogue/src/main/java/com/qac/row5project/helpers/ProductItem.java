package com.qac.row5project.helpers;
	import java.util.List;

import com.qac.row5project.entities.Category;
import com.qac.row5project.entities.ItemStatus;
import com.qac.row5project.entities.Rating;

	public class ProductItem {
		private long id;
		private String name;
		private String desc;
		private double size;
		private double weight;
		private int stockLevel;
		private double price;
		private List<Rating> ratings;
		private int averageRating;
		private long supplierID;
		Category category;
		ItemStatus status;
		private boolean inStock;
		private String url;
		
		public ProductItem(){}
		
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
		public ProductItem(long id, String name, String desc, double size, double weight, 
			 ItemStatus status, long supplierID, Category category) {
			this.id = id;
			this.name = name;
			this.desc= desc;
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
		public void addProductInfo(long id, String name, String desc, double size, double weight, ItemStatus status, long supplierID, Category category) {
			this.id = id;
			this.name = name;
			this.desc= desc;
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

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc= desc;
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

		public long getSupplierID() {
			return supplierID;
		}

		public void setSupplier(long supplierID) {
			this.supplierID = supplierID;
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
		
		public boolean isinStock(){
		    return (this.stockLevel > 0) ? true : false;
		}

		public String getUrl() {
		    return url;
		}

		public void setUrl(String url) {
		    this.url = url;
		}

	}

