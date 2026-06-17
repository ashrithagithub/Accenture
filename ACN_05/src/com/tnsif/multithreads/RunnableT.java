package com.tnsif.multithreads;

//Using Runnable Interface

public class RunnableT implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Child Runnable Thread: " +i);
		}
		
	}

}
