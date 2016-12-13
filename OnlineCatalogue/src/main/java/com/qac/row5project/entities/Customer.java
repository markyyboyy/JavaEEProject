package com.qac.row5project.entities;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.Table;
/***
 * 
 * @author Michael Crowther
 *
 */
@Entity
@Table(name="Customer")
@NamedQuery(name="findByUsername", query="select c from Customer c inner join on LoginDetails ld where ld.username = :user")
public class Customer {

	@Id @Column(nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	@NotNull
	private String surname;
	
	@Column(nullable=false)
	@NotNull
	private String firstname;
	
	@Column(nullable=true)
	private String facebook;
	
	@Column(nullable=false)
	@NotNull
	private String secretAnswer;
	
	//Telephone Number (Main)
	@Column(nullable=true)
	private String telephoneMain;
	
	
	@Column(nullable=false)
	@NotNull
	private Calendar DOB;	

	@Column(nullable=false)
	@NotNull
	private Double balance;	
	
	@OneToOne
	@JoinColumn(name="loginDetails_id", nullable=false)
	@NotNull
	private LoginDetails loginDetails;
		
	@OneToMany
	@JoinColumn(name="address_id", nullable=false)
	@NotNull
	private List<Address> address = new ArrayList<>();
	
	@OneToOne
	@JoinColumn(name="customer_id", nullable = false)
	@NotNull
	private SecurityQuestion question;
		
	@OneToMany(mappedBy="id")
	private List<CustomerOrder> orderHistory;	
	
	@OneToOne(mappedBy="id")
	private List<Product> wishList = new ArrayList<>();


	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//MOVE TO TOP
	public Customer() {
	}
	
	/***
	 * 
	 * @param sSurname
	 * @param sFirstname
	 * @param sSecretAnswer
	 * @param dtDOB
	 * @param loginDetails
	 */
	public Customer(String sSurname, String sFirstname, String sSecretAnswer,
			Calendar dtDOB, LoginDetails loginDetails) {

		this.surname = sSurname;
		this.firstname = sFirstname;
		this.secretAnswer = sSecretAnswer;
		this.DOB = dtDOB;
		this.loginDetails = loginDetails;
		
	}
		
	/***
	 * 
	 * @param sSurname
	 * @param sFirstname
	 * @param sFacebook
	 * @param sSecretAnswer
	 * @param sTelMain format starts with 0 no need for international code
	 * @param dtDOB
	 * @param loginDetails
	 */
	public Customer(String surname, String firstname, String secretAnswer, Calendar DOB, LoginDetails loginDetails, String telephoneMain,
			String facebook) {

		this.surname = surname;
		this.firstname = firstname;
		this.facebook = facebook;
		this.secretAnswer = secretAnswer;
		this.telephoneMain = telephoneMain;
		this.DOB = DOB;
		this.loginDetails = loginDetails;

	}
	
	/***
	 * 
	 * @param sSurname
	 * @param sFirstname
	 * @param sFacebook
	 * @param sSecretAnswer
	 * @param dtDOB
	 * @param loginDetails
	 */
	public Customer(String surname, String firstname, String secretAnswer, Calendar DOB, LoginDetails loginDetails,
			String facebook) {

		this.surname = surname;
		this.firstname = firstname;
		this.facebook = facebook;
		this.secretAnswer = secretAnswer;
		this.DOB = DOB;
		this.loginDetails = loginDetails;

	}
	
	//ADD MORE CONSTURCTER
	
	
	public long getID(){
		return this.id;
	}	
	
	
	public void setID(int id){
		this.id = id;
	}
		
	public List<Product> getWishList() {
		return wishList;
	}

	public void setWishList(List<Product> wishList) {
		this.wishList = wishList;
	}


	public LoginDetails getLoginDetails() {
		return this.loginDetails;
	}

	public void getLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String sSurname) {
		this.surname = sSurname;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String sFirstname) {
		this.firstname = sFirstname;
	}

	public String getFacebook(){
		return this.firstname;
	}

	public void setFacebook(String sFacebook) {
		this.facebook = sFacebook;
	}

	public String getSecretAnswer(){
		return this.secretAnswer;
	}

	public void setSecretAnswer(String sSecretAnswer) {
		this.secretAnswer = sSecretAnswer;
	}

	public String getTelephone(){
		return this.telephoneMain;
	}

	public void setTelephone(String sTelMain) {
		this.telephoneMain = sTelMain;
	}

	public Calendar getDateOfBirth(){
		return this.DOB;
	}

	public void setDateOfBirth(Calendar dtDOB) {
		this.DOB = dtDOB;
	}
	
	/**
	 * @author Richard Allen
	 * @param address
	 */
	public void setAddress(List<Address> address){
		this.address = address;
	}
	
	/**
	 * @author Richard Allen
	 * @return address
	 */
	public List<Address> getAddress(){
		return this.address;
	}
	
	/**
	 * @author Richard Allen
	 * @param address
	 */
	public void setQuestion(String question){
		new SecurityQuestion(question);
	}
	
	/**
	 * @author Richard Allen
	 * @return address
	 */
	public List<Address> getQuestion(){
		return this.address;
	}
	
	public void setBalance(double balance){
	    this.balance = balance;
	}
	
	public double getBalance(){
	    return this.balance;
	}
	
}
