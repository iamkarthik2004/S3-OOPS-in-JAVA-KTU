/*
TUTORIALS 4
MODULE - 2
ARRAYS IN JAVA

 QN 5) 
Create a program that performs matrix addition for two-dimensional arrays.

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package Tutorials4;

import java.util.Scanner;

public class Tutorials4qn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

    
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

    
        System.out.println("Enter the elements of matrix 1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

    
        System.out.println("Enter the elements of matrix 2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

    
        int[][] sumMatrix = new int[rows][cols];

    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

    
        System.out.println("Sum Matrix After Addition: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
