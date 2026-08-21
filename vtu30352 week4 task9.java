import java.util.*;

public class Solution {
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] prefix = new int[m + 1][n + 1]; // extra row & col for easier indexing

        // Build prefix sum matrix
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i - 1][j - 1] 
                              + prefix[i - 1][j] 
                              + prefix[i][j - 1] 
                              - prefix[i - 1][j - 1];
            }
        }

        int[][] answer = new int[m][n];

        // Compute block sums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);

                // Convert to prefix indices (+1 offset)
                r1++; c1++; r2++; c2++;

                answer[i][j] = prefix[r2][c2] 
                             - prefix[r1 - 1][c2] 
                             - prefix[r2][c1 - 1] 
                             + prefix[r1 - 1][c1 - 1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[][] result = matrixBlockSum(mat, k);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
