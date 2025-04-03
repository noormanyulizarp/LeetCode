public class MajorityElement {
    // This method finds the majority element in an array.
    // A majority element is an element that appears more than n/2 times in the array.
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Verify if the candidate is indeed the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1; // Return -1 if no majority element exists
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3}; // Example input
        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement); // Expected output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2}; // Another example input
        majorityElement = findMajorityElement(nums2);
        System.out.println("The majority element is: " + majorityElement); // Expected output: 2
    }
}