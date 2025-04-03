// KthLargestElement.java
// This program finds the k-th largest element in an array.
// It uses a min-heap to efficiently keep track of the k largest elements.

import java.util.PriorityQueue;

public class KthLargestElement {
    // Method to find the k-th largest element in an array
    public static int findKthLargest(int[] nums, int k) {
        // Create a min-heap with a capacity of k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        // Iterate through the array
        for (int num : nums) {
            // Add the current number to the min-heap
            minHeap.offer(num);
            // If the size of the heap exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // The root of the min-heap is the k-th largest element
        return minHeap.peek();
    }

    // Main method to test the findKthLargest function
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        // Expected output: 5
        System.out.println("The " + k + "-th largest element is: " + findKthLargest(nums, k));
        
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        k = 4;
        // Expected output: 4
        System.out.println("The " + k + "-th largest element is: " + findKthLargest(nums2, k));
    }
}