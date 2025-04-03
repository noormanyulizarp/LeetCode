// LongestSubstringHardFinder.java
// This class provides a solution to find the length of the longest substring 
// without repeating characters in a given string.

import java.util.HashMap;

public class LongestSubstringHardFinder {
    
    // Method to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start index of the current substring

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the character is already in the map, move the start index
            // to the right of the last occurrence of the character
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            
            // Update the last seen index of the character
            charIndexMap.put(currentChar, i);
            
            // Calculate the maximum length of substring found so far
            maxLength = Math.max(maxLength, i - start + 1);
        }
        
        return maxLength;
    }

    // Main method to test the lengthOfLongestSubstring method
    public static void main(String[] args) {
        String testString = "abcabcbb";
        int result = lengthOfLongestSubstring(testString);
        
        // Output the result
        System.out.println("The length of the longest substring without repeating characters in \"" 
                           + testString + "\" is: " + result);
    }
}

// Example Output:
// The length of the longest substring without repeating characters in "abcabcbb" is: 3
// Explanation: The answer is "abc", with the length of 3.