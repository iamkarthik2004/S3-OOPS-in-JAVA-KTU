/*
TUTORIALS 6
MODULE - 2
STRING IN JAVA

QN 5) 
Write a program to count the total no. of chars, words, lines, alphabets, 
digits,white spaces in a given string

Karthik Krishnan
S3 CSE B
Roll: 45
*/

package Tutorials6;

import java.util.Scanner;

public class Tutorials6qn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.nextLine();
		
		int alphabets=0;
		int line=1;
		int digits=0;
		int space=0;
		int word=0;
		int i;
		
		str.toLowerCase();
		int length = str.length();
		
		for(i=0; i<length; i++)
		{
			if(str.charAt(i)>= 'a' && str.charAt(i)<='z')
			{
				alphabets++;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				digits++;
			}
			else if(str.charAt(i)==' ')
			{
				space++;
				word++;
			}
			else if(str.charAt(i)=='\n')
			{
				line++;
			}
		}
		System.out.println("Alphabets: "+alphabets);
		System.out.println("Digits: "+digits);
		System.out.println("White Space: "+space);
		System.out.println("Line: "+line);
		System.out.println("Characters: "+length);
		System.out.println("Words: "+word);
		
		

	}

}
