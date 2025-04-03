// ArraySortingExample.java
// This program demonstrates various sorting algorithms in Java.
// It includes examples of Bubble Sort, Selection Sort, and Insertion Sort.

import java.util.Arrays;

public class ArraySortingExample {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Bubble Sort
        int[] bubbleSortedArray = bubbleSort(array.clone());
        System.out.println("Bubble Sorted Array: " + Arrays.toString(bubbleSortedArray));

        // Selection Sort
        int[] selectionSortedArray = selectionSort(array.clone());
        System.out.println("Selection Sorted Array: " + Arrays.toString(selectionSortedArray));

        // Insertion Sort
        int[] insertionSortedArray = insertionSort(array.clone());
        System.out.println("Insertion Sorted Array: " + Arrays.toString(insertionSortedArray));
    }

    // Bubble Sort Algorithm
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Selection Sort Algorithm
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap arr[minIndex] and arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Insertion Sort Algorithm
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}