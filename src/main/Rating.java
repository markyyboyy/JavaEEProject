public class Rating {
	private String score;
	private String comment;
	private int customerID;
	private int productID;

	public Rating(String score,String comment,int customerID,int productID) {
		this.score = score;
		this.comment = comment;
		this.productID = productID;
		this.customerID=customerID;
	}
	
	public Rating(String score, int customerID, int productID) {
		super();
		this.score = score;
		this.customerID = customerID;
		this.productID = productID;
	}

	public String getScore() {
		return score;
	}
	public void setScore(String score) {
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