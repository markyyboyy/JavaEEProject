
package com.qac.row5project.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author Iman Hassan
 *
 */
@Entity 

public class Supplier  implements Serializable {
	
	/**
	 * Declaring the variable
	 */
	static final long serialVersionUID = 6586263742271776754L;
	//list of product supplier
	@Id private long id;
	//delete
	private int idSupplier;
	
	/**
	 * Constructor with no arguments
	 */
	public Supplier() {
	}
	
	/**
	 * Constructor for each variable
	 * @param idSupplier
	 */
	public Supplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}
	
	// Getters and Setters
	
	/**
	 * 
	 * @return the Supplier Id
	 */
	public int getIdSupplier() {
		return idSupplier;
	}
	
	/**
	 * Set the Supplier Id
	 * @param idSupplier
	 */
	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}
	
}