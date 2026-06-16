package com.tnsif.Exceptions;

public class NullPointerExce {

	public void show()
	{
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception c) {
			System.out.println("The string null doesn't contain any length");
		}
	}

}
