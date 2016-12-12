/**
 * @author Mark Freeman
 */
package com.qac.row5project.managers;

import java.util.List;

import com.qac.row5project.entities.Employee;

public interface EmployeeManager {
	/**
	We want to read, update and list employees
	 */
	//READ - Inventory Manager Only
	public Employee readEmployee(String emailAddress);
	public Employee readEmployee(int ID);
	
	//UPDATE - Inventory Manager Only
	public void updateEmployee(String email);
	
	//Methods
	public void listEmployees(List<Employee> employee);
	
}
