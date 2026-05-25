package com.tnsif.day2;

public class max_num_in_array {

	public static void main(String[] args) {
		//Maximum number in a given Array
		//in array for length we don't keep ()		
		
		int[] arr = {10,32,4,53,18};
		int max = arr[0];
		for (int i=0; i<arr.length; i++) 
		{
			if(arr[i] >= max)
			{
				max = arr[i];	
			}
		}
		System.out.println("The highest Value is: "+ max);
	}

}
