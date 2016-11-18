package com.qac.row5project.entities;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class TestData {
private List<Product> addresses;
private List<Stock> stocks;
private List<Customer> customers;
private List<Address> addresses;
private List<CustomerOrder> customerorders;
private List<CustomerOrderLine> customerorderline;
private List<Employee> employees;
private List<Feedback> feedbacks;
private List<Image> images;
private List<LoginDetails> logindetails;
private List<Payment> payments;
private List<PurchaseOrder> purchaseorders;
private List<Rating> ratings;
private List<SecurityQuestion> securityquestions;
private List<Stock> stockitems;
private List<Supplier_Supplies_Product> supplierSuppliesProducts;
private List<Supplier> suppliers;
private List<WishList> wishlists;
@PostConstruct
private void setupData() {
products = new ArrayList<>();
stocks = new ArrayList<>();
customers = new ArrayList<>();
addresses = new ArrayList<>();
customerorders = new ArrayList<>();
customerorderline = new ArrayList<>();
employees = new ArrayList<>();
feedbacks = new ArrayList<>();
images = new ArrayList<>();
logindetails = new ArrayList<>();
payments = new ArrayList<>();
purchaseorders = new ArrayList<>();
ratings = new ArrayList<>();
securityquestions = new ArrayList<>();
stockitems = new ArrayList<>();
supplierSuppliesProducts = new ArrayList<>();
suppliers = new ArrayList<>();
wishlists = new ArrayList<>();
}
public void setProducts(ArrayList<Product> products){
	this.products = products;
}
public void setStocks(ArrayList<Stock> stocks){
	this.stock = stocks;
}
public void setCustomers(ArrayList<Customer> customers){
	this.customers = customers;
}
public void setAddresses(ArrayList<Address> addresses){
	this.addresses = addresses;
}
public void setCustomerOrders(ArrayList<CustomerOrder> customerorders){
	this.customerorders = customerorders;
}
public void setCustomerOrderLines(List<CustomerOrderLine> newCOLine){
	this.customerorderlines = newCOLine;
}
public void setEmployees(List<Employee> returned){
	this.employees = returned;
}
public void setFeedbacks(ArrayList<Feedback> feedbacks){
	this.feedbacks = feedbacks;
}
public void setImages(ArrayList<Image> images){
	this.images = images;
}
public void setLoginDetails(ArrayList<LoginDetails> logindetails){
	this.logindetails = logindetails;
}
public void setPayments(ArrayList<Payment> returned){
	this.customerorderlines = returned;
}
public void setPurchaseOrders(ArrayList<PurchaseOrder> purchaseorders){
	this.purchaseorders = purchaseorders;
}
public void setRatings(ArrayList<Rating> ratings){
	this.ratings = ratings;
}
public void setSecurityQuestions(ArrayList<SecurityQuestions> securityquestions){
	this.securityquestions = securityquestions;
}
public void setStockItems(ArrayList<Stock> stockitems){
	this.stockitems = stockitems;
}
public void setSupplierSuppliesProducts(ArrayList<Supplier_Supplies_Product> suppliersuppliesproducts){
	this.suppliersuppliesproducts = suppliersuppliesproducts;
}
public void setSuppliers(ArrayList<Supplier> suppliers){
	this.suppliers = suppliers;
}
public void setWishlists(ArrayList<Wishlist> wishlists){
	this.wishlists = wishlists;
}
public ArrayList<Products> getProducts(){
	return products;
}
public ArrayList<Stocks> getStocks(){
	return stocks;
}
public ArrayList<Customer> getCustomers(){
	return customers;
}
public ArrayList<Address> getAddresses(){
	return addresses;
}
public ArrayList<CustomerOrder> setCustomerOrders(){
	return customerorders;
}
public ArrayList<CustomerOrderLine> getCustomerOrderLines(){
	return customerorderlines;
}
public ArrayList<Employee> getEmployees(){
	return employees;
}
public ArrayList<Feedback> getFeedbacks(){
	return feedbacks;
}
public ArrayList<Image> getImages(){
	return images;
}
public ArrayList<LoginDetails> getLoginDetails(){
	return logindetails;
}
public ArrayList<Payment> getPayments()){
	return payments;
}
public ArrayList<PurchaseOrder> getPurchaseOrders(){
	return purchaseorders;
}
public ArrayList<Rating> getRatings(){
	return ratings;
}
public ArrayList<SecurityQuestions> getSecurityQuestions(){
	return securityquestions;
}
public ArrayList<Stock> getStockItems(){
	return stockitems;
}
public ArrayList<Supplier_Supplies_Product> getSupplierSuppliesProducts(){
	return suppliersuppliesproducts;
}
public ArrayList<Supplier> getSuppliers(){
	return suppliers;
}
public ArrayList<Wishlist> getWishlists(){
	return wishlists;
}