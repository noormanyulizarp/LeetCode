public class SumEvenFibonacciNumbers {
    public static void main(String[] args) {
        int limit = 4000000; // Set the limit to 4 million
        int sum = sumEvenFibonacci(limit);
        System.out.println("Sum of even Fibonacci numbers up to " + limit + " is: " + sum);
    }

    // Method to calculate the sum of even Fibonacci numbers up to a given limit
    public static int sumEvenFibonacci(int limit) {
        int a = 0, b = 1; // Starting values of Fibonacci sequence
        int sum = 0;

        while (b <= limit) {
            if (b % 2 == 0) { // Check if the Fibonacci number is even
                sum += b; // Add to sum if it's even
            }
            int next = a + b; // Calculate the next Fibonacci number
            a = b; // Move to the next number in the sequence
            b = next; // Update b to the next Fibonacci number
        }

        return sum; // Return the total sum of even Fibonacci numbers
    }
}

/*
Example Output:
Sum of even Fibonacci numbers up to 4000000 is: 4613732
*/