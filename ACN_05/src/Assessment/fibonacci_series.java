package Assessment;

//Write a program to print the first N terms of the Fibonacci series.


import java.util.Scanner;
public class fibonacci_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to print Fibonacci Series: ");
		int num = sc.nextInt();

		int a = 0, b = 1;

		for (int i = 1; i <= num; i++) {
		    System.out.print(a + " ");
		    int c = a + b;
		    a = b;
		    b = c;
		}
	}

}
