class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Add days from completed prior months
        int totalDays = day;
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonths[m];
        }

        // Add 1 extra day if leap year and past February
        if (month > 2 && isLeapYear(year)) {
            totalDays += 1;
        }

        return totalDays;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
    

output: Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41