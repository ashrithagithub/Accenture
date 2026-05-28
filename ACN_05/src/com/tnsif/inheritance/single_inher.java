package com.tnsif.inheritance;

class Course
{
	String coursname="Java programming";
	
	void showCourse() 
	{
		System.out.println("Course: "+ coursname);
	}
}

class Student extends Course{
	String studname="Ashritha Priya";
	
	void showName() {
		System.out.println("Student Name: "+ studname);
	}
}
public class single_inher {

	public static void main(String[] args) {
		Student st = new Student();
		st.showCourse();
		st.showName();

	}

}
