public class FrogJump {
    // Function to determine if the frog can reach the last stone
    public boolean canCross(int[] stones) {
        // A map to store the reachable positions
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }
        // The frog starts at the first stone with a jump of 0
        map.get(stones[0]).add(0);

        // Iterate through each stone
        for (int stone : stones) {
            // Get all possible jumps from the current stone
            for (int jump : map.get(stone)) {
                // Check for jumps of size jump-1, jump, and jump+1
                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                    if (nextJump > 0 && map.containsKey(stone + nextJump)) {
                        map.get(stone + nextJump).add(nextJump);
                    }
                }
            }
        }
        // Check if the last stone can be reached
        return !map.get(stones[stones.length - 1]).isEmpty();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        FrogJump frogJump = new FrogJump();
        int[] stones = {0, 1, 3, 5, 6, 8}; // Example input
        boolean result = frogJump.canCross(stones);
        System.out.println("Can the frog cross? " + result); // Expected output: true
    }
}