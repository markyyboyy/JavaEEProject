
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

	
	/**
	 * Constructor with no arguments
	 */
	public Supplier() {
	}
	
	/**
	 * Constructor for each variable
	 * @param idSupplier
	 */
	public Supplier(long id) {
		this.id = id;
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
	 * @param idSupplier
	 */
	public void setID(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return (String.valueOf(this.id));
		
	}
}