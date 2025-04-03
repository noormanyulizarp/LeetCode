# Java OOP Concepts

Java is an object-oriented programming (OOP) language that is based on several core concepts. Understanding these concepts is essential for effective Java programming. The main OOP concepts in Java are:

## 1. Encapsulation
Encapsulation is the mechanism of wrapping the data (variables) and the code (methods) together as a single unit. It restricts direct access to some of the object's components, which can prevent the accidental modification of data. In Java, encapsulation is achieved using access modifiers (private, protected, public).

### Example:
```java
public class Person {
    private String name; // private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}
```

## 2. Inheritance
Inheritance is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class. The class that inherits is called the subclass (or derived class), and the class from which it inherits is called the superclass (or base class). This promotes code reusability.

### Example:
```java
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
```

## 3. Polymorphism
Polymorphism allows methods to do different things based on the object it is acting upon. It can be achieved through method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).

### Example of Method Overloading:
```java
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

### Example of Method Overriding:
```java
public class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}
```

## 4. Abstraction
Abstraction is the concept of hiding the complex implementation details and showing only the essential features of the object. In Java, abstraction can be achieved using abstract classes and interfaces.

### Example of an Abstract Class:
```java
abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
```

### Example of an Interface:
```java
interface Drawable {
    void draw(); // interface method
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
```

These core concepts of OOP in Java help in building robust, maintainable, and scalable applications. Understanding and applying these principles is crucial for any Java developer.