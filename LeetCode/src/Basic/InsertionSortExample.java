// InsertionSortExample.java
// This program demonstrates the Insertion Sort algorithm.
// Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time.
// It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6}; // Sample array to be sorted
        System.out.println("Original array:");
        printArray(array);

        insertionSort(array); // Sorting the array using Insertion Sort

        System.out.println("Sorted array:");
        printArray(array); // Displaying the sorted array
    }

    // Method to perform Insertion Sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; // The element to be positioned
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key; // Place the key in its correct position
        }
    }

    // Method to print the elements of the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // New line for better readability
    }
}