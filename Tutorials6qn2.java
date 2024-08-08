/*
TUTORIALS 6
MODULE - 2
STRING IN JAVA

QN 2) 
Write a Java program to check whether the first two characters appear at 
the end of a given string

Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials6;
import java.util.Scanner;
public class Tutorials6qn2
{
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		if(str.charAt(0)==str.charAt(str.length()-1))
		{
			System.out.println("First and Last Character are same");
			System.out.println(str.substring(1, str.length()-1));
		}
		else
		{
			System.out.println(str.substring(1, str.length()-1));
		}
		sc.close();
	
	}
	
}

