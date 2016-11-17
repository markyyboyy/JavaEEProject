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
@Table(name="Rating")
public class Rating {
	@NotNull @Size(min=1, max=10)
	@Column(name="name", nullable=false,length=10)
	private int score;
	@Column(name="comment", nullable=true,length=225)
	private String comment;
	@Id
	@ManyToOne
	@JoinColumn(name="customerID", nullable=false)
	@NotNull
	private int customerID;
	@Id
	@ManyToOne
	@JoinColumn(name="productID", nullable=false)
	@NotNull
	private int productID;

	public Rating(int score,String comment,int customerID,int productID) {
		this.score = score;
		this.comment = comment;
		this.productID = productID;
		this.customerID=customerID;
	}
	
	public Rating(int score, int customerID, int productID) {
		super();
		this.score = score;
		this.customerID = customerID;
		this.productID = productID;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "Rating [score=" + score + ", comment=" + comment + ", customerID=" + customerID + ", productID="
				+ productID + "]";
	}
}