// LongestSubstringCalculatorExample.java
// This class demonstrates how to find the length of the longest substring without repeating characters.

import java.util.HashMap;

public class LongestSubstringCalculatorExample {
    
    // Method to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start index of the current substring

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the character is already in the map, move the start index
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            
            // Update the last seen index of the character
            charIndexMap.put(currentChar, i);
            // Calculate the maximum length
            maxLength = Math.max(maxLength, i - start + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        // Example input
        String input = "abcabcbb";
        // Calculate the length of the longest substring without repeating characters
        int result = lengthOfLongestSubstring(input);
        // Output the result
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + result);
    }
}

// Example Output:
// The length of the longest substring without repeating characters in "abcabcbb" is: 3
// Explanation: The answer is "abc", with the length of 3.