package com.qac.row5project.helpers;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

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

		products.add(new Product("Gnome Gotta Gname", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 1, "Ornament", "Active", "Bonnie"));

		products.get(0).setProductId(0);
		products.add(new Product("Stylish Gnome", "Funky...", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", "Brian"));

		products.get(0).setProductId(1);
		
		ratings.add(new Rating(4, 0, 1));
		
		products.add(new Product("Name", "Desc", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", "Brian"));
		products.add(new Product("Gnome Gotta Gname", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 3, "Ornament", "Active", "Bonnie"));
		products.add(new Product("Stylish Gnome", "Funky...", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", "Brian"));
		products.add(new Product("Gnome Gotta Gname", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 5, "Ornament", "Active", "Bonnie"));
		products.add(new Product("Stylish Gnome", "Funky...", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", "Brian"));
		products.add(new Product("Gnome Gotta Gname", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 6, "Ornament", "Active", "Bonnie"));

		
		
		
		
		LoginDetails testLogin = new LoginDetails("test@test.com", "password");
		loginDetails.add(testLogin);
		
		LoginDetails imsLogin = new LoginDetails("manager@nb.com", "password");
		loginDetails.add(imsLogin);
		
		Supplier s = new Supplier(1);
		
		Calendar c = Calendar.getInstance();
		c.set(1, 1, 1990);
		
		
		customers.add(new Customer("Allen", "Richard", "Fall", c, testLogin));
		
		stocks.add(new Stock(20, false, 100, false, products.get(0), 200));
		stocks.add(new Stock(11, true, 50, false, products.get(1), 250));
		stocks.add(new Stock(11, true, 50, false, products.get(2), 250));

		Calendar c1 = Calendar.getInstance();

		c1.set(5, 6, 2012);
		purchaseOrders.add(new PurchaseOrder(1,s, "Pending",c , c1));
		generateCustomerOrder(50);
	}
	public void generateCustomerOrder(int q){
		CustomerOrder cOrder1;
		Random rand = new Random();
		Calendar c2 = Calendar.getInstance();
		int max = customers.size();
		int min = 0;
		//quantity
	    int randomNum ;
	    int randomNumYear;
	    int randomNumDay;
	    int randomNumMonth;
	    int  randomNumAddressID;
		for(int i=1;i<=q;i++)
		{
			randomNumAddressID = rand.nextInt((3 - 1) + 1) + 1;
			randomNum =	rand.nextInt((max - min) + 1) + min;
			randomNumYear = rand.nextInt((2016 - 1920) + 1) + 1920;
			randomNumDay = rand.nextInt((29 - 1) + 1) + 1;
			randomNumMonth = rand.nextInt((12 - 1) + 1) + 1;
			c2.set(randomNumYear, randomNumMonth, randomNumDay);
			cOrder1 = new CustomerOrder(i,randomNum,c2,randomNumAddressID);
			customerOrders.add(cOrder1);
		}
	}
	public void generateCustomerOrderLine(){
		CustomerOrder cOrder1;
		Random rand = new Random();
		Calendar c2 = Calendar.getInstance();
		ArrayList rStock =new ArrayList();
	    int randomNumQuantity;
	    int randomNumStock;
	    int randomNumlines;
		for(int i=1;i<=customerOrders.size();i++)
		{

			randomNumlines = rand.nextInt((10 - 1) + 1) + 1;
			for(int j=1;j<=randomNumlines;i++)
			{
			randomNumQuantity = rand.nextInt((3 - 1) + 1) + 1;
			randomNumStock = rand.nextInt((stocks.size() - 0) + 1) + 0;
			for(int g=0;g<rStock.size();g++)
			{
			CustomerOrderLine cOrderLine = new CustomerOrderLine(i,randomNumQuantity,stocks.get(randomNumStock));
			customerOrders.get(i).addToCustomerOrderLine(cOrderLine);
			}
			}
		}
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

	public void setCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		
		this.customerOrderLine.add(customerOrderLine);
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