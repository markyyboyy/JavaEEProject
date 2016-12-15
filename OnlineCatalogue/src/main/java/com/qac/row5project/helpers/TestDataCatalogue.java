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
public class TestDataCatalogue {

	private List<Product> products;
	private List<Stock> stocks;
	private List<Customer> customers;
	private List<Address> addresses;
	private List<CustomerOrder> customerOrders;
	private List<CustomerOrderLine> customerOrderLines;
	private List<Feedback> feedbacks;
	private List<Image> images;
	private List<LoginDetails> loginDetails;
	private List<Payment> payments;
	private List<Rating> ratings;
	private List<SecurityQuestion> securityQuestions;


	/***
	 * 
	 * This method runs after the object is made and initialises all the
	 * variables and adds the data.
	 *
	 */
	@PostConstruct
	private void setupData() {
		products = new ArrayList<Product>();
		customers = new ArrayList<Customer>();
		addresses = new ArrayList<Address>();
		customerOrders = new ArrayList<CustomerOrder>();
		customerOrderLines = new ArrayList<CustomerOrderLine>();

		feedbacks = new ArrayList<Feedback>();
		images = new ArrayList<Image>();
		loginDetails = new ArrayList<LoginDetails>();
		payments = new ArrayList<Payment>();
	
		ratings = new ArrayList<Rating>();
		securityQuestions = new ArrayList<SecurityQuestion>();
		stocks = new ArrayList<Stock>();

		//Test Login Details
		LoginDetails testLogin = new LoginDetails("test@test.com", "password");
		loginDetails.add(testLogin);
		LoginDetails imsLogin = new LoginDetails("manager@nb.com", "password");
		loginDetails.add(imsLogin);
		
		//Test Customer
		Calendar c = Calendar.getInstance();
		c.set(1, 1, 1990);
		Address testAddress = new Address("12", "Main Road", "Street", "London", "Surrey", "SW56 KLM", "England"); 
		Address testAddress2 = new Address("8", "London Street", "Road", "Manchester", "Salford", "M23 9OP", "England");
		Customer testCust = new Customer("Allen", "Richard", "Fall", c, testLogin, testAddress);
		
		List<Address> addressList = new ArrayList<>();
		addressList.add(testAddress);
		addressList.add(testAddress2);
		testCust.setAddress(addressList);
		
		testCust.setBalance(50.5);
		customers.add(testCust);
		
		//Test Product
		products.add(new Product("Ynyr", "Gnome of Ynyr", 14.99, 14.0, "Blue", 21.0,
				1, Category.ORNAMENTS, ItemStatus.AVAILABLE));
		products.get(0).setProductID(1);
	
		products.add(new Product("Ryan", "Gnome of Ryan", 14.99, 14.0, "Red", 21.0,
				1, Category.ORNAMENTS, ItemStatus.AVAILABLE));
		products.get(1).setProductID(2);
		
		products.add(new Product("Iman", "Gnome of Iman", 14.99, 14.0, "Orange", 21.0,
				1, Category.ORNAMENTS, ItemStatus.AVAILABLE));
		products.get(2).setProductID(3);
		
		products.add(new Product("Mark", "Gnome of Mark", 14.99, 14.0, "Purple", 21.0,
				1, Category.ORNAMENTS, ItemStatus.AVAILABLE));
		products.get(3).setProductID(4);
		
		products.add(new Product("Richard", "Gnome of Richard", 14.99, 14.0, "Green", 21.0,
				1, Category.ORNAMENTS, ItemStatus.AVAILABLE));
		products.get(4).setProductID(5);
		
		products.add(new Product("Michael", "Gnome of Michael", 14.99, 14.0, "Yellow", 21.0,
				1, Category.ORNAMENTS, ItemStatus.AVAILABLE));
		products.get(5).setProductID(6);
		
		//Test Images
		Image img1 = new Image("./img/ggnome1.jpg","image", 1L);
		Image img2 = new Image("./img/ggnome2.jpg","image", 2L);
		Image img3 = new Image("./img/ggnome3.jpg","image", 3L);
		Image img4 = new Image("./img/fgnome1.jpeg","image", 4L);
		Image img5 = new Image("./img/ggnome3.jpg","image", 5L);
		Image img6 = new Image("./img/fgnome1.jpeg","image", 6L);
		
		images.add(img1);
		images.add(img2);
		images.add(img3);
		images.add(img4);
		images.add(img5);
		images.add(img6);
		
		//Test Stock
		stocks.add(new Stock(0, false, 5, false, products.get(0), 200));
		stocks.add(new Stock(1, true, 3, false, products.get(1), 250));
		stocks.add(new Stock(2, true, 10, false, products.get(2), 250));
		stocks.add(new Stock(3, false, 15, false, products.get(3), 200));
		stocks.add(new Stock(4, true, 1, false, products.get(4), 250));
		Calendar c1 = Calendar.getInstance();

		ratings.add(new Rating((short) 3, 0, 0));
		
		c1.set(5, 6, 2012);
		
		//generateCustomerOrder(50);
	}

	/***
	 * This method generates a random customerorder of the quantity specified.
	 * 
	 * @author Ynyr Williams
	 * @param q
	 *
	 */
	public void generateCustomerOrder(int q) {

		// DECLARE ALL NECESSARY VARIABLES FOR CUSTOMER ORDER
		CustomerOrder cOrder1;
		Random rand = new Random();
		Calendar c2 = Calendar.getInstance();
		//change variable names
		int randomFeedback;
		int randomNumYear;
		int randomNumDay;
		int randomNumMonth;
		int randomNumAddressID;
		// ITERATES FOR THE QUANTITY OF CUSTOMER ORDER SPECIFIED
		for (long i = 1; i <= q; i++) {
			// SET VARIABLES TO RANDOM LEVELS
			// address specified between 1 and 3
			randomNumAddressID = rand.nextInt((3 - 1) + 1) + 1;
			// sets feedback id between 0 and the number of customers
			randomFeedback = rand.nextInt((customers.size() - 0) + 1) + 0;
			// sets date between 1920 and 2016
			randomNumYear = rand.nextInt((2016 - 1920) + 1) + 1920;
			randomNumDay = rand.nextInt((29 - 1) + 1) + 1;
			randomNumMonth = rand.nextInt((12 - 1) + 1) + 1;
			c2.set(randomNumYear, randomNumMonth, randomNumDay);
			cOrder1 = new CustomerOrder(i, randomFeedback, c2, randomNumAddressID, 1L);
			customerOrders.add(cOrder1);
		}
	}

	/***
	 * This method generates a random customerorderLine of random quantity
	 * specified.
	 * 
	 * @author Ynyr Williams
	 *
	 */
	//TODO
	public void generateCustomerOrderLine() {
		CustomerOrder cOrder1;
		Random rand = new Random();
		Calendar c2 = Calendar.getInstance();
		ArrayList rStock = new ArrayList<>();
		int randomNumQuantity;
		int randomNumStock;
		int randomNumlines;
		for (int i = 1; i <= customerOrders.size(); i++) {
			randomNumlines = rand.nextInt((10 - 1) + 1) + 1;
			for (int j = 1; j <= randomNumlines; i++) {
				randomNumQuantity = rand.nextInt((3 - 1) + 1) + 1;
				randomNumStock = rand.nextInt((stocks.size() - 0) + 1) + 0;
				for (int g = 0; g < rStock.size(); g++) {
					CustomerOrderLine cOrderLine = new CustomerOrderLine(i, randomNumQuantity,
							stocks.get(randomNumStock));
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
		return customerOrderLines;
	}

	public void setCustomerOrderLine(CustomerOrderLine customerOrderLine) {

		this.customerOrderLines.add(customerOrderLine);
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
		return stocks;
	}

	public void setStockItems(List<Stock> stockItems) {
		this.stocks = stockItems;
	}

}