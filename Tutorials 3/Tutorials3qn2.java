/*
 TUTORIALS 3
 MODULE - 2
 CONTROL STATEMENTS
 QN 2) 
Write a Java program to print the Fibonacci series up to a given number using a 
while loop.

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package Tutorials3;
import java.util.Scanner;
public class Tutorials3qn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int num = sc.nextInt();
		
		int a = 0; //a - first number
		int b = 1; //b - second number
		
		System.out.print("Fibonacci series: " + a + " " + b);
		
		int temp = a + b;
		
		while (temp <= num)
		{
			System.out.print(" " + temp);
			a = b;
			b = temp;
			temp = a + b;
		}
		
		sc.close();
		
		

	}

}
