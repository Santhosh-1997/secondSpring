package ass1.PresentationLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import ass1.Beans.Employee;
import ass1.ServiceLayer.EmployeeServiceImp;

@Controller(value = "present")
public class Presentation {

	@Autowired
	EmployeeServiceImp serviceLayer;
	
	@Autowired
	Employee emp;
	
	@Value("1")
	int empId;
	
	public void display() {
		
		boolean result = this.serviceLayer.insertEmployeeDetails(this.emp);
		
		System.out.println(result);
		
		
		List<Employee> list = this.serviceLayer.getAllEmployeeDetails();
		  
		System.out.println(list);
		
		Employee employee = this.serviceLayer.findEmployee(this.empId);
		
		System.out.println(employee);
		
		String result1 = this.serviceLayer.deleteEmployeeDetailsById(this.empId);
		
		System.out.println(result1);
	}
	
}
