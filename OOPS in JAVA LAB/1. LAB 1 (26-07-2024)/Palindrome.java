/*
EXPERIMENT 1
String Palindrome or Not
Karthik Krishnan
CSE B
Roll: 45
*/

package oopj24csb45;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		int len=str.length();
		String rev = "";
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
	

}
