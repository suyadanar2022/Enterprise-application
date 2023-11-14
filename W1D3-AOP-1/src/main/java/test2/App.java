package test2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("Spring start up");
		MySuper ms =  context.getBean("");
		ms.getText();
		AClass a= context.getBean(AClass.class);
		a.getAText();
		a.getBText();
	}
}
