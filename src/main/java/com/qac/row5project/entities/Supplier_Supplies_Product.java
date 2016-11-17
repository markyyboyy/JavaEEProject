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

@Entity
@Table(name = "Supplier_Supplies_Product")

//@NamedQuery(name = "FindBySupplier", query = "SELECT * FROM Supplier_Supplies_Product sSP WHERE sSP.Supplier_id = :Supplier_id ")
//@NamedQuery(name = "FindByProduct", query = "SELECT * FROM Supplier_Supplies_Product sSP WHERE sSP.Product_id = :Product_id ")
//@NamedQuery(name = "FindByPrice", query = "SELECT * FROM Supplier_Supplies_Product sSP WHERE sSP.price = :price ")


public class Supplier_Supplies_Product {
	
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
	
	public Supplier_Supplies_Product()
	{}
	
	public Supplier_Supplies_Product(Supplier supplier, Product product, float price)
	{
		this.supplier = supplier;
		this.product = product;
		this.price = price;
	}
	
	public Supplier getSupplier()
	{
		return this.supplier;
	}
	
	public void setSupplier(Supplier supplier)
	{
		this.supplier = supplier;
	}
	
	public Product getProduct()
	{
		return this.product;
	}
	
	public void setProduct(Product product)
	{
		this.product = product;
	}
	
	public float getPrice()
	{
		return this.price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}

}
