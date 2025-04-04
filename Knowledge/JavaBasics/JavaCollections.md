# Java Collections

Java Collections Framework provides a set of classes and interfaces to store and manipulate groups of objects. It includes data structures like **ArrayList**, **LinkedList**, **HashSet**, **HashMap**, and more.

---

## Arrays in Java

### What is an Array?
An array is a fixed-size data structure that stores elements of the same type.

### Example: Array of Integers
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

### Can Arrays Store Different Types?
No, arrays in Java are type-specific. You cannot store elements of different types (e.g., `int` and `String`) in the same array. However, you can use an array of type `Object` to store different types of data.

Example:
```java
Object[] mixedArray = new Object[3];
mixedArray[0] = 1; // Integer
mixedArray[1] = "satu"; // String
mixedArray[2] = 3.14; // Double

for (Object obj : mixedArray) {
    System.out.println(obj);
}
```

---

## Array of Objects

You can create an array to store objects of a class:
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectArrayExample {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);

        for (Person person : people) {
            System.out.println(person.name + " is " + person.age + " years old.");
        }
    }
}
```

---

## LinkedList in Java

### What is a LinkedList?
A `LinkedList` is a dynamic data structure that allows elements to be added or removed easily. It can store elements of different types if the generic type is `Object`.

### Example: LinkedList with Mixed Types
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1); // Add an integer
        list.add("satu"); // Add a string
        list.add(3.14); // Add a double
        System.out.println(list); // Output: [1, satu, 3.14]
    }
}
```

---

## Summary

- Arrays are fixed-size and type-specific, but you can use `Object[]` for mixed types.
- Collections like `ArrayList` and `LinkedList` can store mixed types if the generic type is `Object`.
- Arrays and collections can also store objects of custom classes, enabling more complex data structures.
- Use the appropriate data structure based on your requirements for flexibility, performance, and type safety.