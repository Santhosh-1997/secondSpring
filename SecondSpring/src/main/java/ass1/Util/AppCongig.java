package ass1.Util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ass1.Beans.Employee;

@Configuration
@ComponentScan(basePackages = "ass1")
public class AppCongig {

	@Bean
	public Employee createEmployee() {
		Employee emp = new Employee();
		emp.setEmpName("kumaru");
		emp.setEmpAddress("pudhupettai");
		emp.setSalary(100000);
		
		return emp;
	}
	
}
