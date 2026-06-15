package com.tnsif.str;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Welcome");
		
		System.out.println(s);
		System.out.println(s.append("!"));
		System.out.println(s.substring(3,7));
		System.out.println(s);

	}

}
