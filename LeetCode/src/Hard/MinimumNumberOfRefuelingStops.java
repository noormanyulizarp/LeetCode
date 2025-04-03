// MinimumNumberOfRefuelingStops.java
// This program calculates the minimum number of refueling stops needed to reach a destination with a given amount of fuel and a list of gas stations.

import java.util.PriorityQueue;

public class MinimumNumberOfRefuelingStops {
    
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        // Priority queue to store the fuel available at stations we can reach
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int fuel = startFuel; // Current fuel
        int stops = 0; // Number of refueling stops
        int prevLocation = 0; // Previous location (starting point)

        for (int[] station : stations) {
            int location = station[0];
            int capacity = station[1];

            // While we cannot reach the next station
            while (fuel < location - prevLocation) {
                // If we have no more stations to refuel from, return -1
                if (maxHeap.isEmpty()) {
                    return -1;
                }
                // Refuel from the station with the most fuel
                fuel += maxHeap.poll();
                stops++;
            }
            // Add the current station's fuel to the maxHeap
            maxHeap.offer(capacity);
            // Update the fuel after reaching the station
            fuel -= (location - prevLocation);
            prevLocation = location; // Update the previous location
        }

        // After processing all stations, check if we can reach the target
        while (fuel < target - prevLocation) {
            if (maxHeap.isEmpty()) {
                return -1;
            }
            fuel += maxHeap.poll();
            stops++;
        }

        return stops; // Return the total number of stops made
    }

    public static void main(String[] args) {
        MinimumNumberOfRefuelingStops solution = new MinimumNumberOfRefuelingStops();
        
        // Example input
        int target = 1000;
        int startFuel = 100;
        int[][] stations = {{200, 100}, {400, 200}, {600, 300}, {800, 400}};
        
        // Calculate the minimum number of refueling stops
        int result = solution.minRefuelStops(target, startFuel, stations);
        
        // Output the result
        System.out.println("Minimum number of refueling stops: " + result);
    }
}