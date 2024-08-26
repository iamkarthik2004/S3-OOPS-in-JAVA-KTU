/*
EXPERIMENT 3
write  a java program to multiply any two given matrices. Also check the condition for Invalid Matrix 

Karthik Krishnan
CSE B
Roll: 45
*/

package oopj24csb45;

import java.util.Scanner;

public class Matrixmultiplication 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. of rows and columns of Matrix A: ");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		
		System.out.println("Enter the no. of rows and columns of Matrix B: ");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		if(c1!=r2)
		{
			System.out.println("Multiplication is not possible");
			return;
		}
				
		int[][] MatrixA = new int[r1][c1];
		int[][] MatrixB = new int[r2][c2];
		int[][] MatrixC = new int[r1][c2];
		
		//User to Enter Matrix A Elements
		System.out.println("Enter the elements of Matrix A:");
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				MatrixA[i][j]=sc.nextInt();
			}
		}
		
		//User to Enter Matrix B Elements
		System.out.println("Enter the elements of Matrix B:");
		for(int i=0; i<r2; i++)
		{
			for(int j=0; j<c2; j++)
			{
				MatrixB[i][j]=sc.nextInt();
			}
		}
		
		//Displaying Matrix A Elements
		System.out.println("elements of Matrix A:");
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				System.out.println(MatrixA[i][j]);
			}
		}
		
		//Displaying Matrix B Elements
		System.out.println("elements of Matrix B:");
		for(int i=0; i<r2; i++)
		{
			for(int j=0; j<c2; j++)
			{
				System.out.println(MatrixB[i][j]);
			}
		}
		
		//Multiplication
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c2; j++)
			{
				MatrixC [i][j]=0;
				
				for(int k=0; k<c1; k++)
				{
					MatrixC [i][j]+=MatrixA[i][k] * MatrixB[k][j];
				}
				
			}
		}
			
			
			
		//Displaying Product of Mat A & B
		System.out.println("Product of Matrix A & B: ");
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c2; j++)
			{
				System.out.print(MatrixC[i][j] + "\t");
			}
			System.out.print('\n');
		}



	}

}
