package ass1.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ass1.Beans.Employee;
import ass1.DAOLayer.EmployeeRepoImp;
import ass1.Exception.EmployeeException;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	EmployeeRepoImp empRepo;

	public void setEmpRepo(EmployeeRepoImp empRepo) {
		this.empRepo = empRepo;
	}

	
	
	
	@Override
	public boolean insertEmployeeDetails(Employee emp) {
		
		return empRepo.saveEmployee(emp);
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		
		return empRepo.getAllEmployee();
		
	}

	@Override
	public Employee findEmployee(int empId) {
		
		Employee emp = null;
		
		try {
			emp = empRepo.getEmployeeById(empId);
		} catch (EmployeeException e) {
			
			e.getMessage();
		}
		
		return emp;
	}

	@Override
	public String deleteEmployeeDetailsById(int empId) {
		
		try {
			return empRepo.deleteEmployeeById(empId);
		}catch(EmployeeException e) {
			e.getMessage();
		}
		
		return "not deleted";
		
	}

}
