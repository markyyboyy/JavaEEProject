
public interface EmployeeManager {
	public void createPayment(Employee employee);
	public Employee readEmployee(String emailAddress);
	public Employee readEmployee(int ID);
	public void updateEmployee(String email);
}
