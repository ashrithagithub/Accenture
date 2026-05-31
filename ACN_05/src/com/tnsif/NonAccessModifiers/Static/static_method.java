package com.tnsif.NonAccessModifiers.Static;

public class static_method {
	
	// static method
	static void add()
	{
		System.out.println(10+10);
	}

	public static void main(String[] args) {
		
		// to access we don't need object, we directly access using class and method
		
		static_method.add();

	}

}
