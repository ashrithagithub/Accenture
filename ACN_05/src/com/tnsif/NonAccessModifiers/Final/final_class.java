package com.tnsif.NonAccessModifiers.Final;

final public class final_class {
	
	void add() {
        int a = 10, b = 20;
        System.out.println("The sum is: " + (a + b));
    }

	public static void main(String[] args) {
		final_class c = new final_class();
        c.add();

	}

}


// throws error as final class can not be inherited

//class Child extends final_class{

//}


