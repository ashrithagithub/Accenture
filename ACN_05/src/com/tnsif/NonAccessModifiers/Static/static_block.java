package com.tnsif.NonAccessModifiers.Static;

public class static_block {
	
	//static block
	static
	{
		System.out.println("I'll print without object creation");
	}

	public static void main(String[] args) {
		// no need to create object as it is static block
		

	}

}
