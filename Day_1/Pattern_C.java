package com.Day_1;

public class Pattern_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        for (byte i = 1; i <= 6; i++) {
	        	for (byte j = 1; j<= 6-i; j++)
	        		System.out.print(" ");
	        	for (byte x = i ; x >= 1; x--)
	        		System.out.print(x);
	        	
	    		System.out.println();

	        }
	}

}
