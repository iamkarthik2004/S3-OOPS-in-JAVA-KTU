/*
TUTORIALS 4
MODULE - 2
ARRAYS IN JAVA

 QN 2) 
Write a Java program that finds the maximum and minimum values in an array of 
integers.

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package Tutorials4;
import java.util.Scanner;
public class Tutorials4qn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.println("Enter a number of elements: ");
		n = sc.nextInt();
		System.out.println("Enter the elements: ");
		
		int a[] = new int[n];
		for(i=0; i<n; i++)
		{
		    a[i] = sc.nextInt();
		}
		int max = a[0],min = a[0];
		for(int num :a)
		{
		    if(num>max)
		    {
		        max=num;
		    }
		    else
		    {
		        min=num;
		    }
		}
	    System.out.println("The maximum value in the array is: " +max);
	    System.out.println("The minimum value in the array is: " +min);

	}

}
