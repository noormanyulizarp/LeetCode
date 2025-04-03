// ReverseArrayExample.java
// This program demonstrates how to reverse an array in Java.

public class ReverseArrayExample {
    public static void main(String[] args) {
        // Example array to be reversed
        int[] array = {1, 2, 3, 4, 5};

        // Display original array
        System.out.println("Original Array:");
        printArray(array);

        // Reverse the array
        reverseArray(array);

        // Display reversed array
        System.out.println("Reversed Array:");
        printArray(array);
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int left = 0; // Starting index
        int right = array.length - 1; // Ending index

        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line after printing the array
    }
} 

// Example Output:
// Original Array:
// 1 2 3 4 5 
// Reversed Array:
// 5 4 3 2 1 