package com.tnsif.day2;

public class reverse_of_string {

	public static void main(String[] args) {
		//reverse of a string
		
		String s = "Programming";
		for(int i=s.length()-1; i>=0; i--) 
		{
			System.out.print(s.charAt(i));
		}

	}

}
