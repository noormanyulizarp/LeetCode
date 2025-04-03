// SubarraySumFinder.java
// This program finds the number of subarrays that sum up to a target value.

public class SubarraySumFinder {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int target = 2;
        System.out.println("Number of subarrays: " + subarraySum(nums, target));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}