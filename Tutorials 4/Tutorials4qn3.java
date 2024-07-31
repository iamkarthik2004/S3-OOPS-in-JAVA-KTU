/*
TUTORIALS 4
MODULE - 2
ARRAYS IN JAVA

 QN 3) Write a java program to calculate the sum of both diagonals of a square matrix.


 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package Tutorials4;

import java.util.Scanner;

public class Tutorials4qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.print("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum_diagonal = 0;
        for (int i = 0; i < n; i++) {
            sum_diagonal += matrix[i][i] + matrix[i][n - i - 1];
        }


        System.out.println("Sum of both diagonal Elements: " + sum_diagonal);
    }
}


