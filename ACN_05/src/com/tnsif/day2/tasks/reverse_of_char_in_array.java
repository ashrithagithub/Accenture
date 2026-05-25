package com.tnsif.day2.tasks;

public class reverse_of_char_in_array {

	public static void main(String[] args) {
		// Reverse of char that are present in an array
		// 1st swap:   a s h u --> u s h a 
		// 2st swap:   a s h u --> u h s a 
		// for(char c : arr)  --> Takes each character from the array and prints it

		char[] arr = {'a','s','h','u',};
		
		int start = 0;                  //a
		int end = arr.length - 1;		//u
		
		while(start < end) {
			char temp = arr[start];    	//temp = a
			arr[start] =arr[end];		//start = u ---> u s h u
			arr[end] = temp;			//end = a  ---> u s h a
			
			start++;
			end--;
			
		}
		for(char c: arr) {
			System.out.print(c + " ");
		}
		
	}

}
