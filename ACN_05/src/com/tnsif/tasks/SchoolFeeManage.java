package com.tnsif.tasks;

//School fee management system

class Student
{
	int studId;
	String studName;
	
	final String schoolName = "MRU";
	
	Student(int studId, String studName)
	{
		this.studId = studId;
		this.studName = studName;
	}
	void display() {
		System.out.println(studId+ " "+ studName);
		System.out.println("School Name: "+schoolName);
	}
}



class Engineering extends Student
{
	double fee;
	
	Engineering(int studId, String studName, double fee)
	{
		super(studId,studName);
		this.fee = fee;
	}
	
	void displayFee()
	{
		display();
		System.out.println("Total Fee: "+fee);
		System.out.println("");
	}
}



class Medical extends Student
{
	double fee;
	Medical(int studId, String studName, double fee)
	{
		super(studId, studName);
		this.fee = fee;
	}
	void displayFee()
	{
		display();
		System.out.println("Total Fee: "+fee);
		System.out.println();
	}
}


public class SchoolFeeManage {

	public static void main(String[] args) {
		
		Engineering e = new Engineering(1, "Sandeep", 2300.90);
		Engineering e1 = new Engineering(2, "Nani", 3400.90);
		
		Medical m = new Medical(3, "Prashu", 2345.822);
		Medical m1 = new Medical(4, "Ashu", 3345.822);
		
		e.displayFee();
		e1.displayFee();
		m.displayFee();
		m1.displayFee();
		

	}

}
