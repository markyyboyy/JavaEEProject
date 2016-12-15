package com.qac.row5project.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
/***
 * 
 * @author Michael Crowther
 *
 */
@Entity
public class Address implements Serializable {

	static final long serialVersionUID = 2342342342342L;
	
	@Id long id;
	private String name;
	private String  addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String town;
	private String postcode;
	private String county;	

	public Address() {
	}

	/***
	 * 
	 * @param sName Name/Number of Address of 
	 * @param sAddressLine1
	 * @param sAddressLine2
	 * @param sAddressLine3
	 * @param sTown Town/City
	 * @param sPostcode formatted with no spaces
	 * @param sCounty 
	 */
	public Address(String name, String addressLine1, String addressLine2, String addressLine3, String town,
			String postcode, String county) {

		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.town = town;
		this.postcode = postcode;
		this.county = county;
	}
	
	
	public void setID(long id){
		this.id = id;
	}
		
	public String getCounty() {
		return this.county;
	}

	public void setCounty(String sCounty) {
		this.county = sCounty;
	}
	
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String sPostcode) {
		this.postcode = sPostcode;		
	}
	
	public String getTown() {
		return this.town;
	}

	public void setTown(String sTown) {
		this.town = sTown;
	}
	
	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String sAddressLine3) {
		this.addressLine3 = sAddressLine3;
	}
	
	
	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String sAddressLine2) {
		this.addressLine2 = sAddressLine2;
	}
	
	
	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String sAddressLine1) {
		this.addressLine1 = sAddressLine1;
	}

	
	
	public String getName() {
		return this.name;
	}

	public void setName(String sName) {
		this.name = sName;
	}

	
	
	public long getID(){
		return this.id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + "," + "\n"  + this.getAddressLine1() + "," + "\n" + this.addressLine2 + "," + "\n" + this.addressLine3  + "," + "\n" + this.postcode + "," + "\n" + this.county;
	}


}
