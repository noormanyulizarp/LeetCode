// MergeSortedArrays.java
// This program merges two sorted arrays into a single sorted array.

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Example input arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // Merging the arrays
        int[] mergedArray = merge(array1, array2);

        // Output the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    // Method to merge two sorted arrays
    public static int[] merge(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them in sorted order
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                merged[k++] = array1[i++];
            } else {
                merged[k++] = array2[j++];
            }
        }

        // Copy remaining elements of array1, if any
        while (i < array1.length) {
            merged[k++] = array1[i++];
        }

        // Copy remaining elements of array2, if any
        while (j < array2.length) {
            merged[k++] = array2[j++];
        }

        return merged;
    }
}

// Example Output:
// Merged Array: [1, 2, 3, 4, 5, 6, 7, 8]