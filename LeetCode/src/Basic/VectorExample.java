// VectorExample.java
// This program demonstrates the use of Vector in Java.

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector to hold String elements
        Vector<String> cities = new Vector<>();

        // Adding elements to the Vector
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");

        // Display the Vector
        System.out.println("Cities in the vector: " + cities);

        // Remove an element from the Vector
        cities.remove("London");
        System.out.println("After removing London: " + cities);

        // Iterate through the Vector
        System.out.println("Iterating through the vector:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Get the size of the Vector
        System.out.println("Total number of cities: " + cities.size());
    }
}

// Example output:
// Cities in the vector: [New York, London, Tokyo, Paris]
// After removing London: [New York, Tokyo, Paris]
// Iterating through the vector:
// New York
// Tokyo
// Paris
// Total number of cities: 3