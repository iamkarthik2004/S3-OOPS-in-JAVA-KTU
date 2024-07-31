/*
TUTORIALS 4
MODULE - 2
ARRAYS IN JAVA

QN 1) 
Write a Java program to calculate the sum of all elements in an integer array.

Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials4;

import java.util.Scanner;

public class Tutorials4qn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int i,n,sum=0;
				System.out.println("Enter a number of elements: ");
				n = sc.nextInt();
				System.out.println("Enter the elements: ");
				
				int a[] = new int[n];
				for(i=0; i<n; i++)
				{
				    a[i] = sc.nextInt();
				    sum += a[i];
				}
			    System.out.println("The sum of the number is " + sum);
	}

}
