package com.qac.row5project.helpers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import com.qac.row5project.entities.*;

/***
 * This class represents dummy data to be used for testing purposes.
 * 
 * @author Mark Freeman & Ynyr Williams
 *
 */
@Startup
@Singleton
public class TestDataIMS {
	private List<Employee> employees;
	private List<LoginDetails> loginDetails;

	/***
	 * 
	 * This method runs after the object is made and initialises all the
	 * variables and adds the data.
	 *
	 */
	@PostConstruct
	private void setupData() {
		loginDetails = new ArrayList<LoginDetails>();
		
		employees = new ArrayList<Employee>();
		LoginDetails testLogin = new LoginDetails("test@test.com", "password");
		loginDetails.add(testLogin);
		LoginDetails imsLogin = new LoginDetails("m@nb.com", "p");
		loginDetails.add(imsLogin);
		//employees.add(new Employee(imsLogin, 10));
	}

	public List<LoginDetails> getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(List<LoginDetails> loginDetails) {
		this.loginDetails = loginDetails;
	}
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}