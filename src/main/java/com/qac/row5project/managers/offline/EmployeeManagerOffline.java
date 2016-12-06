/**
 * @author Mark Freeman
 */
package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.List;

import com.qac.row5project.entities.Employee;
import com.qac.row5project.helpers.*;

public class EmployeeManagerOffline {
	TestData testData = new TestData();
	//READ - Inventory Manager Only
	public Employee readEmployee(String emailAddress){
		List<Employee> returned = testData.getEmployees();	//Get all of the employees
		for(Employee e: returned){	//For each employee
			if (e.getLogInDetails().getEmail().equals(emailAddress)){	//If they have the given email address then return that employee.
				return e;
			}
		}
		return null;	//If the user doesnt exist just return null.
	}
	
	public Employee readEmployee(int ID){
		List<Employee> returned = testData.getEmployees();	//Get all of the employees
		for(Employee e: returned){	//For each employee
			if (e.getID() == ID){	//If the employee ID matches then return the employee
				return e;
			}
		}
		return null;
	}
	
	//UPDATE - Inventory Manager Only
	public void updateEmployee(Employee employee){
		List<Employee> returned = testData.getEmployees();	//Get all of the employees each employee
		int i = 0;	//A counter variable
		for(Employee e: returned){	//For each employee
			if (e.getID() == employee.getID()){	//If the current employee is the same as the given employee.
				returned.remove(i);	//Remove the old version of the employee.
				returned.add(i, e);	//Add the new version to the list.
			}
			i++;
		}
		testData.setEmployees(returned);	//We have created a new list of employees, we want to set it in testData, so the changes will be reflected.
	}
}