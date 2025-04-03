# Java Data Types

Java has two main categories of data types: **primitive types** and **reference types**.

## Primitive Data Types

Primitive data types are the most basic data types in Java. They are not objects and hold their values directly in memory. Java has eight primitive data types:

1. **byte**: 
   - Size: 8 bits
   - Range: -128 to 127
   - Example: `byte b = 100;`

2. **short**: 
   - Size: 16 bits
   - Range: -32,768 to 32,767
   - Example: `short s = 10000;`

3. **int**: 
   - Size: 32 bits
   - Range: -2^31 to 2^31-1
   - Example: `int i = 100000;`

4. **long**: 
   - Size: 64 bits
   - Range: -2^63 to 2^63-1
   - Example: `long l = 100000L;`

5. **float**: 
   - Size: 32 bits
   - Used for single-precision floating-point numbers.
   - Example: `float f = 10.5f;`

6. **double**: 
   - Size: 64 bits
   - Used for double-precision floating-point numbers.
   - Example: `double d = 10.5;`

7. **char**: 
   - Size: 16 bits
   - Represents a single 16-bit Unicode character.
   - Example: `char c = 'A';`

8. **boolean**: 
   - Size: Not precisely defined (depends on JVM)
   - Represents one of two values: `true` or `false`.
   - Example: `boolean isTrue = true;`

## Reference Data Types

Reference data types are used to refer to objects and are created using classes. They do not hold the actual data but rather a reference to the data. Common reference types include:

- **Strings**: A sequence of characters.
  - Example: `String str = "Hello, World!";`

- **Arrays**: A collection of similar types of data.
  - Example: `int[] numbers = {1, 2, 3, 4, 5};`

- **Classes and Interfaces**: User-defined data types.
  - Example: 
    ```java
    class Person {
        String name;
        int age;
    }
    ```

## Summary

Understanding data types is crucial in Java as they define the type of data a variable can hold, which in turn affects memory allocation and performance. Primitive types are simple and efficient, while reference types provide more complex data structures and functionalities.