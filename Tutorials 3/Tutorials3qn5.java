/*
 TUTORIALS 3
 MODULE - 2
 CONTROL STATEMENTS
 QN 5) 
Write a Java program to print all prime numbers between 1 and 100 using a for 
loop and if-else statements

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package Tutorials3;
public class Tutorials3qn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers between 1 and 100: ");
		for(int num = 2; num <= 100; num++)

		{
			int divisor = 2;
			int Prime = 1;
			
			while (divisor <= Math.sqrt(num)) 
			{
				if (num % divisor == 0)
				{
					Prime = 0;
					break;
				}
				divisor++;
			}
			if (Prime==1)
			{
				System.out.print(num + " ");
			}
		}
	}

}
