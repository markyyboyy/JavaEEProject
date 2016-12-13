package com.qac.row5project.helpers;

public class ProductWrapper {
private ProductItem productItem;
private Integer intValue;
public ProductWrapper(ProductItem productItem, Integer intValue){
	this.productItem = productItem;
	this.intValue = intValue;
}
public ProductItem getProductItem() {
	return productItem;
}
public void setProductItem(ProductItem productItem) {
	this.productItem = productItem;
}
public Integer getIntValue() {
	return intValue;
}
public void setIntValue(Integer intValue) {
	this.intValue = intValue;
}
}
