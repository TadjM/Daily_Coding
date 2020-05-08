package com.evaluation;

public class CracklePop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 != 0) 
				System.out.println("Crackle");
			else if (i % 5 == 0 && i % 3 != 0)
				System.out.println("Pop");
			else if (i % 5 == 0 && i % 3 == 0)
				System.out.println("CracklePop");
			else
				System.out.println(i);
			
		}

	}

}
