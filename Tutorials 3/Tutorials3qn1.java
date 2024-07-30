/*
 TUTORIALS 3
 MODULE - 2 
 CONTROL STATEMENTS
 QN 1) 
Write a Java program to print the factorial of a given number using a while loop.

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package Tutorials3;
import java.util.Scanner;
public class Tutorials3qn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int fact = 1;
		int i = 1;
		
		while(i <= num)
		{
			fact *= i;
			i++;
		}
		System.out.println("The factorial of " + num + " is " + fact);
		
		sc.close();

	}

}
