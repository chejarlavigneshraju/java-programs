import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}

output:
7