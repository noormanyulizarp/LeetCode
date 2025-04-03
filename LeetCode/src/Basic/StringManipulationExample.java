public class StringManipulationExample {
    public static void main(String[] args) {
        // Example of string reversal
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Example of checking for a palindrome
        String palindromeCandidate = "A man, a plan, a canal, Panama";
        boolean isPalindrome = isPalindrome(palindromeCandidate);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = reverseString(cleaned);
        return cleaned.equals(reversed);
    }
} 

/*
Example Output:
Original: Hello, World!
Reversed: !dlroW ,olleH
Is palindrome: true
*/