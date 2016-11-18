package com.qac.row5project.entities;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class TestData {
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

	public ArrayList<CustomerOrder> getCustomerorders() {
		return customerOrders;
	}

	public void setCustomerorders(ArrayList<CustomerOrder> customerorders) {
		this.customerOrders = customerorders;
	}

	public ArrayList<CustomerOrderLine> getCustomerorderline() {
		return customerOrderLine;
	}

	public void setCustomerorderline(ArrayList<CustomerOrderLine> customerorderline) {
		this.customerOrderLine = customerorderline;
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

	public ArrayList<LoginDetails> getLogindetails() {
		return loginDetails;
	}

	public void setLogindetails(ArrayList<LoginDetails> logindetails) {
		this.loginDetails = logindetails;
	}

	public ArrayList<Payment> getPayments() {
		return payments;
	}

	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}

	public ArrayList<PurchaseOrder> getPurchaseorders() {
		return purchaseOrders;
	}

	public void setPurchaseorders(ArrayList<PurchaseOrder> purchaseorders) {
		this.purchaseOrders = purchaseorders;
	}

	public ArrayList<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(ArrayList<Rating> ratings) {
		this.ratings = ratings;
	}

	public ArrayList<SecurityQuestion> getSecurityquestions() {
		return securityQuestions;
	}

	public void setSecurityquestions(ArrayList<SecurityQuestion> securityquestions) {
		this.securityQuestions = securityquestions;
	}

	public ArrayList<Stock> getStockitems() {
		return stockItems;
	}

	public void setStockitems(ArrayList<Stock> stockitems) {
		this.stockItems = stockitems;
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