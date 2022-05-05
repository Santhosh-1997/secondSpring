package ass2.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ass2.beans.Student;

@Service
public class ServiceLayer {

	@Autowired
	private List<String> cities;
	
	@Autowired
	private List<Student> students;
	
	public void getCities() {
		
		System.out.println(cities);
		
	}
	
	
	public void getStudents() {
		System.out.println(students);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}
}
