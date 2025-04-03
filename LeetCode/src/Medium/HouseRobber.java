public class HouseRobber {
    /**
     * This method calculates the maximum amount of money that can be robbed
     * from a series of houses without robbing two adjacent houses.
     *
     * @param nums an array of integers representing the amount of money at each house
     * @return the maximum amount of money that can be robbed
     */
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev1 = 0; // Maximum amount robbed up to the previous house
        int prev2 = 0; // Maximum amount robbed up to the house before the previous house

        for (int num : nums) {
            int temp = prev1; // Store the previous maximum
            prev1 = Math.max(prev2 + num, prev1); // Max of robbing this house or not
            prev2 = temp; // Update prev2 to the previous maximum
        }

        return prev1; // The last computed maximum is the result
    }

    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();
        
        // Example input
        int[] houses = {2, 7, 9, 3, 1};
        
        // Calculate the maximum amount that can be robbed
        int maxRobbed = robber.rob(houses);
        
        // Output the result
        System.out.println("Maximum amount that can be robbed: " + maxRobbed);
    }
}

/*
Example Output:
Maximum amount that can be robbed: 12
*/