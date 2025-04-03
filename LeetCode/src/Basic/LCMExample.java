public class LCMExample {
    // Method to calculate the Least Common Multiple (LCM) of two numbers
    public static int calculateLCM(int a, int b) {
        // Calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
        int gcd = calculateGCD(a, b);
        // LCM is calculated using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        return (a * b) / gcd;
    }

    // Helper method to calculate the GCD of two numbers
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Example usage of the LCM calculation
        int num1 = 12;
        int num2 = 18;

        // Calculate LCM of num1 and num2
        int lcm = calculateLCM(num1, num2);

        // Output the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
} 

// Example output when running the program:
// The LCM of 12 and 18 is: 36