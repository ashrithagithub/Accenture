package com.tnsif.Polymorphism;

public class MethodOverriding {
	public void build() {
		System.out.println("My father constructed 2 floors building");
	}
}
class child extends MethodOverriding{
	public void build() {
		System.out.println("I Reconstructed it to 3 floors building");
	}
}
