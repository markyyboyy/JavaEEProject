
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
 * This represents the data associated with a rating.
 * @author Ynyr Williams
 *
 */
@Entity
@Table(name="Rating")
public class Rating {

	@NotNull @Size(min=1, max=10)
	@Column(name="name", nullable=false,length=10)
	private short score;
	@Column(name="comment", nullable=true,length=225)
	private String comment;

	@Id
	@ManyToOne
	@JoinColumn(name="customerID", nullable=false)
	@NotNull
	private long customerID;
	
	@Id
	@ManyToOne
	@JoinColumn(name="productID", nullable=false)
	@NotNull
	private long productID;

	public Rating(short score,String comment,long customerID,long productID) {
		this.score = score;
		this.comment = comment;
		this.productID = productID;
		this.customerID=customerID;
	}
	
	public Rating(short score, long customerID, long productID) {
		super();
		this.score = score;
		this.customerID = customerID;
		this.productID = productID;
	}

	public long getScore() {
		return score;
	}
	public void setScore(short score) {
		this.score = score;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "Rating [score=" + score + ", comment=" + comment + ", customerID=" + customerID + ", productID="
				+ productID + "]";
	}
}