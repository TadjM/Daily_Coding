package com.Day_3;
class NonIntResultException extends Exception{
	
	public NonIntResultException(String Message) {
		super(Message);
	}
}

class IntegerArrayMath{

     int[] number = {4,8,15};
     int[] denom  = {2,0,4};
     
     //constructor to initialize the above two arrays
     //NonIntResultException class code goes here
     public void integerDivision() throws NonIntResultException
     {
      for (byte i = 0; i < number.length; i++) {
    	  
    	  if( number[i]%2 != 0 || denom[i]%2 != 0) {
    		  throw new NonIntResultException("The result is not a integer");
    	  }
    	  
    	  int result = number[i]/denom[i];
    	  System.out.println(number[i] + "/" + denom[i] + " is " + result);
		
    		  
      }
    }
}


public class Exceptions {

	public static void main(String[] args) throws NonIntResultException {
		// TODO Auto-generated method stub
		IntegerArrayMath division = new IntegerArrayMath();
		int flag = 1;
	  	
		try {
			division.integerDivision();
		}
		catch(NonIntResultException e) {
			
			System.out.println(e.getMessage());
			
		}
        catch(ArithmeticException ae) {
			
			System.out.println("Division by zero not allowed");
			
		}
	
	}

}
