package com.tnsif.day1;
//if, if-else, elseif, switch
public class if_conditions {

	public static void main(String[] args) {
		int age = 10;
		int marks = 50;
		
		if(age>=18) {
			System.out.println("Eligible for Voting!");
		}
		else {
			System.out.println("Not Eligible for Voting");
		}

// else-if
		if (marks>=80 && marks<=100) {
			System.out.println("A grade");
		}
		else if(marks>=50 && marks<=79){
			System.out.println("B grade");
		}
		else if(marks>=35 && marks<=49) {
			System.out.println("C grade");
		}
		else {
			System.out.println("FAIL");
		}
	}

}
