/*
TUTORIALS 4
MODULE - 2
ARRAYS IN JAVA

 QN 6) 
Write a java program to compute the transpose of a given matrix

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package Tutorials4;
import java.util.Scanner;

public class Tutorials4qn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, rows, cols;

        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        cols = sc.nextInt();

        System.out.println("Enter the elements of Matrix: ");
        int[][] a = new int[rows][cols];
        int[][] b = new int[cols][rows]; 

        for (i = 0; i < rows; i++) 
        {
            for (j = 0; j < cols; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of matrix: ");
        for (i = 0; i < cols; i++) 
        {
            for (j = 0; j < rows; j++) 
            {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");  
            }
            System.out.println();  
        }
    }
}