package com.Day_2;

import java.util.*;
public class Hotel extends Room {
	//private Room[] theRooms = new Room[10];
	private ArrayList<Room> theRooms = new ArrayList<Room>();
	private String name;
	private String location;
	private int occupiedCnt;
	private int numOfRooms;
	
	public Hotel() {
		for (int i = 0; i < theRooms.size(); i++) {
            theRooms.get(i).setOccupant("None");  
        }
		this.name = " ";
		this.location = " ";
		this.occupiedCnt = 0;
		this.numOfRooms = 0; 
		
	}	
    public Hotel(String name, String location) {
		this.name = name;
		this.location = location;
		this.numOfRooms = 0;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public boolean isFull() {
		return (numOfRooms==occupiedCnt);
	}
	public boolean isEmpty() {
		return (occupiedCnt == 0);
	}
	public void addRoom(int roomNum,String bedType,char smoking,double rate ){
		if (numOfRooms < 10) {
			Room newRoom = new Room(roomNum,bedType, smoking, rate);
            theRooms.add(newRoom);
    		numOfRooms++;	
		}
	}
	public void addReservation(String name, char smoking, String bedType) {
		if (isFull()) {
			System.out.println("No more rooms The Hotel is Full");
		}
		else {
			for (byte i = 0; i < theRooms.size(); i++) {
				Room room = theRooms.get(i);
				
			    if(room.getSmoking() == smoking && room.getBedType().equals(bedType) && room.getOccupant() == null) {
			       room.setOccupant(name); 
			       room.setOccupied(true);
			       occupiedCnt++;
			       break;
			    }
			}		
		}
	}
	public void cancelReservation(String occupantName) {
		for (byte i = 0; i < numOfRooms; i++) {
			Room room = theRooms.get(i);
		    if(room.getOccupant() == occupantName) {
		        room.setOccupant(null);
		    	room.setOccupied(false);
		    	occupiedCnt--;    
				System.out.println(room);
		    }	
		}	
	}
	public void findReservation(String occupantName) {
		int i;
		for (i = 0; i < numOfRooms; i++) {
			Room room = theRooms.get(i);
		    if(room.getOccupant() == occupantName) {
			    System.out.println("The reservation is at index: " + i + "\n");
			    break;
		    }
		    
		 }  
		if (i == numOfRooms) {
	    	System.out.println("RESERVATION NOT FOUND");
	    }

	}
	public void printReservationList() {
		for (byte i = 0; i < numOfRooms; i++) {
			Room room = theRooms.get(i);
		     if (room.getOccupant() != null)
		    	 System.out.println(room);
		}  	
	}
	public double getDailySales() {
		double totalRate = 0.0;
		for (byte i = 0; i < numOfRooms; i++) {
			 Room room = theRooms.get(i);
		     if (room.isOccupied() == true)
		    	 totalRate += room.getRate(); 
		}  	
		return totalRate;
	}
	public double occupancyPercentage() {
		return (double)occupiedCnt/numOfRooms;
	}
	public String toString() {
		
		return "Hotel Name: " + name + "\n" + 
		       "Number of Rooms: " + numOfRooms + "\n" +
		       "Number of occupied room: " + occupiedCnt + "\n" +
		       "\n" +
		       "Room details are: "  + "\n\n"; 
		       	
	}
	

}
