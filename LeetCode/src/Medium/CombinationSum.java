public class CombinationSum {
    // This method finds all unique combinations of candidates that sum up to the target.
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println("Candidates: " + java.util.Arrays.toString(candidates));
        System.out.println("Target: " + target);
        System.out.println("Combinations: " + combinationSum(candidates, target));
    }

    // This method returns a list of all unique combinations that sum to the target.
    public static java.util.List<java.util.List<Integer>> combinationSum(int[] candidates, int target) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(result, new java.util.ArrayList<>(), candidates, target, 0);
        return result;
    }

    // This helper method uses backtracking to find all combinations.
    private static void backtrack(java.util.List<java.util.List<Integer>> result, java.util.List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; // Exceeded the target sum, no point in continuing
        if (remain == 0) {
            result.add(new java.util.ArrayList<>(tempList)); // Found a valid combination
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]); // Choose the candidate
                backtrack(result, tempList, candidates, remain - candidates[i], i); // Recurse with updated remaining target
                tempList.remove(tempList.size() - 1); // Backtrack, remove the last candidate
            }
        }
    }
} 

/*
Example Output:
Candidates: [2, 3, 6, 7]
Target: 7
Combinations: [[2, 2, 3], [7]]
*/ 

// Explanation:
// The combinationSum method finds all unique combinations of the given candidates that add up to the target.
// In this example, the candidates are [2, 3, 6, 7] and the target is 7.
// The valid combinations that sum to 7 are [2, 2, 3] and [7].