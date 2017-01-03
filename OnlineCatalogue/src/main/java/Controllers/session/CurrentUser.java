package Controllers.session;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.qac.row5project.entities.Customer;

/**
 * @Author Richard Allen
 */


@Named("user")
@SessionScoped	
public class CurrentUser implements Serializable{

	private static final long serialVersionUID = 1111L;
	private Customer customer = null;
	
	
	/**
	 * Set logged in customer
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 * Retrive the current customer logged in
	 * @return current customer
	 */	
	public Customer getCustomer()
	{
		return this.customer;
	}
	
	/**
	 * Check if a user is logged in
	 * @return Boolean of current customer
	 */
	public boolean isLoggedIn(){
		return (customer == null) ? false : true;
	}
	
	

	public void getBasket() {
		
	}
}
