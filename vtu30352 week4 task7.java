import java.util.*;

public class Solution {

    public static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonal += arr[i][i];           // top-left to bottom-right
            secondaryDiagonal += arr[i][n - i - 1]; // top-right to bottom-left
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // Read matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = diagonalDifference(arr);
        System.out.println(result);

        sc.close();
    }
}
