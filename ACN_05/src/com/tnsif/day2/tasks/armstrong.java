package com.tnsif.day2.tasks;
import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// Armstrong number or not
		// String.valueOf(n) -> converting int num to string 
		// .length() -> Counts how many characters are there
		// % 10 → Get last digit of the number Ex: 153 % 10 = 3
		// Math.pow(digit, n) -> digit power (digit^n) to sum
		// num/=10 -> last digit gets removed Ex: 153 / 10 = 15 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		int original = num;
		int sum = 0;
		
		int n = String.valueOf(num).length();
		
		while(num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, n);
			num/=10;
		}
		if (sum == original) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
			
		}
		
		sc.close();	
	}

}
