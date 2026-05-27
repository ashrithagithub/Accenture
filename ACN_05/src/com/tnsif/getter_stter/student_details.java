package com.tnsif.getter_stter;

public class student_details {

	public static void main(String[] args) {
		
		// creating object (setting the values)
		
		student std = new student();
		std.setStdid(697);
		std.setStdname("Ashritha Priya");
		std.setMarks(9.02);
		std.setClgname("MRU");
		
		// calling the values( getting the values)
		
		System.out.println(std.getStdid());
		System.out.println(std.getStdname());
		System.out.println(std.getMarks());
		System.out.println(std.getClgname());

	}

}
