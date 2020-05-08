package com.Day_4;

import java.util.*;
public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word; 
		TreeSet<String> set = new TreeSet<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words and enter 'null' when you done(Press enter after each entry): ");
		
		while(!((word = sc.nextLine()).equals("null"))) {
			set.add(word);
		}
        System.out.println("The sorted Non duplicate word are: " + set);
		
	}

}
