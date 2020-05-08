package com.Day_3;    

import java.util.*;
public class ExceptionHandling {
	
	public static  int binaryToDecimal(String binaryString) throws NumberFormatException{
		
		if(checkIfBinary(binaryString) == false) {
			
			throw new NumberFormatException("The value entered is not a binary string try again ");
		}
		else {
			int result = 0;

			for (int i = binaryString.length() - 1 ; i >= 0; i--) {
				if (binaryString.charAt(i) == '1') {
					result += Math.pow(2,binaryString.length() - i - 1 );
				}
			  }
			return result;
		}
		  
	    
    }
	public static boolean checkIfBinary(String str) {
		for (byte i = 0;  i < str.length(); i++ ) {
			if(str.charAt(i) != '1' && str.charAt(i) != '0') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a binary string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		try {
			System.out.println("The conversion of " + '"' + str + '"' + " into decimal is: " + binaryToDecimal(str));
		}
		
		catch (NumberFormatException  e ){
			System.out.println(e.getMessage());
	
		}
   }
	
}
 