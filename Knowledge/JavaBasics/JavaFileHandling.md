# Java File Handling

Java provides a rich set of classes and methods for handling files and performing input/output operations. The primary package used for file handling in Java is `java.io`, which includes classes for reading from and writing to files.

## Reading from Files

To read data from a file, you can use classes like `FileReader`, `BufferedReader`, and `Scanner`. Here’s a simple example using `BufferedReader`:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Specify the file path
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions
        }
    }
}
```

## Writing to Files

To write data to a file, you can use classes like `FileWriter` and `BufferedWriter`. Here’s an example of writing to a file:

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Specify the file path
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Hello, World!"); // Write to the file
            bw.newLine(); // Add a new line
            bw.write("This is a file handling example."); // Write another line
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions
        }
    }
}
```

## File Handling Best Practices

1. **Always Close Resources**: Use try-with-resources to ensure that files are closed automatically.
2. **Handle Exceptions**: Always handle `IOException` to manage errors that may occur during file operations.
3. **Use Buffered Streams**: For better performance, use buffered streams like `BufferedReader` and `BufferedWriter` when reading from or writing to files.

By following these practices, you can effectively manage file operations in Java, ensuring that your applications handle data efficiently and safely.