package ass1.DAOLayer;

import java.util.List;

import ass1.Beans.Employee;
import ass1.Exception.EmployeeException;

public interface EmployeeRepo {

	public boolean saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;
	
}
