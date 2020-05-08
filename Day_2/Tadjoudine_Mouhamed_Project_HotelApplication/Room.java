package com.Day_2;

public class Room {
	private int roomNum;
	private String bedType;
	private double rate;
	private String occupantName;
	private char smoking;
	private boolean occupied = false;
	
	
    public Room(){
    	this.roomNum = 0;
    }
    public Room(int roomNum, String bedType, char smoking, double rate) {
    	this.roomNum = roomNum;
    	this.bedType = bedType;
    	this.smoking = smoking;
    	this.rate = rate;    	
    }
    public String getBedType() {
    	return bedType;
    }
    public char getSmoking() {
    	return smoking;
    }
    public int getRoomNum() {
    	return roomNum;
    }
    public double getRate() {
    	return rate;
    }
    public String getOccupant() {
    	return occupantName;
    }
    public void setOccupied(boolean occupied) {
    	this.occupied = occupied;
    }
    public void setOccupant(String occupantName) {
    	this.occupantName = occupantName;
    }
    public void setRoomNum(int roomNum) {
    	this.roomNum = roomNum;
    }
    public void setBedType(String bedType) {
    	this.bedType = bedType;
    }
    public void setRate(double rate) {
    	this.rate = rate;
    }
    public void setSmoking(char smoking) {
    	this.smoking = smoking;
    }
    public boolean isOccupied() {
    	return occupied;
    }
    public String toString() {
    	return  "Room Number: " + roomNum + "\n" +
    			"Occupant name: " + occupantName + "\n"+
    			"Smoking room: " + smoking + "\n" +
    			"Bed Type: " + bedType + "\n" +
    			"Rate: " + rate +
    			"\n\n";
    }
    
    
}
