// ClassExample.java
// This class demonstrates the basic structure of a Java class, including fields, methods, and a main method for execution.

public class ClassExample {
    // Fields (attributes) of the class
    private final String name;
    private final int age;

    // Constructor to initialize the fields
    public ClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the details of the object
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the example
    public static void main(String[] args) {
        // Creating an instance of ClassExample
        ClassExample example = new ClassExample("John Doe", 30);
        
        // Displaying the details of the created object
        example.displayDetails();
    }
}

// Example Output:
// Name: John Doe
// Age: 30