import javax.enterprise.context.RequestScoped;

@RequestScoped
@Named(value = "login")
public class Login {
	@Inject
	private CurrentUser currentUser;
	@Inject
	private LoginService loginService;
	
	private String email = "";
	private String password = "";
	
	public String getEmail(){
		return this.email;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String login(){
		if(!email.isEmpty() && !password.isEmpty()){
			if(loginService.validLogin(email, password)){
				currentUser.(loginService.loginUser(email));
			}
			else{
				password = "";
				return "home";
			}
	}
}
