package cs544;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyClass extends MySuper{
	
	public MyClass() {
		setText("Hello");
		System.out.println("MyClass Constructor");
	}
	
	@Value("Thing2")
	public void setText2(String text) {
		System.out.println("Setting text2 to "+ text );
		this.text = text;
	}
	
	public void sayHello() {
		System.out.println("This is a"+ getText());
	}
}
