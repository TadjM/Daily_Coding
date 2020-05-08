package com.evaluation;

import java.util.*;
public class ReverseBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Interger: ");
		input = sc.nextInt();
		
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		
		while(input > 0) {
			Arr.add(input%2);
			input = input/2;
		}
		
		System.out.println( "Output: " + ToDecimal(Arr));

	}	 
	
    public static int ToDecimal(ArrayList<Integer> Arr) {
    	int total = 0;

    	for(int i = Arr.size()-1; i >= 0 ; i--) {
           if (Arr.get(i) == 1) {
    	       total += Math.pow(2, Arr.size()-1 -i);
            }
    	}
        return total;
    }

}
