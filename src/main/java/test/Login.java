package test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.services.LoginService;

@RequestScoped
@Named(value="login")
public class Login {

	@Inject
	private CurrentUser currentUser;
	
	@Inject
	private LoginService loginService;

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

	public String loginTest() {
		if (!email.isEmpty() && !password.isEmpty()) {
			if (loginService.validLogin(email, password)) {
				currentUser.setCustomer(loginService.loginUser(email));
				System.out.println("Logged In");
			} else {
				password = "";
			}
		}
		return "home";
	}
}
