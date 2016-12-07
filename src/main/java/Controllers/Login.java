package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.managers.CustomerManager;
import com.qac.services.LoginService;

import Controllers.session.CurrentUser;

/**
 * @Author Richard Allen
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

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (!email.isEmpty() && !password.isEmpty()) {
			if (loginService.validLogin(email, password)) {
				currentUser.setCustomer(customerManager.readCustomerByEmail(email.toLowerCase()));
				System.out.println("Logged In");
			} else {
				password = "";
			}
		}
		return "home";
	}
	
	public String logoff(){
		currentUser.setCustomer(null);
		System.out.println("Logged out");
		return "login";
	}
}
