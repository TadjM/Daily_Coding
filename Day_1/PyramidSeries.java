package com.Day_1;

public class PyramidSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte j = 5;
		
		for (byte i = 1; i <= j; i++ ) {
			
			//control space 
			for(byte x = 1; x <= j-i; x++ )
				System.out.print(" ");
			
			//Print the stars
			for(byte y = 1; y <= i; y++)
				System.out.print("* ");
			
			System.out.println();
		}

	}

}
