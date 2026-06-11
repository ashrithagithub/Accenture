package com.tnsif.NonAccessModifiers.Abstract;

//can consist of abstract and non abstract methods

abstract class superclass
{	
	//abstract method: there will be no block of code {} 
    abstract public void display();
    
    //non abstract method
    public void show() 
    {
    	System.out.println("This is a non abstract method");
    }
}

class subclass extends superclass
{
    public void display()
    {
        System.out.println("This is an abstract class");
    }
}

public class abstractclass {

	public static void main(String[] args) {
		subclass s = new subclass();
		s.display();
		s.show();

	}

}
