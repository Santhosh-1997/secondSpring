package ass2.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ass2.service.ServiceLayer;
import ass2.util.AppConfig;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ServiceLayer sl = ctx.getBean(ServiceLayer.class,"servicelayer");
		
		sl.getCities();
		
		sl.getStudents();
		
		AnnotationConfigApplicationContext ctx1 = (AnnotationConfigApplicationContext) ctx;
		
		ctx1.close();
		
	}
	
}
