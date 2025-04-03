# Control Structures in Java

Control structures are essential components in Java that dictate the flow of execution of a program. They allow developers to control the order in which statements are executed based on certain conditions. The primary types of control structures in Java include conditional statements, loops, and branching statements.

## 1. Conditional Statements

Conditional statements enable the execution of specific blocks of code based on whether a condition evaluates to true or false. The most common conditional statements in Java are:

### a. `if` Statement

The `if` statement executes a block of code if the specified condition is true.

```java
int number = 10;
if (number > 0) {
    System.out.println("The number is positive.");
}
```

### b. `if-else` Statement

The `if-else` statement provides an alternative block of code that executes if the condition is false.

```java
int number = -5;
if (number > 0) {
    System.out.println("The number is positive.");
} else {
    System.out.println("The number is not positive.");
}
```

### c. `else if` Ladder

The `else if` ladder allows checking multiple conditions sequentially.

```java
int number = 0;
if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
}
```

### d. `switch` Statement

The `switch` statement is used to execute one block of code among many based on the value of a variable.

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

## 2. Loops

Loops are control structures that repeat a block of code multiple times until a specified condition is met. The main types of loops in Java are:

### a. `for` Loop

The `for` loop is used when the number of iterations is known.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

### b. `while` Loop

The `while` loop continues to execute as long as the specified condition is true.

```java
int i = 0;
while (i < 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

### c. `do-while` Loop

The `do-while` loop executes the block of code at least once before checking the condition.

```java
int i = 0;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i < 5);
```

## 3. Branching Statements

Branching statements alter the flow of control in a program. The most common branching statements are:

### a. `break`

The `break` statement is used to exit a loop or switch statement prematurely.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i is 5
    }
    System.out.println(i);
}
```

### b. `continue`

The `continue` statement skips the current iteration of a loop and proceeds to the next iteration.

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // Skip even numbers
    }
    System.out.println(i);
}
```

## Conclusion

Control structures are fundamental to programming in Java, allowing developers to implement logic and control the flow of execution. Understanding how to use conditional statements, loops, and branching statements effectively is crucial for writing efficient and functional Java programs.