public class LongestPalindromicSubstring {
    
    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0; // Pointers to track the start and end of the longest palindrome found
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);
            // Get the maximum length from both cases
            int len = Math.max(len1, len2);
            if (len > end - start) {
                // Update the start and end pointers
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        // Return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    // Helper function to expand around the center and find the length of the palindrome
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome
        return right - left - 1;
    }

    // Main method to test the function
    public static void main(String[] args) {
        String testString = "babad";
        String result = longestPalindrome(testString);
        System.out.println("The longest palindromic substring of \"" + testString + "\" is: \"" + result + "\"");
    }
}

/*
Example Output:
The longest palindromic substring of "babad" is: "bab" or "aba"
*/