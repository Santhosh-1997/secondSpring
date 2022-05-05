package ass2.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.env.Environment;

import ass2.beans.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "ass2")
@PropertySource("cities.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public List<String> cities(){
		
		List<String> list = new ArrayList<>();
		
		list.add(env.getProperty("city1"));
		list.add(env.getProperty("city2"));
		list.add(env.getProperty("city3"));
		list.add(env.getProperty("city4"));
		list.add(env.getProperty("city5"));
		
		return list;
	}
	
	@Bean
	public List<Student> students(){
		
		List<Student> list = new ArrayList();
		
		list.add(new Student(1,"ross",100));
		list.add(new Student(2,"chandler",90));
		list.add(new Student(3,"phoebe",80));
		list.add(new Student(4,"rachael",85));
		list.add(new Student(5,"monica",60));
		list.add(new Student(6,"joey",35));
		
		return list;
	}
	
}
