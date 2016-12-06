package com.qac.row5project.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
/***
 * 
 * @author Mark Freeman
 *
 */
@Entity
public class GeneratedOrder implements Serializable {

	static final long serialVersionUID = 2342342342342L;
	
	@Id int id;
	private String sName;
	private String sAddressLine1;
	private String sAddressLine2;
	private String sAddressLine3;
	private String sTown;
	private String sPostcode;
	private String sCounty;	

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
	
	
	public void setID(int id){
		this.id = id;
	}
		
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
		return this.sAddressLine3;
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


}
