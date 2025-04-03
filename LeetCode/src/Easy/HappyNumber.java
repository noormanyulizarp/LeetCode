public class HappyNumber {
    public static void main(String[] args) {
        int number = 19; // Example number to check if it's a happy number
        boolean isHappy = isHappyNumber(number);
        System.out.println("Is " + number + " a happy number? " + isHappy);
    }

    // Function to determine if a number is a happy number
    public static boolean isHappyNumber(int n) {
        int originalNumber = n;
        while (n != 1 && n != 4) { // 4 is the first number that leads to a cycle
            n = getSumOfSquares(n);
        }
        return n == 1; // If we reach 1, it's a happy number
    }

    // Helper function to calculate the sum of squares of digits
    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            sum += digit * digit; // Square the digit and add to sum
            n /= 10; // Remove the last digit
        }
        return sum;
    }
}

/*
Example Output:
Is 19 a happy number? true

Explanation:
A happy number is defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not include 1. 
For example, 19 is a happy number because:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/