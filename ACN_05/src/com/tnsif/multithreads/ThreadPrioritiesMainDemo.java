package com.tnsif.multithreads;

public class ThreadPrioritiesMainDemo {

	public static void main(String[] args) {
		
		ThreadPrioritiesDemo t1 = new ThreadPrioritiesDemo("Low Priority");
		ThreadPrioritiesDemo t2 = new ThreadPrioritiesDemo("Medium Priority");
		ThreadPrioritiesDemo t3 = new ThreadPrioritiesDemo("High Priority");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
