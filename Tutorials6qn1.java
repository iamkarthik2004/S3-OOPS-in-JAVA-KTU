/*
TUTORIALS 6
MODULE - 2
STRING IN JAVA

QN 1) 
Write a Java program that remove a given character from String

Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials6;
import java.util.Scanner;
public class Tutorials6qn1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Ente the character: ");
		char ch = sc.next().charAt(0);
		
		String removedStr = str.replace(Character.toString(ch), "");
		System.out.println("Removed String: " + removedStr);
		sc.close();
			
	}
}



