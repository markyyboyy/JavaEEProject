
public interface LoginDetailsManager {
	public void createLoginDetails(LoginDetails loginDetails);
	public LoginDetails readLoginDetails(String emailAddress);
	public void updateLoginDetails(String email, String password);
}
