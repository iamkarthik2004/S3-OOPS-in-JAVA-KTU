/*EXPERIMENT 2
01 - 08 - 2024
FRIDAY

KARTHIK KRISHNAN
S3 CSE B
ROLL: 45
*/
package oopj24csb45;
import java.util.Scanner;
public class FrequencyCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		
		int i,freq=0;
		for(i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
			{
				freq++;
			}
			
		}
		System.out.println("No. of occurence: " + freq + " times");
		
	

	}
	

}




