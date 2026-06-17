package com.tnsif.multithreads;

//Using(extending) Thread class

public class MultiThread extends Thread {
	public void run() 
	{
		for(int i=1; i<=10; i++) {
			System.out.println("Child Thread: " +i);
		}
		
	}
}
