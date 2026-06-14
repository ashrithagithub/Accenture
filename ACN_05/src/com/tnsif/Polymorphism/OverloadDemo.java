package com.tnsif.Polymorphism;

public class OverloadDemo {

	public static void main(String[] args) {
		MethodOverload ob = new MethodOverload();
		
		ob.show();
		ob.show(10);
		ob.show(10,2.0);
		ob.show(1.0,20);
		ob.show(10,20,30);

	}

}
