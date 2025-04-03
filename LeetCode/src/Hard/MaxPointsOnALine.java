public class MaxPointsOnALine {
    // This method calculates the maximum number of points that lie on the same straight line
    public int maxPoints(int[][] points) {
        if (points.length < 2) return points.length;

        int maxPoints = 0;

        for (int i = 0; i < points.length; i++) {
            // Map to store the slope counts
            Map<String, Integer> slopeCount = new HashMap<>();
            int samePoint = 1; // Count of points that are the same as points[i]

            for (int j = i + 1; j < points.length; j++) {
                // Check for duplicate points
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    samePoint++;
                    continue;
                }

                // Calculate the slope
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                int gcd = gcd(dx, dy); // Get the greatest common divisor to reduce the slope

                // Normalize the slope
                String slope = (dy / gcd) + "/" + (dx / gcd);
                slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
            }

            // Find the maximum points on the same line through points[i]
            int currentMax = samePoint; // Start with the count of the same point
            for (int count : slopeCount.values()) {
                currentMax = Math.max(currentMax, count + samePoint);
            }

            maxPoints = Math.max(maxPoints, currentMax);
        }

        return maxPoints;
    }

    // Helper method to calculate the greatest common divisor
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Example usage
    public static void main(String[] args) {
        MaxPointsOnALine solution = new MaxPointsOnALine();
        int[][] points = {{1, 1}, {2, 2}, {3, 3}, {4, 1}, {5, 2}, {6, 3}};
        int result = solution.maxPoints(points);
        System.out.println("Maximum points on a line: " + result); // Output: 4
    }
}