package Controllers.session;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.qac.row5project.entities.Employee;

/**
 * @Author Richard Allen
 */

@Named("userEmp")
@SessionScoped	
public class CurrentUserEmployee implements Serializable {

	private static final long serialVersionUID = 1111L;
	private Employee employee= null;

	/**
	 * 
	 * @param emp
	 * 
	 * Sets current user to the employee logged in
	 * 
	 */
	public void setEmployee(Employee emp) {
		this.employee = emp;
	}
	
	/**
	 * 
	 * @return employee logged in
	 */
	public Employee getEmployee()
	{
		return this.employee;
	}
	
	/**
	 * Check if employee is logged in
	 * 
	 * @return logged in boolean
	 */
	public boolean isLoggedIn(){
		return (employee == null) ? false : true;
	}
	

}







