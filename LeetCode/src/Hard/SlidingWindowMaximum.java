// SlidingWindowMaximum.java
// This class provides a solution to the Sliding Window Maximum problem.
// Given an array of integers and a window size, it finds the maximum value in each sliding window.

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    
    // Function to find the maximum in each sliding window of size k
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0]; // Return an empty array if input is invalid
        }

        int n = nums.length;
        int[] result = new int[n - k + 1]; // Result array to store maximums
        Deque<Integer> deque = new LinkedList<>(); // Deque to store indices of useful elements

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements from the deque that are less than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.offerLast(i);

            // The first element of the deque is the maximum for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result; // Return the result array
    }

    // Main method to test the SlidingWindowMaximum functionality
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] maxValues = maxSlidingWindow(nums, k);

        // Output the results
        System.out.print("Maximum values in each sliding window: ");
        for (int max : maxValues) {
            System.out.print(max + " ");
        }
        // Expected output: 3 3 5 5 6 7
    }
}