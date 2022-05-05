package ass1.ServiceLayer;

import java.util.List;

import ass1.Beans.Employee;

public interface EmployeeService {
	
	public boolean insertEmployeeDetails(Employee emp);
	public List<Employee> getAllEmployeeDetails();
	public Employee findEmployee(int empId);
	public String deleteEmployeeDetailsById(int empId);


}
