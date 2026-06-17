package com.tnsif.multithreads;

public class isAliveDemo extends Thread{
	public void run()
	{
		System.out.println("Thread Running");
	}

	public static void main(String[] args) {
		isAliveDemo t = new isAliveDemo();
		
		System.out.println(t.isAlive()); 	//false
		t.start();
		System.out.println(t.isAlive()); 	//true
		

	}

}
