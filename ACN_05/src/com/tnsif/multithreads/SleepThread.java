package com.tnsif.multithreads;

public class SleepThread extends Thread {
	public void run() 
	{
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);              //slowly displays output one by one
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
		}
		
	}

}
