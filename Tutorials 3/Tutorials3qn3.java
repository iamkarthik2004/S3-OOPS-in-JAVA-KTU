/*
 TUTORIALS 3
 MODULE - 2
 CONTROL STATEMENTS
 QN 3) 
Write a Java program to print the reverse of a given number using a for loop.

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */



package Tutorials3;
import java.util.Scanner;
public class Tutorials3qn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int rev = 0;
		
		for(int n = num; n != 0; n/=10)
		{
			int digit = n %10;
			rev = rev * 10 + digit;
		}
		
		System.out.println("The reverse of " + num + " is " + rev);
		
		sc.close();
	}

}
