package com.Day_4;

import java.util.*; 
public class Occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int input, counter = 1, greatest =0, save=0; 
       
       ArrayList<Integer> Array = new ArrayList<Integer>();
       ArrayList<Integer> temp = new ArrayList<Integer>();
       
       System.out.print("Enter a serie of integers (Press enter after each one): ");
       while((input = sc.nextInt()) != 0) {
    	   Array.add(input);
       } 
       
       Integer[] Arr = new Integer[Array.size()];
       Arr = Array.toArray(Arr);
       Arrays.sort(Arr);
              
       for (int j = 0; j < Arr.length-1; j++) {
    	   
    	    if (Arr[j] == Arr[j+1]){
    	    	counter++;
    	    	System.out.println(j); 
    	    }
    	    else if (Arr[j] != Arr[j+1]) {
    	    	
    	    	if(counter > 1) { 
    	    	   temp.add(Arr[j]);  
    	    	   temp.add(counter);
    	    	   counter = 1;
    	    	}
    	    }  		    		   
       }
       
       System.out.println(temp);
       for(int i = 1; i < temp.size()-2; i+=2) { 
    	   greatest = temp.get(i);
    	   if(greatest < temp.get(i+2)) {
    		   greatest = temp.get(i+2);
    		   save = i+2;
    	   }
       }
       if(save != 0) {
          System.out.println(temp.get(save-1) + " appeared " + temp.get(save));
       }
       
       for(int j = 1; j < temp.size()-2; j+=2) {
           if(greatest == temp.get(j+2)) {
               System.out.println(temp.get(j+1) + " appeared " + temp.get(j+2));

           }
       }
       
	}

}
