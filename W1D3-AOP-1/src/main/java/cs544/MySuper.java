package cs544;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class MySuper {
	
	String text;
	
	
	public MySuper() {
		System.out.println("MySuper Constructor");
		
	}
	
	//@Value("Thing")
	public void setText(String text) {
		System.out.println("Setting text to "+ text );
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
}
