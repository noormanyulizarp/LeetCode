// PermutationsGenerator.java
import java.util.ArrayList;
import java.util.List;

public class PermutationsGenerator {
    
    // Method to generate all permutations of a given array of integers
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    // Helper method to perform backtracking
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue; // Skip if the number is already in the current permutation
                tempList.add(nums[i]);
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1); // Remove the last element for backtracking
            }
        }
    }

    // Main method to test the permutations generator
    public static void main(String[] args) {
        PermutationsGenerator generator = new PermutationsGenerator();
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = generator.permute(nums);
        
        // Print the generated permutations
        System.out.println("Generated permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}

// Example Output:
// Generated permutations:
// [1, 2, 3]
// [1, 3, 2]
// [2, 1, 3]
// [2, 3, 1]
// [3, 2, 1]
// [3, 1, 2]