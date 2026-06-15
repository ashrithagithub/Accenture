package com.tnsif.Array;

public class SingleDArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3};                            //dynamic allocation
		int []arr2 = {4,5,6,7,8,9,10,11,12,13};
		//int arr3[] = {14,15,16};
		
		//arr
		System.out.println("Index of arr[1]: " +arr[1]);
		System.out.println(" ");
		
		
		//arr2
		for(int i=0; i<arr2.length; i++) 
		{
			System.out.println("All values of arr2: " +arr2[i]);
		}
		
		System.out.println(" ");
		
		
		
		//arr4
		// instantiation(object) of an array
		// static allocation
		
		int[] arr4 = new int[2];
		arr4[0] = 101;
		arr4[1] = 102;
		
		System.out.println(arr4[1]);
		
	
		
		
	}

}
