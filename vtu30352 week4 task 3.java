import java.util.*;

public class Solution {

    static int[] compareTriplets(int[] a, int[] b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aliceScore++;
            } else if (a[i] < b[i]) {
                bobScore++;
            }
            // if equal, no points awarded
        }

        return new int[]{aliceScore, bobScore};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        // Read Alice's ratings
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        // Read Bob's ratings
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        int[] result = compareTriplets(a, b);

        // Print Alice's score first, then Bob's
        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}
