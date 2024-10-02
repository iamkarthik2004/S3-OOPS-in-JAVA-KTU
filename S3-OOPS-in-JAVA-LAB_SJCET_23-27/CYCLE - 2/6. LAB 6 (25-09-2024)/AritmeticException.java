/*25-09-2024
WEDNESDAY
EXPERIMENT - 9
*/
package oopj24csb45;
import java.util.Scanner;

public class AritmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch;
		do 
		{
			
			System.out.println("1. ArithmeticException");
			System.out.println("2. ArrayIndexOutofBoundsException");
			System.out.println("Ente Your Choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1:
				//CASE 1
			    System.out.println("Enter Number -1");
			    int n1 = sc.nextInt();
			    System.out.println("Enter Number -2:");
			    int n2 = sc.nextInt();
			
			    try
			    {
				    int Result = n1/n2;
				    System.out.println("Result = " + Result);
				    System.out.println("End of Try Block");
			    }
			    catch (ArithmeticException e)
			    {
			        System.out.println(e);
			    }
			    finally
			    {
				    System.out.println("Finally block content");
				    System.out.println("My Code is Safe from Exception");
			    }
			    break;
			    
			//CASE 2
			case 2:
				System.out.print("Enter the number of elements you want to store: ");
			    int n = sc.nextInt();
		        int A[] = new int[n];
		        System.out.println("Enter the elements of the array:");
		        for(int i=0; i<n; i++)
		        {
		    	    A[i] = sc.nextInt();
		        }
		        System.out.print("Array Length: ");
		        System.out.println(A.length);
		        System.out.println("Array Elements are: ");
		    
		        for(int i=0; i<n; i++)
		        {
		    	    System.out.println(A[i]);
		        }
		        System.out.println("Enter the position of element you want to be accesseed: ");
		        int pos = sc.nextInt();
		        try
		        {
		    	    System.out.println(A[pos]);
		    	}
		        catch(ArrayIndexOutOfBoundsException e)
		        {
		    	    System.out.println("Array Index is Out of Bound");
		        }
		        break;
		        default:
		        	System.out.println("Enter your choice: ");
		        	break;
		        	
			}
			
			System.out.println("\nDo you Want to continue?");
			ch=sc.next().charAt(0);
		}
		
		while(ch=='y');
		System.out.println("EXITING......");
}
	
}


