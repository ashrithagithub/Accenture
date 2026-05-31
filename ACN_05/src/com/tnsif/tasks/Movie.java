package com.tnsif.tasks;

//Movie Ticket Booking

public class Movie 
{
	String movieName;
	int seats;
	
	Movie(String movieName, int seats)
	{
		this.movieName = movieName;
		this.seats = seats;
	}
	
	void display() {
		System.out.println(movieName + " have "+ seats + " Seats!");
	}

	public static void main(String[] args) {
		Movie m = new Movie("Hi_Nana ", 4);
		Movie m1 = new Movie("Manam ", 30);
		Movie m2 = new Movie("Bahubali ", 10);
		
		m.display();
		m1.display();
		m2.display();

	}

}
