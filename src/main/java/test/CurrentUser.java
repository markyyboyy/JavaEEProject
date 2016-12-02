package test;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.qac.row5project.entities.Customer;


@Named(value = "user")
@SessionScoped
public class CurrentUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Customer customer = null;
	
	public boolean isLoggedIn(){
		return (customer == null) ? true : false;
	}
	
	public Customer getCustomer()
	{
		return this.customer;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	
	

}
