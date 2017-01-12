package Controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.entities.CustomerOrderLine;
import com.qac.row5project.entities.Payment;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.managers.AccountManager;
import com.qac.row5project.managers.PaymentManager;

/**
 * Session Bean implementation class StockController
 */
@Named("account")
@RequestScoped

public class AccountController {
	@Inject
	AccountManager accountManager;
	private List<Customer> accounts = new ArrayList<Customer>();
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	private String accountID;
	public List<Customer> getAccounts() {
		System.out.println("getAccounts");
		if (accounts.size() == 0){
		setAccounts(accountManager.readAccounts());
		}
		return accounts;
	}
	public void setAccounts(List<Customer> accounts) {
		System.out.println("set accounts");
		this.accounts = accounts;
	}
	public void findByID(){
		setAccounts(accountManager.readAccountsByID(accountID));
	}
}
