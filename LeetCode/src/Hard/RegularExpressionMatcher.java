// RegularExpressionMatcher.java
// This class provides a method to check if a given string matches a specified regular expression pattern.
// It implements a simple recursive approach to solve the problem.

public class RegularExpressionMatcher {

    // Method to check if the input string matches the pattern
    public boolean isMatch(String s, String p) {
        // Base case: if the pattern is empty, the string must also be empty
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        // Check if the first character matches or if the pattern has a '.' wildcard
        boolean firstMatch = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        // Handle the '*' character in the pattern
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Two possibilities:
            // 1. We ignore the '*' and the preceding character
            // 2. We use the '*' to match one or more of the preceding character
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            // Move to the next character in both the string and the pattern
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    // Main method to test the RegularExpressionMatcher
    public static void main(String[] args) {
        RegularExpressionMatcher matcher = new RegularExpressionMatcher();

        // Test cases
        String testString1 = "aab";
        String pattern1 = "c*a*b";
        System.out.println(testString1 + " matches " + pattern1 + ": " + matcher.isMatch(testString1, pattern1)); // true

        String testString2 = "mississippi";
        String pattern2 = "mis*is*p*.";
        System.out.println(testString2 + " matches " + pattern2 + ": " + matcher.isMatch(testString2, pattern2)); // false

        String testString3 = "ab";
        String pattern3 = ".*";
        System.out.println(testString3 + " matches " + pattern3 + ": " + matcher.isMatch(testString3, pattern3)); // true
    }
}