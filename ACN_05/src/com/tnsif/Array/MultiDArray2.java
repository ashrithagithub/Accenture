package com.tnsif.Array;

public class MultiDArray2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
	
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<4; j++) 
			{													//Math.random() gives random values(by default double)
				arr[i][j] = (int)(Math.random()*10);            //type casting: converting double to integer
				System.out.print(arr[i][j]+ " ");				//without *10 gives only 0's,can also give *100...
			}									
			System.out.println(" ");
		}

	}

}
