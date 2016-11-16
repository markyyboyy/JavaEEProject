private LoginDetails logInDetails;
public Employee() { }
public Employee(LoginDetails logInDetails) {
	this.logInDetails = logInDetails;
}
public String getLogInDetails(){
	return this.logInDetails;
}
public String getPassword(){
	return password;
}
public void setEmail(String email){
	this.email = email;
}
public void setPassword(String password){
	this.password = password;
}

