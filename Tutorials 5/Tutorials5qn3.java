/*
 TUTORIALS 5
 MATRIX IN JAVA
 QN 3) 
 Write a java program to generate an identity matrix of a given size.
 
 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */
package tutorials;
import java.util.Scanner;

public class Tutorials5qn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the identity matrix (n for an nxn matrix): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("The identity matrix is: ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t"); 
            }
            System.out.println();
        }

        scanner.close();
    }
}
