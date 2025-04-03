public class DecodeWays {
    // This method takes a string s representing encoded messages and returns the number of ways to decode it.
    public int numDecodings(String s) {
        // If the string is empty or starts with '0', there are no ways to decode it.
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        // dp[i] will hold the number of ways to decode the substring s[0..i-1]
        int[] dp = new int[s.length() + 1];
        dp[0] = 1; // Base case: an empty string has one way to decode (doing nothing)
        dp[1] = 1; // Base case: a non-empty string that doesn't start with '0' has one way to decode

        for (int i = 2; i <= s.length(); i++) {
            // Check the last single digit
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            // Check the last two digits
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()]; // The last element contains the total ways to decode the entire string
    }

    public static void main(String[] args) {
        DecodeWays decoder = new DecodeWays();
        
        // Example input
        String input = "226";
        int result = decoder.numDecodings(input);
        
        // Output the result
        System.out.println("Number of ways to decode \"" + input + "\": " + result);
        // Expected output: Number of ways to decode "226": 3
    }
}