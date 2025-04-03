# Java Multithreading

Multithreading in Java is a powerful feature that allows concurrent execution of two or more threads. A thread is a lightweight process, and multithreading enables the execution of multiple threads simultaneously, improving the performance of applications.

## Creating Threads

In Java, there are two primary ways to create a thread:

1. **Extending the Thread Class**: You can create a new class that extends the `Thread` class and override its `run()` method.

   ```java
   class MyThread extends Thread {
       public void run() {
           System.out.println("Thread is running");
       }
   }

   public class Main {
       public static void main(String[] args) {
           MyThread thread = new MyThread();
           thread.start(); // Start the thread
       }
   }
   ```

2. **Implementing the Runnable Interface**: You can also create a class that implements the `Runnable` interface and pass an instance of it to a `Thread` object.

   ```java
   class MyRunnable implements Runnable {
       public void run() {
           System.out.println("Thread is running");
       }
   }

   public class Main {
       public static void main(String[] args) {
           Thread thread = new Thread(new MyRunnable());
           thread.start(); // Start the thread
       }
   }
   ```

## Thread Lifecycle

A thread in Java can be in one of the following states:

- **New**: A thread that has been created but not yet started.
- **Runnable**: A thread that is ready to run and waiting for CPU time.
- **Blocked**: A thread that is blocked waiting for a monitor lock.
- **Waiting**: A thread that is waiting indefinitely for another thread to perform a particular action.
- **Timed Waiting**: A thread that is waiting for another thread to perform an action for a specified waiting time.
- **Terminated**: A thread that has completed its execution.

## Synchronization

When multiple threads access shared resources, it can lead to inconsistent data. To prevent this, Java provides synchronization mechanisms:

- **Synchronized Methods**: You can declare a method as synchronized to ensure that only one thread can execute it at a time.

   ```java
   public synchronized void synchronizedMethod() {
       // code
   }
   ```

- **Synchronized Blocks**: You can also synchronize a block of code within a method.

   ```java
   public void method() {
       synchronized(this) {
           // code
       }
   }
   ```

## Conclusion

Multithreading is an essential aspect of Java programming that allows for efficient use of resources and improved application performance. By understanding how to create and manage threads, as well as how to synchronize them, developers can build robust and responsive applications.