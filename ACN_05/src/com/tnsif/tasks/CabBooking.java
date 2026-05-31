package com.tnsif.tasks;

//Cab Booking System

class Cab{
	String cabType;
	double fair;
	
	static int totalRides = 0;
	
	Cab(String cabType, double fair){
		this.cabType = cabType;
		this.fair = fair;
		totalRides++;
	}
	
	void display() {
		System.out.println(cabType+" Fare: "+fair);
	}

}

class Ola extends Cab{
	Ola(String cabType, double fair){
		super(cabType, fair);
	}
}

class Uber extends Cab{
	Uber(String cabType, double fair){
		super(cabType, fair);
	}
}



public class CabBooking {
	
	public static void main(String[] args) {
		Ola o = new Ola("Ola_Mini", 200);
		Uber u = new Uber("Uber_Mini", 150);
		
		o.display();
		u.display();
		
		System.out.println(" ");
		System.out.println("Total Rides: " + Cab.totalRides);

	}

}
