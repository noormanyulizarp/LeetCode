public class LongestRepeatingCharacterReplacement {
    /**
     * This method finds the length of the longest substring that can be obtained
     * by replacing at most 'k' characters in the given string 's'.
     *
     * @param s the input string
     * @param k the maximum number of characters that can be replaced
     * @return the length of the longest substring after replacements
     */
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // Array to count occurrences of each character
        int maxCount = 0; // Maximum count of a single character in the current window
        int left = 0; // Left pointer for the sliding window
        int maxLength = 0; // Maximum length of substring found

        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']); // Update count for current character

            // If the current window size minus the count of the most frequent character
            // is greater than k, shrink the window from the left
            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--; // Decrease count of the leftmost character
                left++; // Move the left pointer to the right
            }

            // Update the maximum length of the substring found
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength; // Return the maximum length found
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        
        // Example test cases
        String s1 = "AABABBA";
        int k1 = 1;
        System.out.println("Input: " + s1 + ", k = " + k1);
        System.out.println("Output: " + solution.characterReplacement(s1, k1)); // Expected output: 4

        String s2 = "ABAB";
        int k2 = 2;
        System.out.println("Input: " + s2 + ", k = " + k2);
        System.out.println("Output: " + solution.characterReplacement(s2, k2)); // Expected output: 4

        String s3 = "AABABBA";
        int k3 = 0;
        System.out.println("Input: " + s3 + ", k = " + k3);
        System.out.println("Output: " + solution.characterReplacement(s3, k3)); // Expected output: 2
    }
}