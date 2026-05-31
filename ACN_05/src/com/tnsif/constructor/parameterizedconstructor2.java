package com.tnsif.constructor;

public class parameterizedconstructor2 {
	
	int i;
	String name;
	
	//parameterized constructor
	parameterizedconstructor2(int i){
		System.out.println("I am parameterized constructor");
		this.i =i;
		
	}
	
	
	public static void main(String[] args) {
		parameterizedconstructor2 p = new parameterizedconstructor2(25);
		
		System.out.println(p.i);
		System.out.println(p.name);

	}

}
