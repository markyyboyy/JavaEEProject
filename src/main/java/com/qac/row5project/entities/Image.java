package com.qac.row5project.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name"Image")
public class Image {
	@Id
	@Column(name="url",nullable=false,unique=true)
	private String url;
	@Column(nullable=true, length=225)
	@Size(max=225)
	private String desc;
	@Column(nullable=false,unique=true )
	private int productID;
	
	public Images(String url, String desc, int productID) {
		super();
		this.url = url;
		this.desc = desc;
		this.productID = productID;
	}
	public Images(String url, int productID) {
		super();
		this.url = url;
		this.productID = productID;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	@Override
	public String toString() {
		return "Images [url=" + url + ", desc=" + desc + ", productID=" + productID + "]";
	}
}
