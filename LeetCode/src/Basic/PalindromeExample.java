// PalindromeExample.java
// This program checks if a given string is a palindrome.
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        String cleanedStr = str.replaceAll("[\\W]", "").toLowerCase();
        
        // Compare the cleaned string with its reverse
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        
        return cleanedStr.equals(reversedStr);
    }
}

// Example Output:
// Enter a string: A man a plan a canal Panama
// "A man a plan a canal Panama" is a palindrome.