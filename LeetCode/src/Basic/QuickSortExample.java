// QuickSortExample.java
// This class demonstrates the QuickSort algorithm, which is an efficient sorting algorithm that uses a divide-and-conquer approach.
// The algorithm works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays,
// according to whether they are less than or greater than the pivot.

import java.util.Arrays;

public class QuickSortExample {

    // Main method to run the QuickSort example
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5}; // Sample array to be sorted
        System.out.println("Original array: " + Arrays.toString(array));
        
        quickSort(array, 0, array.length - 1); // Call the quickSort method
        
        System.out.println("Sorted array: " + Arrays.toString(array)); // Output the sorted array
    }

    // Method to perform QuickSort on the array
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choosing the last element as pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++; // increment index of smaller element
                swap(array, i, j); // swap array[i] and array[j]
            }
        }
        swap(array, i + 1, high); // swap the pivot element with the element at i + 1
        return i + 1; // return the partitioning index
    }

    // Method to swap two elements in the array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}