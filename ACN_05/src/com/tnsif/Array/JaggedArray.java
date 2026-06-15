package com.tnsif.Array;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] nums = new int[3][];			// fixed row size i.e; 3
		nums[0] = new int[3];					// assigning columns(not fixed)
		nums[1] = new int[4];
		nums[2] = new int[2];
		
		
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<nums[i].length; j++) 
			{													//Math.random() gives random values(by default double)
				nums[i][j] = (int)(Math.random()*10);            //type casting: converting double to integer
				System.out.print(nums[i][j]+ " ");				//without *10 gives only 0's,can also give *100...
			}									
			System.out.println(" ");
		}
	}

}
