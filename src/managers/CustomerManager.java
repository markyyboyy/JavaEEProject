
public interface CustomerManager {
	
	//CREATE - VISITOR ONLY
	public void createCustomer(Customer newCustomer);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public Customer readCustomerByID(int cID);
	public Customer readCustomerByNames(String fName, String sName);
	
	//UPDATE - CUSTOMER ONLY
	public void updateCustomerForename(String newFName);
	public void updateCustomerSurname(String newSName);
	public void updateCustomerFacebook(String newFBook);
	public void updateCustomerSecretAnswer(String newSAnswer);
	public void updateCustomerTelephone(String newTel);
	public void updateCustomerDOB(Calendar newDOB);
	
}
