package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.managers.CustomerManager;
import com.qac.services.LoginService;

import Controllers.session.CurrentUser;

/**
 * 
 * @author Richard Allen
 *
 */

@Named("login")
@RequestScoped
public class Login {

    @Inject
    private CurrentUser currentUser;

    @Inject
    private LoginService loginService;

    @Inject
    private CustomerManager customerManager;

    private String email = "";
    private String password = "";

    private boolean forgottenSent = false;

    /**
     * Retrieve email variable
     * 
     * @return email address from form
     */
    public String getEmail() {
	return this.email;
    }

    /**
     * Retrieve password variable
     * 
     * @return password from form
     */
    public String getPassword() {
	return this.password;
    }

    /**
     * Set email address from form
     * 
     * @param email
     */
    public void setEmail(String email) {
	this.email = email;
    }

    /**
     * Set password variable
     * 
     * @param password
     *            from form
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * Pass login information if both email and password exist to login service
     * 
     * @return home page
     */
    public String login() {
	try {
	    if (!email.isEmpty() && !password.isEmpty()) {
		if (loginService.validLogin(email, password)) {
		    currentUser.setCustomer(customerManager.readCustomerByEmail(email.toLowerCase()));
		    System.out.println("Logged In");
		} else {
		    password = "";
		    return "login";
		}
	    }
	    return "home";
	} catch (Exception e) {
	    return "login";
	}
    }

    /**
     * Set current customer to null
     * 
     * @return login page
     */
    public String logoff() {
	currentUser.setCustomer(null);
	System.out.println("Logged out");
	return "home";
    }

    public void forgotten() {
	this.forgottenSent = true;
    }

    public boolean isForgottenSent() {
	return this.forgottenSent;
    }

}
