
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
/***
 * This represents the data associated with a image.
 * 
 * @author Ynyr Williams
 *
 */
@Entity
@Table(name = "Image")
public class Image {
	@Id
	@Column(name="fileName",nullable=false,unique=true)
	private String fileName;
	@Column(nullable=true, length=225)
	@Size(max=225)
	private String desc;
	@Column(nullable=false,unique=true )
	private long productID; //long
	
	public void Images(String fileName, String desc, long productID) {
		this.fileName = fileName;
		this.desc = desc;
		this.productID = productID;
	}
	public void Images(String fileName, long productID) {
		this.fileName = fileName;
		this.productID = productID;
	}
	public String getUrl() {
		return fileName;
	}
	public void setUrl(String fileName) {
		this.fileName = fileName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}
	@Override
	public String toString() {
		return "Images [fileName=" + fileName + ", desc=" + desc + ", productID=" + productID + "]";
	}
}
