# Constructor Examples in Java

In Java, constructors are special methods used to initialize objects. They are called when an object of a class is created. Constructors have the same name as the class and do not have a return type.

## Types of Constructors

### 1. Default Constructor
A default constructor is a constructor that does not take any parameters. If no constructor is defined in a class, the Java compiler automatically provides a default constructor.

**Example:**
```java
class Dog {
    String name;

    // Default constructor
    Dog() {
        name = "Unknown";
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog's name: " + dog.name); // Output: Dog's name: Unknown
    }
}
```

### 2. Parameterized Constructor
A parameterized constructor is a constructor that takes parameters to initialize an object with specific values.

**Example:**
```java
class Dog {
    String name;

    // Parameterized constructor
    Dog(String dogName) {
        name = dogName;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println("Dog's name: " + dog.name); // Output: Dog's name: Buddy
    }
}
```

### 3. Copy Constructor
A copy constructor is used to create a new object as a copy of an existing object. Java does not provide a default copy constructor, but you can define one.

**Example:**
```java
class Dog {
    String name;

    // Parameterized constructor
    Dog(String dogName) {
        name = dogName;
    }

    // Copy constructor
    Dog(Dog dog) {
        name = dog.name;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max");
        Dog dog2 = new Dog(dog1); // Using copy constructor
        System.out.println("Dog1's name: " + dog1.name); // Output: Dog1's name: Max
        System.out.println("Dog2's name: " + dog2.name); // Output: Dog2's name: Max
    }
}
```

## Conclusion
Constructors are essential in Java for object initialization. Understanding the different types of constructors helps in creating flexible and reusable code.