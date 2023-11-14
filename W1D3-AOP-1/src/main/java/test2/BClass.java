package test2;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class BClass {
	
	@Value("Other")
	private String text;
	
	public BClass() {
		System.out.println("BClass Constructor");
	}
	
	public String getText() {
		return this.text;
	}
	
	@PreDestroy
	public void done() {
		System.out.println("BClass destroyed");
	}
	

}
