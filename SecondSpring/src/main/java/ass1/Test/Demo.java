package ass1.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ass1.PresentationLayer.Presentation;
import ass1.Util.AppCongig;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCongig.class);
		
		Presentation presentation = ctx.getBean(Presentation.class,"present");
		
		presentation.display();
		
	}
	
}
