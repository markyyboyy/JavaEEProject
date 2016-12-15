package com.qac.row5project.helpers;

import com.qac.row5project.entities.Rating;

public class ProductWrapper {
private ProductItem productItem;
private Rating ratingItem;
public ProductWrapper(ProductItem productItem, Rating ratingItem){
	this.productItem = productItem;
	this.ratingItem = ratingItem;
}
public ProductItem getProductItem() {
	return productItem;
}
public void setProductItem(ProductItem productItem) {
	this.productItem = productItem;
}
public Rating getRatingItem() {
	return ratingItem;
}
public void setIntValue(Rating ratingItem) {
	this.ratingItem = ratingItem;
}
}
