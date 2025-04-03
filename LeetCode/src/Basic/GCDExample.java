public class GCDExample {
    // Method to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int gcd(int a, int b) {
        // Ensure a is greater than b
        if (b == 0) {
            return a; // Base case: if b is 0, return a
        }
        return gcd(b, a % b); // Recursive call
    }

    public static void main(String[] args) {
        // Example inputs
        int num1 = 56;
        int num2 = 98;

        // Calculate GCD
        int result = gcd(num1, num2);

        // Output the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}

/*
Example Output:
The GCD of 56 and 98 is: 14
*/