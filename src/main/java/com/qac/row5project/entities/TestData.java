package com.qac.row5project.entities;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
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
	private List<WishList> wishlists;

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
		wishlists = new ArrayList<WishList>();
		WishList list = new WishList();
		ArrayList<Product> products = new ArrayList<Product>();
		Product p = new Product();
		p.setName("Gnome");
		p.setDesc("Gnome Desc");
		products.add(p);
		list.setProducts(products);
		wishlists.add(list);
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
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

	public void setCustomerOrders(List<CustomerOrder> co1) {
		this.customerOrders = co1;
	}

	public ArrayList<CustomerOrderLine> getCustomerOrderLine() {
		return customerOrderLine;
	}

	public void setCustomerOrderLine(List<CustomerOrderLine> customerOrderLine) {
		this.customerOrderLine = customerOrderLine;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
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


	public ArrayList<ProductSupplier> getProductSupplier() {
		return productSuppliers;
	}

	public void setProductSupplier(ArrayList<ProductSupplier> productSupplier) {
		this.productSuppliers = productSupplier;
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