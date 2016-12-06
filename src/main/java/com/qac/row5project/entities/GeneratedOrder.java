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
	private PurchaseOrder goStock = null;

	public GeneratedOrder() {
		
	}

	public PurchaseOrder getGoStock() {
		return goStock;
	}

	public void setGoStock(PurchaseOrder goStock) {
		this.goStock = goStock;
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
