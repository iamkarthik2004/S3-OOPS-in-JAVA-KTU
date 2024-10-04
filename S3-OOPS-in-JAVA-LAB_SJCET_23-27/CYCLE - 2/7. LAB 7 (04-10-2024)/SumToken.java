/*
 EXPERIMENT - 11
 Use String Tokenizer
 */

package oopj24csb45;
import java.util.*;
public class SumToken {
public static void main(String args[]) {
	int n;
	int sum = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter integers with one space gap:");
	String s = sc.nextLine();
	StringTokenizer st = new StringTokenizer(s, " ");
	while (st.hasMoreTokens())
	{
		String temp = st.nextToken();
		//add the value with sum ,display the number
		sum += Integer.parseInt(temp);
		
		
		//please complete the 2 line code today itself
	}
	System.out.println("sum of the integers is: " + sum);
	
	sc.close();
	
	}

}
