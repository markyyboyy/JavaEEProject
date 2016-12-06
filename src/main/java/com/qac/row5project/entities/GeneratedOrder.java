package com.qac.row5project.entities;
import java.io.Serializable;
import java.util.ArrayList;

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
	private ArrayList<Stock> goStock = new ArrayList<Stock>();
	private String sAddressLine1;
	private String sAddressLine2;
	private String sAddressLine3;
	private String sTown;
	private String sPostcode;
	private String sCounty;	

	public GeneratedOrder() {
		
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



}
