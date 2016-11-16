
public class LoginDetails {

	private String email;
	private String password;
	private int id;

	public LoginDetails() {
	}

	public LoginDetails(String email, String password,int id) {
		this.email = email;
		this.password = password;
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
