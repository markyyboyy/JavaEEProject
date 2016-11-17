package com.qac.row5project.entities;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
@Startup
@Singleton
public class TestData {
private List<Product> products;
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
		products = new ArrayList<Product>();
stocks = new ArrayList<Stock>();
customers = new ArrayList<Customer>();
addresses = new ArrayList<Address>();
customerorders = new ArrayList<CustomerOrder>();
customerorderline = new ArrayList<CustomerOrderLine>();
employees = new ArrayList<Employee>();
feedbacks = new ArrayList<Feedback>();
images = new ArrayList<Image>();
logindetails = new ArrayList<LoginDetails>();
payments = new ArrayList<Payment>();
purchaseorders = new ArrayList<PurchaseOrder>();
ratings = new ArrayList<Rating>();
securityquestions = new ArrayList<SecurityQuestion>();
stockitems = new ArrayList<Stock>();
supplierSuppliesProducts = new ArrayList<Supplier_Supplies_Product>();
suppliers = new ArrayList<Supplier>();
wishlists = new ArrayList<WishList>();
}
public void setProducts(List<Product> products){
	this.products = products;
}
public void setStocks(List<Stock> stocks){
	this.stocks = stocks;
}
public void setCustomers(List<Customer> customers){
	this.customers = customers;
}
public void setAddresses(List<Address> addresses){
	this.addresses = addresses;
}
public void setCustomerOrders(List<CustomerOrder> customerorders){
	this.customerorders = customerorders;
}
public void setCustomerOrderLines(List<CustomerOrderLine> customerorderlines){
	this.customerorderline = customerorderlines;
}
public void setEmployees(List<Employee> employees){
	this.employees = employees;
}
public void setFeedbacks(List<Feedback> feedbacks){
	this.feedbacks = feedbacks;
}
public void setImages(List<Image> images){
	this.images = images;
}
public void setLoginDetails(List<LoginDetails> logindetails){
	this.logindetails = logindetails;
}
public void setPayments(List<CustomerOrderLine> customerorderlines){
	this.customerorderline = customerorderlines;
}
public void setPurchaseOrders(List<PurchaseOrder> purchaseorders){
	this.purchaseorders = purchaseorders;
}
public void setRatings(List<Rating> ratings){
	this.ratings = ratings;
}
public void setSecurityQuestions(List<SecurityQuestion> securityquestions){
	this.securityquestions = securityquestions;
}
public void setStockItems(List<Stock> stockitems){
	this.stockitems = stockitems;
}
public void setSupplierSuppliesProducts(List<Supplier_Supplies_Product> suppliersuppliesproducts){
	this.supplierSuppliesProducts = suppliersuppliesproducts;
}
public void setSuppliers(List<Supplier> suppliers){
	this.suppliers = suppliers;
}
public void setWishlists(List<WishList> wishlists){
	this.wishlists = wishlists;
}
public List<Product> getProducts(){
	return products;
}
public List<Stock> getStocks(){
	return stocks;
}
public List<Customer> getCustomers(){
	return customers;
}
public List<Address> getAddresses(){
	return addresses;
}
public List<CustomerOrder> getCustomerOrders(){
	return customerorders;
}
public List<CustomerOrderLine> getCustomerOrderLines(){
	return customerorderline;
}
public List<Employee> getEmployees(){
	return employees;
}
public List<Feedback> getFeedbacks(){
	return feedbacks;
}
public List<Image> getImages(){
	return images;
}
public List<LoginDetails> getLoginDetails(){
	return logindetails;
}
public List<CustomerOrderLine> getPayments(){
	return customerorderline;
}
public List<PurchaseOrder> getPurchaseOrders(){
	return purchaseorders;
}
public List<Rating> getRatings(){
	return ratings;
}
public List<SecurityQuestion> getSecurityQuestions(){
	return securityquestions;
}
public List<Stock> getStockItems(){
	return stockitems;
}
public List<Supplier_Supplies_Product> getSupplierSuppliesProducts(){
	return supplierSuppliesProducts;
}
public List<Supplier> getSuppliers(){
	return suppliers;
}
public List<WishList> getWishlists(){
	return wishlists;
}
}