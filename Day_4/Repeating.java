
package com.Day_4;

import java.util.Arrays; 

public class Repeating {

	public static void main(String[] args) {
	 
		// Our arr contains 8 elements 
		int[] arr = {3, 1, 3}; 

		Arrays.sort(arr); 
		
		for (byte i = 0; i < arr.length -1 ; i++) {
			if (arr[i] == arr[++i]) {
				System.out.println("Missing = " + (arr[i]-1) + ", Repeating = " + arr[i]);
			}

		}

	} 
} 
