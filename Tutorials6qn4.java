/*
TUTORIALS 6
MODULE - 2
STRING IN JAVA

QN 4) 
Write a Java program which accepts a string from the user and display the 
reverse of it

Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials6;
import java.util.Scanner;
public class Tutorials6qn4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		String rev = new String();
		for (int i = str.length()-1; i>=0; i--)
		{
			rev += str.charAt(i);
		}
		
		System.out.println("Reversed String is: " + rev);
		sc.close();	
	}
}


