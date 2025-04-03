# Java Abstract Classes

In Java, an abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. It can contain abstract methods (methods without a body) as well as concrete methods (methods with a body). Abstract classes are used to provide a base for subclasses to build upon, allowing for a common interface while enabling specific implementations in derived classes.

## Characteristics of Abstract Classes

1. **Cannot be instantiated**: You cannot create an instance of an abstract class directly. Instead, you must create a subclass that implements the abstract methods.

2. **Can contain abstract methods**: An abstract class can have methods that are declared without an implementation. Subclasses must provide implementations for these methods.

3. **Can contain concrete methods**: Abstract classes can also have fully implemented methods that can be inherited by subclasses.

4. **Can have constructors**: Abstract classes can have constructors, which can be called when a subclass is instantiated.

5. **Can have fields**: Abstract classes can have member variables (fields) that can be inherited by subclasses.

## Example of an Abstract Class

```java
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inheriting from Animal)
class Dog extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Bark");
    }
}

// Subclass (inheriting from Animal)
class Cat extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Meow");
    }
}

// Main class to test the abstract class
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object
        Animal myCat = new Cat(); // Create a Cat object

        myDog.sound(); // Outputs: Bark
        myDog.sleep(); // Outputs: Sleeping...

        myCat.sound(); // Outputs: Meow
        myCat.sleep(); // Outputs: Sleeping...
    }
}
```

In this example, `Animal` is an abstract class with an abstract method `sound()` and a concrete method `sleep()`. The `Dog` and `Cat` classes extend `Animal` and provide their own implementations of the `sound()` method. The main class demonstrates how to create instances of the subclasses and call their methods.