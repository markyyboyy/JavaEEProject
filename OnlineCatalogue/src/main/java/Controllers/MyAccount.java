package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Address;
import com.qac.row5project.entities.Payment;
import com.qac.row5project.helpers.TestDataCatalogue;
import com.qac.row5project.managers.CustomerManager;

import Controllers.session.CurrentUser;

@Named("MyAccount")
@RequestScoped
public class MyAccount {

	@Inject
	private TestDataCatalogue td;
	
	@Inject
	private CustomerManager cManager;

	@Inject
	private CurrentUser cU;

	private String password;

	private String sHName = "";
	private String sStreet = "";
	private String sTown = "";
	private String sPost = "";
	private List<Address> address;// = new ArrayList<>();
	private Payment sPaymentDetails;

	private String sQuestion = "";
	private String sAnswer = "";

	private String sFacebook = "";

	
	public void editDetails() {

	}

	public void newPassword() {
		cU.getCustomer().getLoginDetails().setPassword(this.password);
	}

	public String newAddress() {
		Address temp = new Address(this.sHName, this.sStreet, " ", " ", this.sTown, this.sPost, "UK");
		this.address = cU.getCustomer().getAddress();
		this.address.add(temp);
		cU.getCustomer().setAddress(address);
		System.out.println("Address Added");
		return "myAccount";
	}

	public void newSecurity() {
		cU.getCustomer().setQuestion(this.sQuestion);
		cU.getCustomer().setSecretAnswer(this.sAnswer);
		;
	}

	public void newFacebook() {
		cU.getCustomer().setFacebook(this.sFacebook);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerManager getcManager() {
		return cManager;
	}

	public void setcManager(CustomerManager cManager) {
		this.cManager = cManager;
	}

	public CurrentUser getcU() {
		return cU;
	}

	public void setcU(CurrentUser cU) {
		this.cU = cU;
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public String getsQuestion() {
		return sQuestion;
	}

	public void setsQuestion(String sQuestion) {
		this.sQuestion = sQuestion;
	}

	public String getsAnswer() {
		return sAnswer;
	}

	public void setsAnswer(String sAnswer) {
		this.sAnswer = sAnswer;
	}

	public String getsFacebook() {
		return sFacebook;
	}

	public void setsFacebook(String sFacebook) {
		this.sFacebook = sFacebook;
	}

	public Payment getsPaymentDetails() {
		return sPaymentDetails;
	}

	public void setsPaymentDetails(Payment sPaymentDetails) {
		this.sPaymentDetails = sPaymentDetails;
	}

}
