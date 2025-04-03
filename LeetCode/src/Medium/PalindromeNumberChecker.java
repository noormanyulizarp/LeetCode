// PalindromeNumberChecker.java
// This class checks if a given integer is a palindrome.
// A palindrome is a number that remains the same when its digits are reversed.

public class PalindromeNumberChecker {
    
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        // Numbers that end with 0 are not palindromes unless the number is 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversed = 0;
        // Reverse the number until the original number is less than the reversed number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // Check if the number is equal to the reversed number
        // For odd digits, we can get rid of the middle digit by reversed / 10
        return x == reversed || x == reversed / 10;
    }

    // Main method to test the isPalindrome function
    public static void main(String[] args) {
        int number1 = 121;
        int number2 = -121;
        int number3 = 10;

        System.out.println(number1 + " is palindrome: " + isPalindrome(number1)); // true
        System.out.println(number2 + " is palindrome: " + isPalindrome(number2)); // false
        System.out.println(number3 + " is palindrome: " + isPalindrome(number3)); // false
    }
}