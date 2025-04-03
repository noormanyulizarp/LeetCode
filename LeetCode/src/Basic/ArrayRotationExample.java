// ArrayRotationExample.java
// This program demonstrates how to rotate an array to the left by a given number of positions.

public class ArrayRotationExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Original array
        int positions = 2; // Number of positions to rotate
        System.out.println("Original Array: ");
        printArray(array);
        
        rotateArray(array, positions);
        
        System.out.println("Array after rotating " + positions + " positions to the left: ");
        printArray(array);
    }

    // Method to rotate the array to the left by 'positions' places
    public static void rotateArray(int[] array, int positions) {
        int length = array.length;
        positions = positions % length; // Handle cases where positions > length
        reverseArray(array, 0, positions - 1); // Reverse the first part
        reverseArray(array, positions, length - 1); // Reverse the second part
        reverseArray(array, 0, length - 1); // Reverse the whole array
    }

    // Helper method to reverse a portion of the array
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Example Output:
// Original Array: 
// 1 2 3 4 5 
// Array after rotating 2 positions to the left: 
// 3 4 5 1 2 