# Java Generics

Java Generics is a powerful feature that allows developers to write flexible and reusable code while providing type safety. Generics enable the creation of classes, interfaces, and methods that operate on typed parameters, allowing for the definition of a single method or class that can work with different data types.

## Benefits of Generics

1. **Type Safety**: Generics provide compile-time type checking, which helps to catch errors early in the development process. This reduces the risk of `ClassCastException` at runtime.

2. **Code Reusability**: With generics, you can create a single class or method that can work with different types, reducing code duplication and improving maintainability.

3. **Elimination of Casts**: When using generics, explicit casting is not required when retrieving elements from a collection, making the code cleaner and easier to read.

## Generic Classes

A generic class is defined with a type parameter. Here’s an example of a simple generic class:

```java
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
```

In this example, `Box` is a generic class that can hold any type of object. The type parameter `T` is specified when creating an instance of `Box`.

### Example Usage of Generic Class

```java
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println(stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println(integerBox.getItem());
    }
}
```

## Generic Methods

You can also define generic methods within a class. Here’s an example:

```java
public class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
```

### Example Usage of Generic Method

```java
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C"};

        GenericMethodExample.printArray(intArray);
        GenericMethodExample.printArray(stringArray);
    }
}
```

## Bounded Type Parameters

Generics also allow you to restrict the types that can be used as type parameters. This is done using bounded type parameters. For example:

```java
public class NumberBox<T extends Number> {
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}
```

In this case, `T` can only be a subclass of `Number`, which includes `Integer`, `Double`, etc.

## Conclusion

Java Generics enhance the Java programming language by providing a way to create classes, interfaces, and methods that can operate on various types while ensuring type safety. This feature promotes code reusability and cleaner code, making it an essential part of modern Java development.