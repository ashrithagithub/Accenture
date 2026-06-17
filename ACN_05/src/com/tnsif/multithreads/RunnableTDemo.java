package com.tnsif.multithreads;

public class RunnableTDemo {

	public static void main(String[] args) {
		RunnableT rt = new RunnableT();
		Thread t = new Thread(rt);						//creating object for thread class
		t.start();

		for(int i=1; i<=10; i++) {
			System.out.println("Main Thread: " +i); 	// output will be keep on changing according to the CPU priorities
		}
		
	}

}
