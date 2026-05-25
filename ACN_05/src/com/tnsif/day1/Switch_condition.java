package com.tnsif.day1;

public class Switch_condition {

	public static void main(String[] args) {
		int day = 9;
		int x = 10;
		String str = "Java";
	
//ex-1
		switch(day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Invalid Day"); 
		}

//ex-2
		switch(x) {
	    case 5:
	    case 10:
	    case 15: System.out.println("Matched"); break;
	    default: System.out.println("Not Matched");
	}
		
//ex-3
		switch(str) {
		case "java": System.out.println("Smaller java"); break;
		case "JAVA": System.out.println("Upper JAVA"); break;
		case "Java": System.out.println("Capital Java"); break;
		default: System.out.println("Invalid Input");
		}
		
		
		
}
		

}
