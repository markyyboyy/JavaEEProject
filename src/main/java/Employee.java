
public class Employee {
	
	private LoginDetails logInDetails;

	private int id;

	public Employee() {
	}

	public Employee(LoginDetails logInDetails, int id) {
		this.logInDetails = logInDetails;
		this.id = id;
	}

	public LoginDetails getLogInDetails() {
		return this.logInDetails;
	}

}