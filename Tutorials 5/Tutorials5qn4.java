/*
 TUTORIALS 5
 MATRIX IN JAVA
 QN 4)  
 Write a java program to check if a given matrix is symmetric in Java?
 
 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */
package tutorials;

import java.util.Scanner;

public class Tutorials5qn4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n for n×n matrix): ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the matrix:");

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        boolean Symmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    Symmetric = false;
                    break;
                }
            }
        }

        System.out.println(Symmetric ? "The matrix is symmetric." : "The matrix is not symmetric.");
        sc.close();
    }
}

