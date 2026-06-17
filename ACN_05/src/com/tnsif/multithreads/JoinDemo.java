package com.tnsif.multithreads;

public class JoinDemo extends Thread{
	public void run()
	{
		for(int i=1; i<=5; i++) {
			System.out.println("Child Thread: " +i);
		}
	}

	public static void main(String[] args) throws InterruptedException{
		JoinDemo t = new JoinDemo();
		t.start();
		
		t.join();			//Main thread waits for Child Thread
							// without join, Main thread will be executed first
		
		System.out.println("Main Thread Ends");
		
		

	}

}
