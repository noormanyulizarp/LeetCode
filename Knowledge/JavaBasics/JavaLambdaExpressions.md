# Java Lambda Expressions

Lambda expressions are a feature introduced in Java 8 that allow you to express instances of single-method interfaces (functional interfaces) in a more concise and readable way. They provide a clear and concise way to represent one method interface using an expression.

## Syntax

The basic syntax of a lambda expression is as follows:

```
(parameters) -> expression
```

or

```
(parameters) -> { statements; }
```

### Example

Here’s a simple example of a lambda expression that takes two integers and returns their sum:

```java
// Using a lambda expression to define a functional interface
@FunctionalInterface
interface Add {
    int sum(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression to implement the sum method
        Add addition = (a, b) -> a + b;

        // Calling the method
        int result = addition.sum(5, 10);
        System.out.println("Sum: " + result); // Output: Sum: 15
    }
}
```

## Use Cases

Lambda expressions are commonly used in the following scenarios:

1. **Collections Framework**: They are often used with the Java Collections Framework, especially with methods like `forEach`, `map`, and `filter`.

   ```java
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   names.forEach(name -> System.out.println(name));
   ```

2. **Event Handling**: In GUI applications, lambda expressions can simplify event handling code.

3. **Stream API**: They are extensively used in the Stream API for processing sequences of elements.

   ```java
   List<String> filteredNames = names.stream()
                                      .filter(name -> name.startsWith("A"))
                                      .collect(Collectors.toList());
   ```

## Benefits

- **Conciseness**: Reduces boilerplate code, making it easier to read and maintain.
- **Improved Readability**: Makes it clear that the code is focused on the behavior rather than the implementation.
- **Functional Programming**: Encourages a functional programming style, which can lead to more predictable and less error-prone code.

In summary, lambda expressions are a powerful feature in Java that enhance the language's expressiveness and enable developers to write cleaner and more efficient code.