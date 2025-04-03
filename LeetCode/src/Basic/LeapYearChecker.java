public class LeapYearChecker {
    public static void main(String[] args) {
        // Test the isLeapYear method with different years
        int year1 = 2020; // Leap year
        int year2 = 2021; // Not a leap year
        int year3 = 1900; // Not a leap year (divisible by 100 but not by 400)
        int year4 = 2000; // Leap year (divisible by 400)

        System.out.println(year1 + " is a leap year: " + isLeapYear(year1));
        System.out.println(year2 + " is a leap year: " + isLeapYear(year2));
        System.out.println(year3 + " is a leap year: " + isLeapYear(year3));
        System.out.println(year4 + " is a leap year: " + isLeapYear(year4));
    }

    /**
     * This method checks if a given year is a leap year.
     * A year is a leap year if:
     * - It is divisible by 4
     * - It is not divisible by 100, unless it is also divisible by 400
     *
     * @param year the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Divisible by 400
            }
            return true; // Divisible by 4 but not by 100
        }
        return false; // Not divisible by 4
    }
}