package Assessment;

//Write a program to find the largest among three numbers entered by the user.

import java.util.Scanner;

public class largest_among_three_numbers {

	public static void main(String[] args) {

		System.out.println("Enter the three numbers: ");
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1> n3)
		{
			System.out.println(n1 +" is the Largest Number");
		}
		else if (n2 > n1 && n2> n3)
		{
			System.out.println(n2 +" is the Largest Number");
		}
		else if (n3 > n1 && n3> n2)
		{
			System.out.println(n3 +" is the Largest Number");
		}
	}

}