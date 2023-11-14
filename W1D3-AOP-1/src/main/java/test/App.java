package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("Testing Spring startup");
		MyClass c = context.getBean("myClass",MyClass.class);
		c.sayHello();
		c.sayHello();
		c.sayHello();
		context.close();
	}
}
