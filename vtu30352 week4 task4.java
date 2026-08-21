import java.util.*;

public class Solution {

    public static boolean containsDuplicate(int[] nums) {
        // Use a HashSet to track seen numbers
        Set<Integer> seen = new HashSet<Integer>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // duplicate found
            }
            seen.add(num);
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array length
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Check for duplicates
        boolean result = containsDuplicate(nums);
        System.out.println(result);

        sc.close();
    }
}
