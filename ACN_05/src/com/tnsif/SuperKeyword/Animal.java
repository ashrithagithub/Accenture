package com.tnsif.SuperKeyword;

public class Animal {
	
	String colour = "white";
	
	public void sound()
	{
		System.out.println("The Animal Sound");
	}
	
	Animal()
	{
		System.out.println("This is Animal Counstructor");
	}
}

class Dog extends Animal
{
	String colour = "brown";
	
	public void sound()
	{
		System.out.println("Dog Barks");
		System.out.println("The colour of Animal is: "+ super.colour);
		super.sound();
	}
	Dog()
	{
		System.out.println("This is Dog Counstructor");
		super();
	}
	
}
