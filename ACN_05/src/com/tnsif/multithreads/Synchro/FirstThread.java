package com.tnsif.multithreads.Synchro;

public class FirstThread extends Thread
{
	Table t;

	//constructor
	public FirstThread(Table t) {
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(2);;
	}
	
	

}
