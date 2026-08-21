import java.util.*;

public class Solution {

    public static void matrixRotation(int[][] matrix, int r) {
        int m = matrix.length;
        int n = matrix[0].length;
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> elements = new ArrayList<Integer>();

            // Extract layer
            for (int j = layer; j < n - layer; j++) elements.add(matrix[layer][j]); // top row
            for (int i = layer + 1; i < m - layer - 1; i++) elements.add(matrix[i][n - layer - 1]); // right col
            for (int j = n - layer - 1; j >= layer; j--) elements.add(matrix[m - layer - 1][j]); // bottom row
            for (int i = m - layer - 2; i > layer; i--) elements.add(matrix[i][layer]); // left col

            int len = elements.size();
            int rot = r % len;

            // Rotate
            List<Integer> rotated = new ArrayList<Integer>();
            rotated.addAll(elements.subList(rot, len));
            rotated.addAll(elements.subList(0, rot));

            // Put back
            int idx = 0;
            for (int j = layer; j < n - layer; j++) matrix[layer][j] = rotated.get(idx++);
            for (int i = layer + 1; i < m - layer - 1; i++) matrix[i][n - layer - 1] = rotated.get(idx++);
            for (int j = n - layer - 1; j >= layer; j--) matrix[m - layer - 1][j] = rotated.get(idx++);
            for (int i = m - layer - 2; i > layer; i--) matrix[i][layer] = rotated.get(idx++);
        }

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        matrixRotation(matrix, r);
        sc.close();
    }
}
