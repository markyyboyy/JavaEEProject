package Controllers;

import java.util.Calendar;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.qac.row5project.entities.Address;
import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.LoginDetails;
import com.qac.row5project.entities.SecurityQuestion;
import com.qac.row5project.managers.CustomerManager;
import com.qac.services.LoginService;

import Controllers.session.CurrentUser;

/**
 * @Author Richard Allen
 */
@Named("register")
@RequestScoped
public class Register {

	@Inject
	private CustomerManager customerManager;

	private String sSurname = "";
	private String sFirstname = "";
	private String sFacebook = "";
	private String sSecretAnswer = "";
	private String sTelMain = "";
	private Calendar dtDOB;
	private Double dBalance;

	private LoginDetails loginDetails;
	private List<Address> address;
	private SecurityQuestion question;

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

	public String getsSecretAnswer() {
		return sSecretAnswer;
	}

	public void setsSecretAnswer(String sSecretAnswer) {
		this.sSecretAnswer = sSecretAnswer;
	}

	public String getsTelMain() {
		return sTelMain;
	}

	public void setsTelMain(String sTelMain) {
		this.sTelMain = sTelMain;
	}

	public Calendar getDtDOB() {
		return dtDOB;
	}

	public void setDtDOB(Calendar dtDOB) {
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

	public String register() {
		Customer c = new Customer();
		c.setFirstname(this.sFirstname);
		c.setSurname(this.sSurname);
		c.setDateOfBirth(this.dtDOB);
		
		return null;

	}
}
