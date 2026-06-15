package com.tnsif.str;

public class StringDemo {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = new String("Hello");
		
		System.out.println(s);
		System.out.println("");
		
		System.out.println("s.equals(s1): " +s.equals(s1));
		System.out.println("s==s1: " +s==s1);
		System.out.println("");
		
		System.out.println("Uppercase: " +s.toUpperCase());
		System.out.println("LowerCase: " +s.toLowerCase());
		System.out.println("charAt: " +s.charAt(1));
		System.out.println("codePointAt: " +s.codePointAt(0));			//ASCI value
		System.out.println("Length: " +s.length());
		System.out.println("");
		
		System.out.println("After oper: " +s);

	}

}
