package com.Day_4;

import java.util.*;
public class ConsonantAndVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countConsonants = 0, countVowels =0;
		Set<Character> set = new HashSet<Character>();
		set.add('U');
		set.add('O');
		set.add('I');
		set.add('E');
		set.add('A');
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text: ");
		String str = sc.nextLine();
		
		//convert to uppercase to standardize
		String  text = str.toUpperCase();
		char[] characters = text.toCharArray();
		
			for(int i = 0; i < characters.length; i++) {
				//Check if the set contains the character
				if (set.contains(characters[i])){
					countVowels++; 
				}
			    else {
			    	countConsonants++;
			    
				}
			}
			
			System.out.println("The number of vowels is: " + countVowels);
			System.out.println("The number of Consonants is: " + countConsonants);

			
		
	}

}
