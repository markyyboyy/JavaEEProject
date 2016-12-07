package com.qac.row5project.helpers;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.qac.row5project.entities.*;

/***
 * 
 * @author Mark Freeman & Ynyr Williams
 *
 */
@Startup
@Singleton
public class TestData {

	private List<Product> products;
	private List<Stock> stocks;
	private List<Customer> customers;
	private List<Address> addresses;
	private List<CustomerOrder> customerOrders;
	private List<CustomerOrderLine> customerOrderLine;
	private List<Employee> employees;
	private List<Feedback> feedbacks;
	private List<Image> images;
	private List<LoginDetails> loginDetails;
	private List<Payment> payments;
	private List<PurchaseOrder> purchaseOrders;
	private List<Rating> ratings;
	private List<SecurityQuestion> securityQuestions;
	private List<Stock> stockItems;
	private List<ProductSupplier> productSuppliers;
	private List<Supplier> suppliers;

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
		productSuppliers = new ArrayList<ProductSupplier>();
		suppliers = new ArrayList<Supplier>();

		
		Product product = new Product("Name", "Desc", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", "Brian");
		products.add(product);
		Rating r = new Rating(3, product.getProductId(), product.getProductId());
		ratings.add(r);
		products.add(new Product("Gnome Gotta Gname", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 18, "Ornament", "Active", "Bonnie"));
		products.add(new Product("Name", "Desc", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", "Brian"));
		products.add(new Product("Gnome Gotta Gname", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 18, "Ornament", "Active", "Bonnie"));
		products.add(new Product("Name", "Desc", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", "Brian"));
		products.add(new Product("Gnome Gotta Gname", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 18, "Ornament", "Active", "Bonnie"));
		products.add(new Product("Name", "Desc", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", "Brian"));
		products.add(new Product("Gnome Gotta Gname", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 18, "Ornament", "Active", "Bonnie"));
		
		
		
		Calendar c= Calendar.getInstance();
		c.set(1990, 11, 05);
		
		LoginDetails testLogin = new LoginDetails("test@test.com", "password");
		loginDetails.add(testLogin);
		
		customers.add(new Customer("Allen", "Richard", "Fall", c, testLogin));
		
		
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<CustomerOrder> getCustomerOrders() {
		return customerOrders;
	}


	public void setCustomerOrders(List<CustomerOrder> customerOrders) {
		this.customerOrders = customerOrders;
	}

	public List<CustomerOrderLine> getCustomerOrderLine() {
		return customerOrderLine;
	}

	public void setCustomerOrderLine(List<CustomerOrderLine> customerOrderLine) {
		this.customerOrderLine = customerOrderLine;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<LoginDetails> getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(List<LoginDetails> loginDetails) {
		this.loginDetails = loginDetails;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}

	public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public List<SecurityQuestion> getSecurityQuestions() {
		return securityQuestions;
	}

	public void setSecurityQuestions(List<SecurityQuestion> securityQuestions) {
		this.securityQuestions = securityQuestions;
	}

	public List<Stock> getStockItems() {
		return stockItems;
	}

	public void setStockItems(List<Stock> stockItems) {
		this.stockItems = stockItems;
	}


	public List<ProductSupplier> getProductSupplier() {
		return productSuppliers;
	}

	public void setProductSupplier(List<ProductSupplier> productSupplier) {
		this.productSuppliers = productSupplier;
	}

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
}