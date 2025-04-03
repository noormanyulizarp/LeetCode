// MaxSumOfRectangleNoLargerThanK.java
// This program finds the maximum sum of a rectangle in a 2D matrix such that the sum is less than or equal to a given value K.
// It uses a combination of dynamic programming and a data structure to efficiently calculate the maximum sum.

import java.util.TreeSet;

public class MaxSumOfRectangleNoLargerThanK {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1},
            {0, -2, 3},
            {2, -1, 4}
        };
        int K = 2;
        int result = maxSumSubmatrix(matrix, K);
        System.out.println("Maximum sum of rectangle no larger than K: " + result); // Output: 2
    }

    public static int maxSumSubmatrix(int[][] matrix, int K) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int maxSum = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int left = 0; left < cols; left++) {
            int[] sums = new int[rows];
            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    sums[i] += matrix[i][right];
                }
                maxSum = Math.max(maxSum, getMaxSumNoLargerThanK(sums, K));
            }
        }
        return maxSum;
    }

    private static int getMaxSumNoLargerThanK(int[] sums, int K) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int sum : sums) {
            currSum += sum;
            Integer target = set.ceiling(currSum - K);
            if (target != null) {
                maxSum = Math.max(maxSum, currSum - target);
            }
            set.add(currSum);
        }
        return maxSum;
    }
}