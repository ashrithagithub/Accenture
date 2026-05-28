package com.tnsif.inheritance;

class Employee
{
	void company() 
	{
		System.out.println("Company: TNSIF");
	}
}

class Developer extends Employee
{
	void role()
	{
		System.out.println("Role: Software Developer");
		System.out.println(" ");
	}
}

class Tester extends Employee
{
	void role() {
		System.out.println("Role: QA Tester");
	}
}


public class hierarchical_inher {

	public static void main(String[] args) {
		Developer d = new Developer();
		Tester t = new Tester();
		
		d.company();
		d.role();
		
		t.company();
		t.role();

	}

}
