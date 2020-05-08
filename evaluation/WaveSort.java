package com.evaluation;

import java.util.*;

public class WaveSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallest;
		int[] Arr = { 5, 2, 9, 3, 2 };
	
		  
		//Use the build in method to sort the array
		Arrays.sort(Arr);

		for (int i = 0; i < Arr.length - 1; i += 2) {
			swap(Arr, i, i + 1);
		}
		
	   	
        System.out.print("Output: ");
		for (int i : Arr) {
			System.out.print( i + "  ");
		}

	}

	public static void swap(int[] Arr, int x, int y) {
		int tempo = Arr[x];
		Arr[x] = Arr[y];
		Arr[y] = tempo;
	}

}
