import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.persistance.Entity;
import javax.persistance.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id @Column(nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	@NotNull
	private String sSurname;
	
	@Column(nullable=false)
	@NotNull
	private String sFirstname;
	
	@Column(nullable=true)
	private String sFacebook;
	
	@Column(nullable=false)
	@NotNull
	private String sSecretAnswer;
	
	@Column(nullable=true)
	private String sTelMain;
	
	@Column(nullable=false)
	@NotNull
	private Calendar dtDOB;	

	@OneToOne
	@JoinColumn(name="loginDetails_id", nullable=false)
	@NotNull
	private LoginDetails loginDetails;
		
	@OneToMany
	@JoinColumn(name="address_id", nullable=false)
	@NotNull
	private List<Address> address;
	
	@OneToOne
	@JoinColumn(name="customer_id", nullable)
	@NotNull
	private SecurityQuestion question;
		
//	@OneToMany
//	@JoinColumn(name="order_id")
//	@NotNull
//	private List<Order> orderHistory;
//	
//	@OneToMany
//	@JoinColumn(name="payment_")
	
	
	
	
	
		
	public int getID(){
		return this.id;
	}	
	
	public LoginDetails getLoginDetails() {
		return this.loginDetails;
	}

	public void getLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	public String getSurname() {
		return this.sSurname;
	}

	public void setSurname(String sSurname) {
		this.sSurname = sSurname;
	}

	public String getFirstname() {
		return this.sFirstname;
	}

	public void setFirstname(String sFirstname) {
		this.sFirstname = sFirstname;
	}

	public String getFacebook(){
		return this.sFirstname;
	}

	public void setFacebook(String sFacebook) {
		this.sFacebook = sFacebook;
	}

	public String getSecretAnswer(){
		return this.sSecretAnswer;
	}

	public void setSecretAnswer(String sSecretAnswer) {
		this.sSecretAnswer = sSecretAnswer;
	}

	public String getTelephone(){
		return this.sTelMain;
	}

	public void setTelephone(String sTelMain) {
		this.sTelMain = sTelMain;
	}

	public Calendar getDateOfBirth(){
		return this.dtDOB;
	}

	public void setDateOfBirth(Calendar dtDOB) {
		this.dtDOB = dtDOB;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Customer() {

	}
	
	public Customer(String sSurname, String sFirstname, String sSecretAnswer,
			Calendar dtDOB, LoginDetails loginDetails) {

		this.sSurname = sSurname;
		this.sFirstname = sFirstname;
		this.sSecretAnswer = sSecretAnswer;
		this.dtDOB = dtDOB;
		this.loginDetails = loginDetails;

	}
	public Customer(String sSurname, String sFirstname, String sFacebook, String sSecretAnswer, String sTelMain,
			Calendar dtDOB, LoginDetails loginDetails) {

		this.sSurname = sSurname;
		this.sFirstname = sFirstname;
		this.sFacebook = sFacebook;
		this.sSecretAnswer = sSecretAnswer;
		this.sTelMain = sTelMain;
		this.dtDOB = dtDOB;
		this.loginDetails = loginDetails;

	}

}
