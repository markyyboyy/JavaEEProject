package com.qac.row5project.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/** 
 * 
 * @author Richard Allen
 *
 */

@Entity
@Table(name = "Supplier_Supplies_Product")

//@NamedQuery(name = "FindBySupplier", query = "SELECT * FROM Supplier_Supplies_Product sSP WHERE sSP.Supplier_id = :Supplier_id ")
//@NamedQuery(name = "FindByProduct", query = "SELECT * FROM Supplier_Supplies_Product sSP WHERE sSP.Product_id = :Product_id ")
//@NamedQuery(name = "FindByPrice", query = "SELECT * FROM Supplier_Supplies_Product sSP WHERE sSP.price = :price ")


public class ProductSupplier {
	
	@OneToOne
	@JoinColumn(name = "Supplier_id", nullable = false)
	@NotNull
	private Supplier supplier;
	
	@OneToOne
	@JoinColumn(name = "Product_id", nullable = false)
	@NotNull
	private	Product product;
	
	@Column(name = "price", nullable = false)
	@NotNull
	private float price;
	
	// ADD DATE CREATED
	
	public ProductSupplier()
	{}
	
	/** 
	 * 
	 * @author Richard Allen
	 * Create new supplier with an ID 
	 * 
	 */
	public ProductSupplier(Supplier supplier, Product product, float price)
	{
		this.supplier = supplier;
		this.product = product;
		this.price = price;
	}
	/** 
	 * 
	 * @author Richard Allen
	 * @return Supplier by supplier ID
	 */
	public Supplier getSupplier()
	{
		return this.supplier;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * Set supplier
	 */
	public void setSupplier(Supplier supplier)
	{
		this.supplier = supplier;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * @return product associated with a supplier
	 */
	public Product getProduct()
	{
		return this.product;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * set product associated with a supplier
	 */
	public void setProduct(Product product)
	{
		this.product = product;
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * @return price for a product
	 */
	public float getPrice()
	{
		return this.price;
	}
	/** 
	 * 
	 * @author Richard Allen
	 * set supplier price
	 */
	public void setPrice(float price)
	{
		this.price = price;
	}

}
