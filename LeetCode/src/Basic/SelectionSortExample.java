// SelectionSortExample.java
// This program demonstrates the selection sort algorithm in Java.
// Selection sort is a simple sorting algorithm that divides the input list into two parts: 
// a sorted part and an unsorted part. It repeatedly selects the smallest (or largest, depending on sorting order) 
// element from the unsorted part and moves it to the sorted part.

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11}; // Example array to be sorted
        System.out.println("Original array:");
        printArray(array); // Print the original array

        selectionSort(array); // Perform selection sort

        System.out.println("Sorted array:");
        printArray(array); // Print the sorted array
    }

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a new line at the end
    }
}