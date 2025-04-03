// ArrayListExample.java
// This program demonstrates the use of ArrayList in Java.
// It shows how to create an ArrayList, add elements, remove elements, and iterate through the list.

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Display the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate through the ArrayList
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get the size of the ArrayList
        System.out.println("Total number of fruits: " + fruits.size());
    }
}

// Example output:
// Fruits in the list: [Apple, Banana, Cherry, Date]
// After removing Banana: [Apple, Cherry, Date]
// Iterating through the list:
// Apple
// Cherry
// Date
// Total number of fruits: 3