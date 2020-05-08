package com.Day_1;

import java.util.*;
public class Datatype_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers (Press enter after each number) : ");
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        for (int i = num1; i <= num2; i++) {
        	System.out.print(i + "         " + i*i + "         " +  i*i*i );
    	    System.out.println();
        }
        

	}

}
