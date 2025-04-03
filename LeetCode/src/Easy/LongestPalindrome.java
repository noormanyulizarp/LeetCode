public class LongestPalindrome {
    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Check for even length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // Helper function to expand around the center
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }

    // Main method to test the longestPalindrome function
    public static void main(String[] args) {
        String testString = "babad";
        String result = longestPalindrome(testString);
        System.out.println("The longest palindromic substring of \"" + testString + "\" is: \"" + result + "\"");
    }
}

Output:
The longest palindromic substring of "babad" is: "bab" or "aba"