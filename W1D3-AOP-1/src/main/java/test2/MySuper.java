package test2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MySuper {

	@Value("Test")
	private String text;
	
	public MySuper() {
		System.out.println("My Super Constructor Text : "+text);
	}
	
	public void setText(String text) {
		System.out.println("Setting tex to "+text);
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
}
