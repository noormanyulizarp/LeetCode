public class CombinationSumII {
    // This method finds all unique combinations in candidates where the candidate numbers sum to the target.
    // Each number in candidates may only be used once in the combination.
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates to handle duplicates
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    // Backtracking method to find combinations
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; // Exceeded the target sum, no point in continuing
        if (remain == 0) {
            result.add(new ArrayList<>(tempList)); // Found a valid combination
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue; // Skip duplicates
                tempList.add(candidates[i]); // Choose the current number
                backtrack(result, tempList, candidates, remain - candidates[i], i + 1); // Recurse
                tempList.remove(tempList.size() - 1); // Backtrack
            }
        }
    }

    // Main method to run the example
    public static void main(String[] args) {
        CombinationSumII solution = new CombinationSumII();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> combinations = solution.combinationSum2(candidates, target);
        
        // Print the result
        System.out.println("Unique combinations that sum to " + target + ": " + combinations);
    }
} 

/*
Example Output:
Unique combinations that sum to 8: [[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
*/