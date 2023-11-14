package test;

import org.springframework.stereotype.Component;

@Component
public class MyClass extends MySuper{
	
	public MyClass() {
		setText("Hello");
		System.out.println("MyClass Constructor");
	}
	
	public void sayHello() {
		System.out.println("This is a"+ getText());
	}
}
