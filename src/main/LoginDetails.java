
@Entity
@Table(name="login Details")
public class LoginDetails {
	@Column (name="email",length=20,nullable=false,unique=true)
	@Size(max = 20)
	private String email;
	@Column (name="password",length=45,nullable=false)
	@Size(max = 45)
	private String password;

	public LoginDetails() {
	}

	public LoginDetails(String email, String password) {
		this.email = email;
		this.password = password;
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
