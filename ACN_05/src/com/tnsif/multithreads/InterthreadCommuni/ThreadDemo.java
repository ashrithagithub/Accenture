package com.tnsif.multithreads.InterthreadCommuni;

public class ThreadDemo {
	int i;
	boolean flag = false;
	
	synchronized void deliver(int i)
	{
		if(flag)
		{
			try {
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Exception caught");
			}
		}
		this.i = i;
		flag = true;
		System.out.println("Date delivered: "+i);
		notify();
	}
	
	synchronized int receiver()
	{
		if(!flag)
		{
			try {
				notify();
			}
			catch(Exception e) {
				System.out.println("Exception caught");
			}
		}
		System.out.println("Data received: "+i);
		flag = false;
		notify();
		return i;
	}

}
