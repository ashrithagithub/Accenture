package com.tnsif.multithreads.Synchro;

public class Table {
	
	//public void printTable(int n)							// without synchronized keyword 
	
	synchronized public void printTable(int n)				// with synchronized keyword 
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

}
