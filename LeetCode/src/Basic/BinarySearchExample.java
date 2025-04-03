// BinarySearchExample.java
// This class demonstrates the binary search algorithm in Java.
// Binary search is an efficient algorithm for finding an item from a sorted list of items.
// It works by repeatedly dividing the search interval in half.

public class BinarySearchExample {
    
    // Method to perform binary search on a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid index

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid; // Target found
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    // Main method to test the binary search implementation
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sorted array
        int target = 7; // Target value to search for

        // Perform binary search
        int result = binarySearch(sortedArray, target);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

// Example output when the target is 7:
// Element found at index: 6