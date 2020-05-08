package com.Day_1;

import java.util.*;



public class Lottery {
	
	
	public static String removeCharAt(String s, int pos) {
	    return s.substring(0, pos) + s.substring(pos + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Win = "234";
		byte count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your chosen number with Three digits : ");
		String str = sc.nextLine();
		
		
		if(Win.equals(str))
			System.out.println("You won. The award is $10,000");

		else{

		    for (byte i = 0; i < str.length(); i++) {
		    	for (byte j = 0 ; j < Win.length(); j++) {
		    		int y = Character.getNumericValue(str.charAt(i));
		    		
			        if (y ==  Character.getNumericValue(Win.charAt(j))){

			    	   count++;
		    	       Win = removeCharAt(Win, j);
				      System.out.println(Win);
			       }
		    	}
		     }	
	    }
		if (count == 3)
			System.out.println("You won. Your award is $3,000");
		else if (count == 1)
			System.out.println("You won. Your award is $1,000");
		else if (count == 0 && !(Win.equals(str)))
			System.out.println("You lost");

	}

}
