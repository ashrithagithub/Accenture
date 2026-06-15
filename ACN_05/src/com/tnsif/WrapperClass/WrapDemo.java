package com.tnsif.WrapperClass;

public class WrapDemo {

	public static void main(String[] args) {
		
		//Auto Boxing (wrapping)
		int a =10;
		System.out.println("the value of a is: "+ a);
		Integer i = new Integer(a);
		System.out.println("Auto-Boxing (Wrapping) of i is: "+ i);

		//Auto Unboxing (unwrapping)
		int unbox = i.intValue();
		System.out.println("Auto-Unboxing (Unwrapping) of unbox is: "+ unbox);
		
		
		System.out.println(" ");
		
		//example-2
		char c = 'a';
		Character ch = new Character(c);
		System.out.println("Auto-Boxing (Wrapping) of ch is: "+ ch);
		
		char unwrap = ch.charValue();
		System.out.println("Auto-Unboxing (Unwrapping) of i is: "+ unwrap);
		
	}

}
