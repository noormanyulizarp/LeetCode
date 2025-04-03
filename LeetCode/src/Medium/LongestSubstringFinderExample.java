public class LongestSubstringFinderExample {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + length);
    }

    /**
     * This method finds the length of the longest substring without repeating characters.
     * 
     * @param s The input string to be analyzed.
     * @return The length of the longest substring without repeating characters.
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        int[] indexMap = new int[128]; // Assuming ASCII characters

        for (int right = 0; right < n; right++) {
            // Update the left pointer to avoid duplicates
            left = Math.max(left, indexMap[s.charAt(right)]);
            // Update the last seen index of the character
            indexMap[s.charAt(right)] = right + 1; // Store the next index

            // Calculate the max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
} 

// Example Output:
// The length of the longest substring without repeating characters in "abcabcbb" is: 3
// Explanation: The longest substring is "abc", which has a length of 3.