package com.Day_1;

public class Population_projection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We have 86400 seconds/day
		
		double Seconds = 365 * 86400;// Number of second per year
		double NumberOfBirth = Seconds/7; // Number of  birth per year
		double NumberOfDeath = Seconds/13; // Number of deaths per year
		double NumberOfImmigrant = Seconds/45;  // Number of Immigrant per year
		double Population = 312032486;
		
		for (byte i = 1; i <= 5; i++) {
			Population = Population + NumberOfBirth + NumberOfDeath + NumberOfImmigrant;
			System.out.println("The population of the next " + i + "th year is " + Population);
		}
		
	}

}
