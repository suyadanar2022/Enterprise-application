package test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AClass extends MySuper{

	private BClass bClass;
	
	//@Autowired
	public AClass(BClass bClass) {
	System.out.println("MyClass constructor");
	setText("Hello");
	this.bClass = bClass;

	}
	
	public void getAText() {
		System.out.println("This is a " +getText());
	}
	
	public void getBText() {
		System.out.println("This is a " +bClass.getText());
	}
}
