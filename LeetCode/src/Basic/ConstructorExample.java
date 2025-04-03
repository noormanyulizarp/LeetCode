// ConstructorExample.java
// This class demonstrates the use of constructors in Java.
// A constructor is a special method that is called when an object is instantiated.
// It can be used to initialize the object's properties.

public class ConstructorExample {
    // Properties of the class
    private String name;
    private int age;

    // Default constructor
    public ConstructorExample() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the information of the object
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the example
    public static void main(String[] args) {
        // Creating an object using the default constructor
        ConstructorExample person1 = new ConstructorExample();
        person1.displayInfo(); // Output: Name: Unknown, Age: 0

        // Creating an object using the parameterized constructor
        ConstructorExample person2 = new ConstructorExample("Alice", 25);
        person2.displayInfo(); // Output: Name: Alice, Age: 25
    }
}