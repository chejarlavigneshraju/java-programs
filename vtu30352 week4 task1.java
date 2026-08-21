import java.util.*;

public class Solution {

    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2);

        return countVowels(a) == countVowels(b);
    }

    private static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean result = halvesAreAlike(s);
        System.out.println(result);

        sc.close();
    }
}
import java.util.*;

public class Solution {

    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2);

        return countVowels(a) == countVowels(b);
    }

    private static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean result = halvesAreAlike(s);
        System.out.println(result);

        sc.close();
    }
}
