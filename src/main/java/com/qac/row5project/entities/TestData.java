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
	private ArrayList<Product> products;
	private ArrayList<Stock> stocks;
	private ArrayList<Customer> customers;
	private ArrayList<Address> addresses;
	private ArrayList<CustomerOrder> customerOrders;
	private ArrayList<CustomerOrderLine> customerOrderLine;
	private ArrayList<Employee> employees;
	private ArrayList<Feedback> feedbacks;
	private ArrayList<Image> images;
	private ArrayList<LoginDetails> loginDetails;
	private ArrayList<Payment> payments;
	private ArrayList<PurchaseOrder> purchaseOrders;
	private ArrayList<Rating> ratings;
	private ArrayList<SecurityQuestion> securityQuestions;
	private ArrayList<Stock> stockItems;
	private ArrayList<Supplier_Supplies_Product> supplierSuppliesProducts;
	private ArrayList<Supplier> suppliers;
	private ArrayList<WishList> wishlists;

	@PostConstruct
	private void setupData() {
		products = new ArrayList<Product>();
		stocks = new ArrayList<Stock>();
		customers = new ArrayList<Customer>();
		addresses = new ArrayList<Address>();
		customerOrders = new ArrayList<CustomerOrder>();
		customerOrderLine = new ArrayList<CustomerOrderLine>();
		employees = new ArrayList<Employee>();
		feedbacks = new ArrayList<Feedback>();
		images = new ArrayList<Image>();
		loginDetails = new ArrayList<LoginDetails>();
		payments = new ArrayList<Payment>();
		purchaseOrders = new ArrayList<PurchaseOrder>();
		ratings = new ArrayList<Rating>();
		securityQuestions = new ArrayList<SecurityQuestion>();
		stockItems = new ArrayList<Stock>();
		supplierSuppliesProducts = new ArrayList<Supplier_Supplies_Product>();
		suppliers = new ArrayList<Supplier>();
		wishlists = new ArrayList<WishList>();
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<Stock> stocks) {
		this.stocks = stocks;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}

	public ArrayList<CustomerOrder> getCustomerOrders() {
		return customerOrders;
	}

	public void setCustomerOrders(ArrayList<CustomerOrder> customerOrders) {
		this.customerOrders = customerOrders;
	}

	public ArrayList<CustomerOrderLine> getCustomerOrderLine() {
		return customerOrderLine;
	}

	public void setCustomerOrderLine(ArrayList<CustomerOrderLine> customerOrderLine) {
		this.customerOrderLine = customerOrderLine;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(ArrayList<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public ArrayList<Image> getImages() {
		return images;
	}

	public void setImages(ArrayList<Image> images) {
		this.images = images;
	}

	public ArrayList<LoginDetails> getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(ArrayList<LoginDetails> loginDetails) {
		this.loginDetails = loginDetails;
	}

	public ArrayList<Payment> getPayments() {
		return payments;
	}

	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}

	public ArrayList<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}

	public void setPurchaseOrders(ArrayList<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

	public ArrayList<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(ArrayList<Rating> ratings) {
		this.ratings = ratings;
	}

	public ArrayList<SecurityQuestion> getSecurityQuestions() {
		return securityQuestions;
	}

	public void setSecurityQuestions(ArrayList<SecurityQuestion> securityQuestions) {
		this.securityQuestions = securityQuestions;
	}

	public ArrayList<Stock> getStockItems() {
		return stockItems;
	}

	public void setStockItems(ArrayList<Stock> stockItems) {
		this.stockItems = stockItems;
	}

	public ArrayList<Supplier_Supplies_Product> getSupplierSuppliesProducts() {
		return supplierSuppliesProducts;
	}

	public void setSupplierSuppliesProducts(ArrayList<Supplier_Supplies_Product> supplierSuppliesProducts) {
		this.supplierSuppliesProducts = supplierSuppliesProducts;
	}

	public ArrayList<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(ArrayList<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public ArrayList<WishList> getWishlists() {
		return wishlists;
	}

	public void setWishlists(ArrayList<WishList> wishlists) {
		this.wishlists = wishlists;
	}
}