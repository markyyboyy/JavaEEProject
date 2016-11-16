import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

@Entity
public class Address implements Serializable {

	static final long serialVersionUID = 2342342342342L;
	
	private String sName;
	private String sAddressLine1;
	private String sAddressLine2;
	private String sAddressLine3;
	private String sTown;
	private String sPostcode sCounty;	
	int id;
	
	public String getCounty() {
		return this.sCounty;
	}

	public void setCounty(String sCounty) {s
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

	public void setAddressLine2(String sAddressLine2) {
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

	
	
	public int getID(){
		return this.id;
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
