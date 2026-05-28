package com.tnsif.inheritance;
/* Create a class Animal with a method sound()
Create another class Dog that inherits from Animal
Print both methods using object of child class */

class Animal {
	void sound() {
		System.out.println("Animal sound");
	}
	
}
class Dog extends Animal {
	void bark() {
		System.out.println("Dog bark");
	}
	
}
public class task {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.bark();
		

	}

}
