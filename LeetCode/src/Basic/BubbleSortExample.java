// BubbleSortExample.java
// This class demonstrates the Bubble Sort algorithm in Java.
// Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
// compares adjacent elements and swaps them if they are in the wrong order.
// The pass through the list is repeated until the list is sorted.

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Sample array to be sorted
        System.out.println("Original array:");
        printArray(array); // Print the original array

        bubbleSort(array); // Call the bubble sort method

        System.out.println("Sorted array:");
        printArray(array); // Print the sorted array
    }

    // Method to perform bubble sort
    static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n - 1; i++) { // Loop through each element
            for (int j = 0; j < n - i - 1; j++) { // Last i elements are already sorted
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    static void printArray(int[] arr) {
        for (int value : arr) { // Enhanced for loop to iterate through the array
            System.out.print(value + " "); // Print each element
        }
        System.out.println(); // Print a new line for better readability
    }
}