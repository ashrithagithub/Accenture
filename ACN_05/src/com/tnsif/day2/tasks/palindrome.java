package com.tnsif.day2.tasks;

public class palindrome {

	public static void main(String[] args) {
		// Palindrome or not
		//instead of ==  we use .equals() -> to check actual content		
		
		String s = "madam";
		String rev_s = "";
		for(int i=s.length()-1; i>=0; i--) 
		{
			rev_s = rev_s + s.charAt(i);
			
		}
		
		if(s.equals(rev_s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
			

	}

}
