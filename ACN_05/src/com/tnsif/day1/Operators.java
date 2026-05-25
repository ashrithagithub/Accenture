package com.tnsif.day1;
import java.util.*;

public class Operators {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b values below: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
	
//1. Arithmetic Operators
		System.out.println("----------Arithmetic Operators");
		System.out.println("Addition: "+ (a+b));
		System.out.println("Subtaction: "+ (a-b));
		System.out.println("Multiplication: "+ (a*b));
		System.out.println("Division: "+ (a/b));
		System.out.println("Modulus: "+ (a%b));
		
//2. Relational Operators
		System.out.println("----------Relational Operators");
		System.out.println("a>b: "+ (a>b));
		System.out.println("a<b: "+ (a<b));
		System.out.println("a==b: "+ (a==b));
		System.out.println("a!=b: "+ (a!=b));
		System.out.println("a>=b: "+ (a>=b));
		System.out.println("a<=b: "+ (a<=b));
		
//3. Logical Operators
		System.out.println("----------Logical Operators");
		System.out.println("(a>b && b>0): "+ (a>b && b>0));
		System.out.println("(a>b || b>0): "+ (a>b || b>0));
		System.out.println("!(a>b): "+ !(a>b));
				
//4. Assignment Operators	
//a+=b -> a=a+b
		System.out.println("----------Assignment Operators");
		System.out.println("a+=b: "+ (a+=b));
//		System.out.println("a-=b: "+ (a-=b));
//		System.out.println("a*=b: "+ (a*=b));
//		System.out.println("a/=b: "+ (a/=b));
//		System.out.println("a%=b: "+ (a%=b));
		//Bitwise Assignment Operators	
//		System.out.println("a&=b: "+ (a&=b));
//		System.out.println("a|=b: "+ (a|=b));
//		System.out.println("a^=b: "+ (a^=b));
//		System.out.println("a<<=b: "+ (a<<=b));
//		System.out.println("a>>=b: "+ (a>>=b));
		

//5. Unary Operators
		int x = 5;
		System.out.println("----------Unary Operators");
		System.out.println("x:" + x);
		System.out.println("x++:" + (x++));    //use then increase(old value)
		System.out.println("after x++:" + x);
		System.out.println("++x:" + (++x));    //increase then use(new value)
		System.out.println(" x--:" + (--x));
		
		
//6. Bitwise Operators
		int c =1;
		int d =2;
		System.out.println("----------Bitwise Operators");
		System.out.println("c&d: "+ (c&d));
		System.out.println("c|d: "+ (c|d));
		System.out.println("c^d: "+ (c^d));
		System.out.println("~d: "+ (~d));
		System.out.println("c<<1: "+ (c<<1));
		System.out.println("c>>1: "+ (c>>1));
		System.out.println("c>>>1: "+ (c>>>1));

		
//7. Ternary Operator
		//short form of if-else
		System.out.println("----------Ternary Operators");
		int e = 12, f = 23;
		String result = (e>f) ? "e is greater" : "f is greater";
		System.out.println(result);

		
//8. Instanceof Operator
		//Checks object type
		System.out.println("----------Instanceof Operator");
		String name = "Ashu";
        System.out.println(name instanceof String);
		
		
		sc.close();

	}

}
