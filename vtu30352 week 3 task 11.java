class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFrom1971(date1) - daysFrom1971(date2));
    }

    private int daysFrom1971(String dateStr) {
        String[] parts = dateStr.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        // 1. Add days for all preceding years
        for (int y = 1971; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        // 2. Add days for preceding months in current year
        for (int m = 1; m < month; m++) {
            if (m == 2 && isLeapYear(year)) {
                totalDays += 29;
            } else {
                totalDays += daysInMonths[m];
            }
        }

        // 3. Add remaining days
        totalDays += day;

        return totalDays;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

output:

Example 1:

Input: date1 = "2019-06-29", date2 = "2019-06-30"
Output: 1
Example 2:

Input: date1 = "2020-01-15", date2 = "2019-12-31"
Output: 15