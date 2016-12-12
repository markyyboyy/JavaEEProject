package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.managers.EmployeeManager;
import com.qac.services.LoginService;

import Controllers.session.CurrentUserEmployee;
/**
 * 
 * @author Richard Allen
 *
 */	



@Named("login")
@RequestScoped
public class Login {
	
	@Inject
	private CurrentUserEmployee currentUserEmployee;
	
	@Inject
	private LoginService loginService;
	

	@Inject
	private EmployeeManager empManager;

	private String email = "";
	private String password = "";

	/**
	 * Retrieve email variable
	 * @return email address from form
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Retrieve password variable
	 * @return password from form
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Set email address from form
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set password variable
	 * @param password from form
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
	/**
	 * Pass login information if both email and password exist to login service for the ims
	 * @return ims front page
	 */
	public String ims() {
		if (!email.isEmpty() && !password.isEmpty()) {
			if (loginService.validLogin(email, password)) {
				currentUserEmployee.setEmployee(empManager.readEmployee(email.toLowerCase()));
				System.out.println("Logged In");
			} else {
				password = "";
			}
		}
		return "imsFrontPage";
	}

	/**
	 * Set current employee to null
	 * @return ims login page
	 */
	public String imsLogoff(){
		currentUserEmployee.setEmployee(null);
		System.out.println("Logged out");
		return "imsLogin";
	}
}
