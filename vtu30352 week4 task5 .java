import java.util.*;

public class Solution {

    public static String timeConversion(String s) {
        // Extract hour, minutes, seconds, and AM/PM part
        String ampm = s.substring(8, 10); // AM or PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String minutesSeconds = s.substring(2, 8); // :MM:SS

        if (ampm.equals("AM")) {
            if (hour == 12) {
                hour = 0; // midnight case
            }
        } else { // PM case
            if (hour != 12) {
                hour += 12; // convert to 24-hour format
            }
        }

        // Format hour with leading zero if needed
        String hourFormatted = String.format("%02d", hour);

        return hourFormatted + minutesSeconds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // input in hh:mm:ssAM/PM format
        String result = timeConversion(s);
        System.out.println(result);
        sc.close();
    }
}
