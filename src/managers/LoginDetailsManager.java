
public interface LoginDetailsManager {
	public Payment createLoginDetails(LoginDetails loginDetails);
	public LoginDetails readLoginDetails();
	public void updateLoginDetails(String email, String password);
}
