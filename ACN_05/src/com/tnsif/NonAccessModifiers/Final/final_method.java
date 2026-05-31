package com.tnsif.NonAccessModifiers.Final;

public class final_method {
	
	void add() {
    //final void add() {
        int a = 10, b = 20;
        System.out.println("The sum is: " + (a + b));
    }
    
    
    // running here because it is public class, in child class there is no public 
    public static void main(String[] args) {
        Child c = new Child();
        c.add();
    }
    
    
}

class Child extends final_method {
	// throws error as method overridden as method is declared as final
	// try without final then it gives "the sum is 60" as an output
    void add() {
        int a = 10, b = 20, c = 30;
        System.out.println("The sum is: " + (a + b + c));

    }
}