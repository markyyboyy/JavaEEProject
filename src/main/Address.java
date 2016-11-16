
public class Address {

	private String sName, sAddressLine1, sAddressLine2, sAddressLine3, sTown, sPostcode, sCounty;
	
	
	public String getCounty() {
		return this.sCounty;
	}

	public void setCounty(String sCounty) {
		this.sCounty = sCounty;
	}
	
	public String getPostcode() {
		return this.sPostcode;
	}

	public void setPostcode(String sPostcode) {
		this.sPostcode = sPostcode;
	}
	
	
	public String getTown() {
		return this.sTown;
	}

	public void setTown(String sTown) {
		this.sTown = sTown;
	}
	
	public String getAddressLine3() {
		return this.sAddressLine2;
	}

	public void setAddressLine3(String sAddressLine3) {
		this.sAddressLine3 = sAddressLine3;
	}
	
	
	public String getAddressLine2() {
		return this.sAddressLine2;
	}

	public void setAddressLine1(String sAddressLine2) {
		this.sAddressLine2 = sAddressLine2;
	}
	
	
	public String getAddressLine1() {
		return this.sAddressLine1;
	}

	public void setAddressLine1(String sAddressLine1) {
		this.sAddressLine1 = sAddressLine1;
	}

	
	
	public String getName() {
		return this.sName;
	}

	public void setName(String sName) {
		this.sName = sName;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Address() {
	}

	public Address(String sName, String sAddressLine1, String sAddressLine2, String sAddressLine3, String sTown,
			String sPostcode, String sCounty) {

		this.sName = sName;
		this.sAddressLine1 = sAddressLine1;
		this.sAddressLine2 = sAddressLine2;
		this.sAddressLine3 = sAddressLine3;
		this.sTown = sTown;
		this.sPostcode = sPostcode;
		this.sCounty = sCounty;

	}

}
