/*
 TUTORIALS 5
 MATRIX IN JAVA
 QN 2) 
 Write a java program to multiply each element of a matrix by a scalar value 
.also display the resultant matrix after multiplication.

 Karthik Krishnan
 S3 CSE B
 Roll: 45
 */

package tutorials;
import java.util.Scanner;
public class Tutorials5qn2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cols, rows;
        System.out.println("Enter the number of rows of the matrix: ");
        rows = sc.nextInt();

        System.out.println("Enter the number of columns of the matrix: ");
        cols = sc.nextInt();
        
        //User to enter the elements
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        //Display the matrix
        System.out.println("The Matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        //User to enter the scalar value
        System.out.println("Enter the scalar value to multiply with the matrix: ");
        int scalar = sc.nextInt();
        
        //Display the scalar matrix after scalar multiplication
        System.out.println("The resulting matrix after scalar multiplication is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] * scalar + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
