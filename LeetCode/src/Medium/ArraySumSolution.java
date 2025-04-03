// ArraySumSolution.java
// This class provides a solution to the problem of finding the sum of elements in an array.
// It includes a method to calculate the sum and a main method to demonstrate its usage.

public class ArraySumSolution {
    
    // Method to calculate the sum of an array
    public static int arraySum(int[] arr) {
        int sum = 0; // Initialize sum to 0
        for (int num : arr) { // Iterate through each element in the array
            sum += num; // Add the current element to the sum
        }
        return sum; // Return the total sum
    }

    // Main method to demonstrate the arraySum method
    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5}; // Example array
        int result = arraySum(exampleArray); // Calculate the sum
        System.out.println("The sum of the array is: " + result); // Output the result
    }
}

// Example output when running the main method:
// The sum of the array is: 15