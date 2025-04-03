// LongestWordInDictionary.java
// This program finds the longest word in a dictionary that can be formed by deleting some characters of a given string.
// The dictionary is represented as an array of strings.

import java.util.Arrays;
import java.util.HashSet;

public class LongestWordInDictionary {
    
    // Function to find the longest word in the dictionary
    public static String findLongestWord(String s, String[] dictionary) {
        // Sort the dictionary to ensure we check longer words first
        Arrays.sort(dictionary, (a, b) -> b.length() - a.length());
        
        for (String word : dictionary) {
            if (canFormWord(s, word)) {
                return word; // Return the first longest word that can be formed
            }
        }
        return ""; // Return empty string if no word can be formed
    }

    // Helper function to check if a word can be formed from the string
    private static boolean canFormWord(String s, String word) {
        int j = 0; // Pointer for the word
        for (int i = 0; i < s.length() && j < word.length(); i++) {
            if (s.charAt(i) == word.charAt(j)) {
                j++; // Move to the next character in the word
            }
        }
        return j == word.length(); // If we reached the end of the word, it can be formed
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        String s = "abpcplea";
        String[] dictionary = {"ale", "apple", "monkey", "plea"};
        
        String longestWord = findLongestWord(s, dictionary);
        System.out.println("The longest word that can be formed is: " + longestWord);
    }
}

// Example Output:
// The longest word that can be formed is: apple

// Explanation:
// In this example, the string "abpcplea" can form the word "apple" by deleting some characters. 
// The program checks each word in the dictionary and returns the longest one that can be formed.