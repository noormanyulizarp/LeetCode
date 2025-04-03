public class MergeSortExample {
    // This method sorts an array using the merge sort algorithm
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: if the array has less than 2 elements, it's already sorted
        }
        int mid = array.length / 2; // Find the middle index
        int[] left = new int[mid]; // Create left subarray
        int[] right = new int[array.length - mid]; // Create right subarray

        // Fill the left subarray
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        // Fill the right subarray
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        // Recursively sort both subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(array, left, right);
    }

    // This method merges two sorted subarrays into a single sorted array
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right arrays in sorted order
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements from right array, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Main method to test the merge sort implementation
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10}; // Example array to be sorted
        System.out.println("Original array:");
        printArray(array); // Print original array

        mergeSort(array); // Sort the array using merge sort

        System.out.println("Sorted array:");
        printArray(array); // Print sorted array
    }

    // Helper method to print the elements of an array
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a new line after the array
    }
}