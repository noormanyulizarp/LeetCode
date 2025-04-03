// ArrayPairSum.java
// This program finds all pairs in an array that sum up to a target value.

import java.util.HashMap;

public class ArrayPairSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        findPairs(nums, target);
    }

    public static void findPairs(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("Pair: (" + complement + ", " + num + ")");
            }
            map.put(num, 1);
        }
    }
}