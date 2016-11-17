
public interface EmployeeManager {
	
	//READ - Inventory Manager Only
	public Employee readEmployee(String emailAddress);
	public Employee readEmployee(int ID);
	
	//UPDATE - Inventory Manager Only
	public void updateEmployee(String email);
	
	//Methods
	public void listEmployees(List<>Employee);
	
}
