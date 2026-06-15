package Assessment;

//Write a program to check whether a given number is prime or not. 

import java.util.Scanner;

public class prime_or_not {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("It is a Prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}