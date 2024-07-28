/*
 TUTORIALS 5
 MATRIX IN JAVA
 QN 1) 
 Write a Java Program that finds the maximum element in each row of a given 3D Matrix and 
 returns the results in a separate array.
 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */


package tutorials;
import java.util.Scanner;

public class Tutorials5qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;

        System.out.println("Enter the number of rows in the matrix: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Maximum elements in each row: ");
        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + ": " + max);
        }
    }
}

