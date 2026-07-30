public class Maximum {
    public static void main(String[] args) {
        int[] a = {10, 25, 5, 40, 15};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        System.out.println("Maximum element = " + max);
    }
}

output:
Maximum element = 40