 class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDays = 0;
        
        // 1. Add days for past years ( starting from 1971 )
        for (int y = 1971; y < year; y++) {
            totalDays += isLeap(y) ? 366 : 365;
        }
        
        // 2. Add days for past months in current year
        for (int m = 1; m < month; m++) {
            if (m == 2 && isLeap(year)) {
                totalDays += 29;
            } else {
                totalDays += daysInMonths[m];
            }
        }
        
        // 3. Add remaining days in current month
        totalDays += (day - 1);
        
        // Jan 1, 1971 was Friday (index 5)
        return daysOfWeek[(5 + totalDays) % 7];
    }
    
    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

output:

Example 1:

Input: day = 31, month = 8, year = 2019
Output: "Saturday"
Example 2:

Input: day = 18, month = 7, year = 1999
Output: "Sunday"
Example 3:

Input: day = 15, month = 8, year = 1993
Output: "Sunday"