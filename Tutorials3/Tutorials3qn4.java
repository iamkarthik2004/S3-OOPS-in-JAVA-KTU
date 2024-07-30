/*
 TUTORIALS 3
 MODULE - 2
 CONTROL STATEMENTS
 QN 4) 
Write a Java program to check if a given year is a leap year or not using if-else 
statements.

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */


package Tutorials3;

import java.util.Scanner;

public class Tutorials3qn4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println(year + " is a leap year.");
		}
		else
		{
			System.out.println(year + " is not a leap year.");
		}
		
		sc.close();
		

	}

}

