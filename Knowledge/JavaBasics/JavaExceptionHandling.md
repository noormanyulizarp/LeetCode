# Java Exception Handling

Java provides a robust mechanism for handling exceptions, which are events that disrupt the normal flow of a program's execution. Exception handling in Java is primarily done using the `try`, `catch`, and `finally` blocks.

## Try-Catch Blocks

The `try` block contains code that might throw an exception. If an exception occurs, the control is transferred to the `catch` block, where the exception can be handled. Here’s a simple example:

```java
try {
    int result = 10 / 0; // This will throw an ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e.getMessage());
}
```

In this example, attempting to divide by zero throws an `ArithmeticException`, which is caught and handled in the `catch` block.

## Finally Clause

The `finally` block is optional and is used to execute code after the `try` and `catch` blocks, regardless of whether an exception was thrown or caught. It is typically used for cleanup activities, such as closing files or releasing resources.

```java
try {
    // Code that may throw an exception
} catch (Exception e) {
    // Handle exception
} finally {
    // Cleanup code, executed regardless of exception
    System.out.println("This will always execute.");
}
```

## Custom Exceptions

Java also allows developers to create custom exceptions by extending the `Exception` class. This is useful for defining application-specific error conditions.

```java
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception.");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

In this example, `MyCustomException` is a user-defined exception that can be thrown and caught like standard exceptions.

## Conclusion

Exception handling is a crucial aspect of Java programming that helps maintain the normal flow of application execution even when unexpected events occur. By using `try`, `catch`, and `finally` blocks, along with the ability to create custom exceptions, developers can write more robust and error-resistant code.