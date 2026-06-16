package com.tnsif.Exceptions;

public class MultipleCatchBlocks {
	public void show()
	{
		try {
			//NullPointerException
			String s = "ashritha";
			System.out.println(s.length());
			
			//ArithmeticException
			int a = 10;
			int b = 20;
			int c = a/b;
			System.out.println(c);
			
			//ArrayIndexOutOfBoundsException
			int[] arr = {10,20,30,40,50};
			System.out.println(arr.length);
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e2) 
		{
			System.out.println("You are retriving Exceed value");
		}
		catch(NullPointerException e) 
		{
			System.out.println("The string null doesn't contain any length");
		}
		catch(ArithmeticException e1) 
		{
			System.out.println("Arithemetic Exception: A number divided by Zero is not possible!");
		}
		finally 
		{
			System.out.println("This is a Finally Block!");
		}
		
	}

}
