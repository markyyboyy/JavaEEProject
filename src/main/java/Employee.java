private LoginDetails logInDetails;
private int id;
public Employee() { }
public Employee(LoginDetails logInDetails, int id) {
	this.logInDetails = logInDetails;
	this.id = id;
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

