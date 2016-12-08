package Controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.qac.row5project.entities.Address;
import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.entities.SecurityQuestion;
import com.qac.row5project.managers.CustomerManager;
import com.qac.services.RegisterService;

/**
 * @Author Richard Allen
 */
@Named("register")
@RequestScoped
public class Register {

	@Inject
	private CustomerManager customerManager;
	
	@Inject
	private RegisterService regServ;

	private String sSurname = "";
	private String sFirstname = "";
	private String sFacebook = "";
	private String sAnswer = "";
	private String sTelMain = "";
	private String dtDOB;
	private Calendar DOB;
	private Double dBalance;
	private String sHName = "";
	private String sStreet = "";
	private String sTown = "";
	private String sPost = "";
	private String password = "";
	private String email = "";
	private String sQuestion= "";
	private LoginDetails loginDetails;
	private List<Address> address = new ArrayList<>();
	private SecurityQuestion question;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void addAddress(){
		Address temp = new Address(this.sHName, this.sStreet, " ", " ", this.sTown,
			this.sPost, "UK");
		this.address.add(temp);
		System.out.println("Address Added");
	}
	
	public CustomerManager getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(CustomerManager customerManager) {
		this.customerManager = customerManager;
	}

	public String getsSurname() {
		return sSurname;
	}

	public void setsSurname(String sSurname) {
		this.sSurname = sSurname;
	}

	public String getsFirstname() {
		return sFirstname;
	}

	public void setsFirstname(String sFirstname) {
		this.sFirstname = sFirstname;
	}

	public String getsFacebook() {
		return sFacebook;
	}

	public void setsFacebook(String sFacebook) {
		this.sFacebook = sFacebook;
	}


	public String getsTelMain() {
		return sTelMain;
	}

	public void setsTelMain(String sTelMain) {
		this.sTelMain = sTelMain;
	}

	public String getDtDOB() {
		return dtDOB;
	}

	public void setDtDOB(String dtDOB) {
		this.dtDOB = dtDOB;
	}

	public Double getdBalance() {
		return dBalance;
	}

	public void setdBalance(Double dBalance) {
		this.dBalance = dBalance;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public SecurityQuestion getQuestion() {
		return question;
	}

	public void setQuestion(SecurityQuestion question) {
		this.question = question;
	}

	public String getsHName() {
		return sHName;
	}

	public void setsHName(String sHName) {
		this.sHName = sHName;
	}

	public String getsStreet() {
		return sStreet;
	}

	public void setsStreet(String sStreet) {
		this.sStreet = sStreet;
	}

	public String getsTown() {
		return sTown;
	}

	public void setsTown(String sTown) {
		this.sTown = sTown;
	}

	public String getsPost() {
		return sPost;
	}

	public void setsPost(String sPost) {
		this.sPost = sPost;
	}

	public String register() {
		Customer c = new Customer();
		c.setFirstname(this.sFirstname);
		c.setSurname(this.sSurname);
		addAddress();
		c.setAddress(this.address);
		c.getLoginDetails(new LoginDetails(this.email, this.password));
		c.setSecretAnswer(this.sAnswer);
		c.setQuestion(this.sQuestion);
		System.out.println("Registered");
		dateOfBirth(dtDOB);
		regServ.Register(c);
		
		return "home";
	}
	
	public void dateOfBirth(String dtDOB){
		
		String sYear = dtDOB.substring(0,4);
		String sMonth = dtDOB.substring(5,7);
		String sDate = dtDOB.substring(8);	
		
		int year = Integer.parseInt(sYear);
		int month = Integer.parseInt(sMonth);
		int date = Integer.parseInt(sDate);
				
		Calendar tempDate = Calendar.getInstance();
		tempDate.set(year, month, date);
		
		this.setDOB(tempDate);
	}

	public String getsAnswer() {
		return sAnswer;
	}

	public void setsAnswer(String sAnswer) {
		this.sAnswer = sAnswer;
	}

	public String getsQuestion() {
		return sQuestion;
	}

	public void setsQuestion(String sQuestion) {
		this.sQuestion = sQuestion;
	}

	public Calendar getDOB() {
		return DOB;
	}

	public void setDOB(Calendar dOB) {
		DOB = dOB;
	}
}