package com.evaluation;

import java.util.*;
public class FirstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] Arr = {1, 2, 2, 3, 3, 4, 5};
		int MinIndex = Arr.length;

		System.out.println(Duplicate(Arr, MinIndex));
		

	}
    public static int Duplicate(int[] Arr, int MinIndex) {
    	
    	for(int i = 0; i < Arr.length; i++) {
			for(int j = i + 1; j< Arr.length; j++) {
				if(Arr[i] == Arr[j]) {
				  if(MinIndex > j) {
					 MinIndex = j;
				  }
				}
					
			}
		}
		if(MinIndex == Arr.length) {
			return -1;
		}
		else {
			return Arr[MinIndex];
		}
    }
}
