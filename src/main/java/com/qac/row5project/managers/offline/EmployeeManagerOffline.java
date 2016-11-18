package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.List;

import com.qac.row5project.entities.Employee;
import com.qac.row5project.entities.TestData;

public class EmployeeManagerOffline {
	TestData testData = new TestData();
	//READ - Inventory Manager Only
	public Employee readEmployee(String emailAddress){
		List<Employee> returned = testData.getEmployees();
		for(Employee e: returned){
			if (e.getLogInDetails().getEmail().equals(emailAddress)){
				return e;
			}
		}
		return null;
	}
	
	public Employee readEmployee(int ID){
		List<Employee> returned = testData.getEmployees();
		for(Employee e: returned){
			if (e.getID() == ID){
				return e;
			}
		}
		return null;
	}
	
	//UPDATE - Inventory Manager Only
	public void updateEmployee(Employee employee){
		ArrayList<Employee> returned = testData.getEmployees();
		int i = 0;
		for(Employee e: returned){
			if (e.getID() == employee.getID()){
				returned.remove(i);
				returned.set(i, e);
			}
			i++;
		}
		testData.setEmployees(returned);
	}
}
