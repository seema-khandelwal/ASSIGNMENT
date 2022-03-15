package com.te.javabasic.coommon;

import java.util.Scanner;

public class AssignmentOfLeapYear {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scanner.nextInt();
		System.out.println("Enter a month");
		int month = scanner.nextInt();
		
		/*
		 * if((year%400==0)||(year%4==0 && year%100!=0))
		 * System.out.println(year+"is a leap year"); } else {
		 * System.out.println(year+"is a not leap year"); }
		 */
		switch (month) {
		case 1: 
			System.out.println("january");
			break;
		
		case 2:
			if((year%400==0)||(year%4==0 && year%100!=0)){
				System.out.println(year+" is a leap year");
				System.out.println("29 days in February");
			}
			else {
				System.out.println(year+"is a not leap year");
				System.out.println("28 days in february  ");
			}
			break;
		
		case 3: 
			System.out.println("march ");
			break;
		
		case 4: 
			System.out.println("april");
			break;
		
		case 5: 
			System.out.println("may");
			break;
		
		case 6: 
			System.out.println("june");
			break;
		
		case 7: 
			System.out.println("july");
			break;
		
		case 8: 
			System.out.println("august");
			break;
		
		case 9: 
			System.out.println("september");
			break;
		
		case 10: 
			System.out.println("october");
			break;
		
		case 11: 
			System.out.println("november");
			break;
		case 12: 
			System.out.println("december");
			break;
		
		
		default:
        System.out.println("invalid input");
		
		}
		
	}	
}
