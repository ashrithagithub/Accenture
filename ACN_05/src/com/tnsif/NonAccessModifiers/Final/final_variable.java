package com.tnsif.NonAccessModifiers.Final;

public class final_variable {
	
	
	public static void main(String[] args) {
		int x=10; //local variable
		x=20;
		
		final int y =10; // final variable: can't change
		//y=20;            // throws error 
		
		System.out.println(x);
		System.out.println(y);
		

	}

}
