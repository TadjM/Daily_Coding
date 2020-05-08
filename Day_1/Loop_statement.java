package com.Day_1;

public class Loop_statement {

	public static void main(String[] args) {
		byte n = 7;
		for (byte i = 1; i <= n; i++) {
			for (byte j = 1; j <= i; j++)
				System.out.print(j);
				
			for (byte x = 1; x <= n-i ; x++)
				System.out.print("*");
				
			System.out.println();
			System.out.println();
			
		}
        
	}

}
