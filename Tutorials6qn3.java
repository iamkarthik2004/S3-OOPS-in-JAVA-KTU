/*
TUTORIALS 6
MODULE - 2
STRING IN JAVA

QN 3) 
Write a Java program to read a given string and return the string without 
the first or last characters if they are the same, otherwise return the string 
without the characters

Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials6;
import java.util.Scanner;
public class Tutorials6qn3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the string:");
        
        String str = sc.nextLine();
        String subStr = str.substring(0, 2);
        
        
        if((str.endsWith(subStr)))
        {
        	System.out.println(str + " ends with " + subStr);
        }
        else
        {
        	System.out.println(str + " does not ends with " + subStr);
        }
        
        sc.close();
    }
}
