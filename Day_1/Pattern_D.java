package com.Day_1;

public class Pattern_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (byte i = 6; i >= 1; i--) {
        	for (byte j = 1; j<= 6-i; j++)
        		System.out.print(" ");
        	for (byte x = 1 ; x <= i; x++)
        		System.out.print(x);
        	
    		System.out.println();

        }

	}

}
