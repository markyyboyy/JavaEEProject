
public class Customer {

	private String sSurname;
	private String sFirstname;
	private String sFacebook;
	private String sSecretAnswer;
	private String sTelMain;
	private Calendar dtDOB;
	private LoginDetails loginDetails;
	private int id;
	// create enum for Acc Status
	
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

	public String getFacebook()
		return this.sFirstname;
	}

	public void setFacebook(String sFacebook) {
		this.sFacebook = sFacebook;
	}

	public String getSecretAnswer()
		return this.sSecretAnswer;
	}

	public void setSecretAnswer(String sSecretAnswer) {
		this.sSecretAnswer = sSecretAnswer;
	}

	public String getTelephone()
		return this.sTelMain;
	}

	public void setTelephone(String sTelMain) {
		this.sTelMain = sTelMain;
	}

	public Calendar getDateOfBirth()
		return this.sTelMain;
	}

	public void setDateOfBirth(Calendar dtDOB) {
		this.dtDOB = dtDOB;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Customer() {

	}
	
	public Customer(String sSurname, String sFirstname String sSecretAnswer,
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
