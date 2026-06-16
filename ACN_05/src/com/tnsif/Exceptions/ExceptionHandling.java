package com.tnsif.Exceptions;

public class ExceptionHandling {
	public void show()
	{
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Arithemetic Exception: A number divided by Zero is not possible!");
		}
		finally {
			System.out.println("This is a Finally Block!");
		}
		
	}

}