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

	public void setEmployee(Employee emp) {
		this.employee = emp;
	}
	
	public Employee getCustomer()
	{
		return this.employee;
	}
	
	public boolean isLoggedIn(){
		return (employee == null) ? false : true;
	}
	

}







