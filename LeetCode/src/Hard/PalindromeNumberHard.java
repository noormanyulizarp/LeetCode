public class PalindromeNumberHard {
    public static void main(String[] args) {
        // Test cases
        int number1 = 12321;
        int number2 = 12345;

        System.out.println("Is " + number1 + " a palindrome? " + isPalindrome(number1)); // Expected: true
        System.out.println("Is " + number2 + " a palindrome? " + isPalindrome(number2)); // Expected: false
    }

    /**
     * This method checks if a given integer is a palindrome.
     * A palindrome is a number that remains the same when its digits are reversed.
     *
     * @param x the integer to check
     * @return true if x is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        // Numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10; // Build the reversed number
            x /= 10; // Remove the last digit from x
        }

        // Check if the original number is equal to the reversed number
        // For odd-length numbers, we can ignore the middle digit by reversed / 10
        return x == reversed || x == reversed / 10;
    }
}