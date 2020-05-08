package com.Day_1;

import java.util.*;
public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = sc.nextDouble();

		System.out.print("Enter hourly pay rate: ");
		double rate = sc.nextDouble();

		System.out.print("Enter federal tax withholding rate: ");
		double taxRate = sc.nextDouble();

		System.out.print("Enter state tax withholding rate: ");
		double stateTax = sc.nextDouble();

		System.out.println();

		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + rate * hours);
		
		double fedTax = ((rate * hours) * taxRate)/100;
		double state =  ((rate * hours) * stateTax)/100;
		double netPay = (rate * hours) - (fedTax + state);
		System.out.println("Deductions: ");
		System.out.println("Federal Withholding " + "(" + taxRate + "%): $" + fedTax);
		System.out.println("State Withholding " + "(" + stateTax + "%): $" + state);
		System.out.println("Total Deduction: $ " + (fedTax + state));
		System.out.println("Net Pay: " + netPay);
	}

}
