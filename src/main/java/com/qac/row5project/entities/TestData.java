
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
	private ArrayList<ProductSupplier> productSuppliers;
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