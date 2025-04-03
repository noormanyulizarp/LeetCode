// HashMapExample.java
// This example demonstrates the usage of HashMap in Java.
// A HashMap is a part of the Java Collections Framework and is used to store key-value pairs.

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Grapes", 4);

        // Displaying the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value using its key
        int appleCount = map.get("Apple");
        System.out.println("Count of Apples: " + appleCount);

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is present in the map.");
        }

        // Removing a key-value pair
        map.remove("Grapes");
        System.out.println("HashMap after removing Grapes: " + map);

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

// Example Output:
// HashMap: {Apple=1, Banana=2, Orange=3, Grapes=4}
// Count of Apples: 1
// Banana is present in the map.
// HashMap after removing Grapes: {Apple=1, Banana=2, Orange=3}
// Iterating over HashMap:
// Apple: 1
// Banana: 2
// Orange: 3