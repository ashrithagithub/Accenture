package com.tnsif.tasks;

//Railway Reservation

class Tickets
{
	int ticketId;
	String passengerName;
	String trainName;
	
	static int totalTickets = 0;
	
	Tickets(int ticketId, String passengerName, String trainName)
	{
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.trainName = trainName;
		totalTickets ++;
	}
	
	void display() {
		System.out.println(ticketId + " " + passengerName + " --> "+ trainName);
	}	
}


class Sleeper extends Tickets
{
	Sleeper(int ticketId, String passengerName, String trainName)
	{
		super(ticketId, passengerName, trainName);
	}
}

class ThirdAC extends Tickets
{
	ThirdAC(int ticketId, String passengerName, String trainName)
	{
		super(ticketId, passengerName, trainName);
	}
}



public class RailwayReservation {

	public static void main(String[] args) {
		
		Sleeper s = new Sleeper(1, "Ashritha", "Vishaka Express");
		ThirdAC t = new ThirdAC(2, "Priya", "Superfast");
		
		s.display();
		t.display();
		
		System.out.println(" ");
		System.out.println("Total Tickets Booked: "+ Tickets.totalTickets);



	}

}
