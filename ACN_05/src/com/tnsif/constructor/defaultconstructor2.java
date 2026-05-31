package com.tnsif.constructor;

public class defaultconstructor2 {
	
	int i=2;
	
	// default constructor
	defaultconstructor2(){
		System.out.println("I am creating an object");
	}

	
	public static void main(String[] args) {
		defaultconstructor2 d = new defaultconstructor2();
		defaultconstructor2 b = new defaultconstructor2();
		defaultconstructor2 c = new defaultconstructor2();
		
		
		System.out.println(c.i);
		
		

	}

}
