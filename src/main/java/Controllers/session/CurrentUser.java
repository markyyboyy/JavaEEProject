package Controllers.session;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.qac.row5project.entities.Customer;

/**
 * @Author Richard Allen
 */

@Named("user")
@SessionScoped
public class CurrentUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Customer customer = null;

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer()
	{
		return this.customer;
	}
	
	public boolean isLoggedIn(){
		return (customer ==null) ? true : false;
	}
	
	public void logoff(){
		this.customer = null;
		System.out.println("Logged out");
	}
}
