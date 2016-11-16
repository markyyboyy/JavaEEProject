private String Type;
private String CardNumber;
private Date ExpiryDate
private String NameOnCard;
private String IssueNumber;
private Customer Customer;
private Address Address;

public Payment() { }
public LoginDetails(String Type,String CardNumber, Date ExpiryDate, String NameOnCard, String IssueNumber, Customer Customer, Address Address) {
	this.Type = Type;
	this.CardNumber = CardNumber;
	this.ExpiryDate = ExpiryDate;
	this.NameOnCard = NameOnCard;
	this.IssueNumber = IssueNumber;
	this.Customer = Customer;
	this.Address = Address;
}
public String getType(){
	return this.Type;
}
public String getCardNumber(){
	return this.CardNumber;
}
public Date getExpiryDate(){
	return this.ExpiryDate;
}
public String getNameOnCard(){
	return this.NameOnCard;
}
public String IssueNumber(){
	return this.IssueNumber;
}
public Customer getCustomer(){
	return this.Customer;
}
public Address getAddress(){
	return this.Address;
}
public void setType(String Type){
	this.Type = Type;
}
public void setCardNumber(String CardNumber){
	this.CardNumber = CardNumber;
}
public void setExpiryDate(Date ExpiryDate){
	this.ExpiryDate = ExpiryDate;
}
public void setNameOnCard(String NameOnCard){
	this.NameOnCard = NameOnCard;
}
public void setIssueNumber(String IssueNumber){
	this.IssueNumber = IssueNumber;
}
public void setCustomer(Customer Customer){
	this.Customer = Customer;
}
public void setAddress(Address Address){
	this.Address = Address;
}

