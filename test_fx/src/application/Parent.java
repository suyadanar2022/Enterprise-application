package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Parent <T extends NewType>{
	
	private T t;
	
	
	public T getT() {
		
		t.toString();
		
		return null;
	}
	
	
	public void setT(T param) {
		this.t = param;
	}

	
	public static void main(String[] args) {
		
		Parent<NewTypeChild> parentString = new Parent<NewTypeChild>();
		
		Parent<NewType> newType = new Parent<NewType>();

		
		
		List<String> list = new ArrayList<String>();
		
		
		
		//Parent<Integer> parentInteger = new Parent<Integer>();
		
		
		
		
		
	}
}
