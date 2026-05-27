package com.tnsif.scanner_class;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your ID: ");
		int id = sc.nextInt();
		System.out.println("Enter your Name: ");
		String name = sc.next();
		System.out.println("Enter your Marks: ");
		double marks = sc.nextDouble();
		
		System.out.println("your ID: "+id);
		System.out.println("Name: "+name+ ", You scored: "+marks);
		
		

		sc.close();
	}

}
