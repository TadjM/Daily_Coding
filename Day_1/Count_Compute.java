package com.Day_1;
import java.util.*;
public class Count_Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0,positive=0, negative=0;
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
       
        String input = sc.nextLine();    // get the entire line after the prompt 
        String[] numbers = input.split(" ");
        
        for (int i = 0; i < numbers.length; i++) {
             int temp= Integer.parseInt(numbers[i]);
             sum += temp;
             
             if(temp > 0)
            	 positive++;
             else if(temp < 0)
            	 negative++;
        }
        
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + (double)(sum/(numbers.length-1)));

             
	}

}
