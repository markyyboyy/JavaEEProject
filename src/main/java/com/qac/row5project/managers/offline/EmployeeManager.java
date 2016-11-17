package com.qac.row5project.managers.offline;
import java.util.ArrayList;

import com.qac.row5project.entities.Employee;

public interface EmployeeManager {
	
	//READ - Inventory Manager Only
	public Employee readEmployee(String emailAddress){
		List<> returned = testData.getLoginDetails();
		for(Employee e: returned){
			if (e.getEmailAddress.equals(emailAddress)){
				return e
			}
		}
		return null;
	}
	
	public Employee readEmployee(int ID){
		ArrayList<> returned = testData.getLoginDetails();
		for(Employee e: returned){
			if (e.getEmailAddress.equals(emailAddress)){
				return e
			}
		}
		return null;
	}
	
	//UPDATE - Inventory Manager Only
	public void updateEmployee(Employee employee){
		ArrayList<> returned = testData.getPayments();
		int i = 0;
		for(Employee e: returned){
			if (e.getEmailAddress() == employee.getEmailAddress()){
				returned.remove(i)
				returned.add(i, e);
			}
			i++;
		}
		testData.setEmployees(returned);
	}
}
