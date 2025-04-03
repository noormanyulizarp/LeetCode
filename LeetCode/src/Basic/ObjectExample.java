// ObjectExample.java
// This class demonstrates the basic usage of objects in Java, including creating an object, accessing its properties, and calling its methods.

class Car {
    // Properties of the Car class
    String color;
    String model;
    int year;

    // Constructor to initialize the Car object
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota Camry", 2020);

        // Calling the method to display car details
        myCar.displayDetails();
    }
}

// Example Output:
// Car Model: Toyota Camry
// Car Color: Red
// Car Year: 2020