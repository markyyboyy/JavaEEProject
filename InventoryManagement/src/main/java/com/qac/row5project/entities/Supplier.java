
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
	
	private ProductSupplier pSupplier;

	
	/**
	 * Constructor with no arguments
	 */
	public Supplier() {
	}
	
	/**
	 * Constructor for each variable
	 * @param id
	 */
	public Supplier(long id, ProductSupplier pSupplier) {
		this.id = id;
		this.pSupplier = pSupplier;
		
	}
	
	// Getters and Setters
	
	/**
	 * 
	 * @return the Supplier Id
	 */
	public long getID() {
		return id;
	}
	
	/**
	 * Set the Supplier Id
	 * @param id
	 */
	public void setID(long id) {
		this.id = id;
	}
	
	public ProductSupplier getpSupplier() {
		return pSupplier;
	}

	public void setpSupplier(ProductSupplier pSupplier) {
		this.pSupplier = pSupplier;
	}

	@Override
	public String toString() {
		return (String.valueOf(this.id));
		
	}
}