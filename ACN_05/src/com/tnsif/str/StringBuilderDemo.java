package com.tnsif.str;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		
		System.out.println(sb);
		System.out.println(sb.append("!"));
		System.out.println(sb.substring(2));
		System.out.println(sb);

	}

}
