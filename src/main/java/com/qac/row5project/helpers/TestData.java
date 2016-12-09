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
 * This class represents dummy data to be used for testing purposes.
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
	/***
	 * 
	 * This method runs after the object is made and initialises all the variables.
	 *
	 */
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
		
		suppliers.add(new Supplier());
		suppliers.add(new Supplier());
		
		
		products.add(new Product("Blue Gnome", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 1, "Ornament", "Active", suppliers.get(0)));
		products.get(0).setProductId(0);
		products.add(new Product("Stylish Gnome", "Funky...", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", suppliers.get(0)));

		stocks.add(new Stock(1, 50, products.get(0), 15.99f));
		products.get(1).setProductId(1);
		products.add(new Product("Red Gnome", "Funky...", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", suppliers.get(0)));
		products.get(2).setProductId(2);
		
		ratings.add(new Rating(4, 0, 1));
		
		products.add(new Product("Orange Gnome", "Desc", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", suppliers.get(0)));
		products.get(3).setProductId(3);
		products.add(new Product("Yellow Gnome", "Fsdgdsfsdfsd", 3434.34d, 10.3d, "Purple", 4, 3, "Ornament", "Active", suppliers.get(0)));
		products.get(4).setProductId(4);
		products.add(new Product("Brown Gnome", "Funky...", 3434.34d, 10.3d, "Black", 4, 18, "Garden", "Active", suppliers.get(0)));
		products.get(5).setProductId(5);

		LoginDetails testLogin = new LoginDetails("test@test.com", "password");
		loginDetails.add(testLogin);
		LoginDetails imsLogin = new LoginDetails("manager@nb.com", "password");
		loginDetails.add(imsLogin);
		
		Supplier s = new Supplier(1);	
		Calendar c = Calendar.getInstance();
		c.set(1, 1, 1990);
		
		
		customers.add(new Customer("Allen", "Richard", "Fall", c, testLogin));
		employees.add(new Employee(imsLogin, 10));
		
		stockItems.add(new Stock(0, false, 100, false, products.get(0), 200));
		stockItems.add(new Stock(1, true, 50, false, products.get(1), 250));
		stockItems.add(new Stock(2, true, 50, false, products.get(2), 250));
		stockItems.add(new Stock(3, false, 100, false, products.get(3), 200));
		stockItems.add(new Stock(4, true, 50, false, products.get(4), 250));
		stockItems.add(new Stock(5, true, 50, false, products.get(5), 250));

		Calendar c1 = Calendar.getInstance();

		c1.set(5, 6, 2012);
		purchaseOrders.add(new PurchaseOrder(1,s, "Pending",c , c1));
		generateCustomerOrder(50);
	}
	/***
	 * This method generates a random customerorder of the quantity specified.
	 * 
	 * @author Ynyr Williams
	 *@param q
	 *
	 */
	public void generateCustomerOrder(int q){
		
		//DECLARE ALL NECESSARY VARIABLES FOR CUSTOMER ORDER
		CustomerOrder cOrder1;
		Random rand = new Random();
		Calendar c2 = Calendar.getInstance();
	    int randomFeedback ;
	    int randomNumYear;
	    int randomNumDay;
	    int randomNumMonth;
	    int  randomNumAddressID;
	    //ITERATES FOR THE QUANTITY OF CUSTOMER ORDER SPECIFIED
		for(int i=1;i<=q;i++)
		{
			//SET VARIABLES TO RANDOM LEVELS
			//address specified between 1 and 3
			randomNumAddressID = rand.nextInt((3 - 1) + 1) + 1;
			//sets feedback id between 0 and the number of customers
			randomFeedback =	rand.nextInt((customers.size() - 0) + 1) + 0;
			//sets date between 1920 and 2016
			randomNumYear = rand.nextInt((2016 - 1920) + 1) + 1920;
			randomNumDay = rand.nextInt((29 - 1) + 1) + 1;
			randomNumMonth = rand.nextInt((12 - 1) + 1) + 1;
			c2.set(randomNumYear, randomNumMonth, randomNumDay);
			cOrder1 = new CustomerOrder(i,randomFeedback,c2,randomNumAddressID);
			customerOrders.add(cOrder1);
		}
	}
	/***
	 * This method generates a random customerorder of the quantity specified.
	 * 
	 * @author Ynyr Williams
	 *@param q
	 *
	 */
	public void generateCustomerOrderLine(){
		CustomerOrder cOrder1;
		Random rand = new Random();
		Calendar c2 = Calendar.getInstance();
		ArrayList rStock =new ArrayList<>();
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