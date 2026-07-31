import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if (deque.size() == m) {
                if (map.size() > max) {
                    max = map.size();
                }

                int first = deque.removeFirst();
                map.put(first, map.get(first) - 1);

                if (map.get(first) == 0) {
                    map.remove(first);
                }
            }
        }

        System.out.println(max);
    }
}

output: 
input (stdin)
6 3
5 3 5 2 3 2
Your Output (stdout)
3
Expected Output
3