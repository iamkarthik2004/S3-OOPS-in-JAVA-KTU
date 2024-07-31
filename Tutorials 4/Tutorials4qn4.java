/*
TUTORIALS 4
MODULE - 2
ARRAYS IN JAVA

 QN 4) 
Write a java program to search for a specific element in a two-dimensional array and 
return its position.

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package Tutorials4;
import java.util.Scanner;
public class Tutorials4qn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int i,n,j,rows,cols,found=0;
        
        System.out.print("Enter the size of the rows: ");
        rows=sc.nextInt();
        System.out.print("Enter the size of the columns: ");
        cols=sc.nextInt();
        
        System.out.println("Enter the Elements: ");
        int [][] arr = new int[rows][cols];
        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter the element to search: ");
        n = sc.nextInt();
        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
            {
                if(arr[i][j]==n)
                {
                    System.out.println("The number "+n+" is found at " + i + "," + j);
                    found = 1;
                }
            }
        }
        if(found==0)
        {
            System.out.println("The number "+n+" is not found");
        }

	}

}

