package com.Day_2;

public class HotelTester {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel("Jet Set", "New York");
		hotel.addRoom(101, "queen", 's', 100);
		hotel.addRoom(102, " king", 'n', 110);
		hotel.addRoom(103, "king", 'n', 88);
		hotel.addRoom(104, "twin", 's', 100);
		hotel.addRoom(105, "queen", 's', 99);
		
		//Add a reservation
		hotel.addReservation("Maruthi", 'n', "king");
		hotel.addReservation("Thien", 's', "twin");

		//Find a reservation
		hotel.findReservation("Maruthi");
		//Daily sales
		System.out.println("The daily sales is: " + hotel.getDailySales() + "\n");
		//Occupancy percentage
		System.out.println("The occupency percentage is: " + hotel.occupancyPercentage() + "\n");
		
		System.out.println(hotel.toString());

        //Print the list 
		hotel.printReservationList();
		
		//Cancel reservation
		System.out.println("--------Canceling reservation with customer name MAruthi-----------------");
		hotel.cancelReservation("Maruthi");
		
		//Print list after a reservation canceled
		System.out.println("------------Printing the rest of the reservation-------------------");

		hotel.printReservationList();
	
        

		


	}

}
