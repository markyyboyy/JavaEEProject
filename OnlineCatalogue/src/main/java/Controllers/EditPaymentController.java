package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.ProductItem;
import com.qac.row5project.managers.CustomerOrderLineManager;
import com.qac.row5project.managers.CustomerOrderManager;
import com.qac.services.BasketService;
import com.qac.services.ProductService;
import com.qac.services.StockService;
import com.qac.services.UpdatePaymentService;

import Controllers.session.CurrentUser;

/**
 * 
 * @author Mark Freeman
 *
 */

@Named("payment")
@RequestScoped
public class EditPaymentController {
	private String Type;
	private String CardNumber;
	private String ExpiryDate;
	private String NameOnCard;
	private String IssueNumber;
	private String name;
	private String  addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String town;
	private String postcode;
	private String county;	
	@Inject
	private UpdatePaymentService updatePaymentService;
	
	public void updatePayment(){
		updatePaymentService.update(Type, CardNumber, ExpiryDate, NameOnCard, IssueNumber,addressLine1,addressLine2,addressLine3,town,postcode,county);
	}
	
	public UpdatePaymentService getUpdatePaymentService() {
		return updatePaymentService;
	}

	public void setUpdatePaymentService(UpdatePaymentService updatePaymentService) {
		this.updatePaymentService = updatePaymentService;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}

	public String getNameOnCard() {
		return NameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		NameOnCard = nameOnCard;
	}

	public String getIssueNumber() {
		return IssueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		IssueNumber = issueNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
}
