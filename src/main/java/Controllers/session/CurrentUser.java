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
	private static final long serialVersionUID = 1111L;
	private Customer customer = null;

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer()
	{
		return this.customer;
	}
	
	public boolean isLoggedIn(){
		return (customer == null) ? false : true;
	}
	
	public String logoff(){
		this.setCustomer(null);
		System.out.println("Logged out");
		return "login";
	}
}
