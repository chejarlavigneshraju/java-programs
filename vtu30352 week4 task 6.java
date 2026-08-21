import java.util.*;

public class Solution {

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;       // number of rows
        int n = matrix[0].length;    // number of columns

        int[][] result = new int[n][m]; // transpose has n rows and m columns

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        // Read matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] transposed = transpose(matrix);

        // Print transposed matrix
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
