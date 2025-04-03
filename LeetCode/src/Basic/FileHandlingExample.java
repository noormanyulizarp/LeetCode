// FileHandlingExample.java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "example.txt";

        // Write to the file
        writeToFile(filePath, "Hello, this is a file handling example in Java!");

        // Read from the file
        String content = readFromFile(filePath);
        System.out.println("Content of the file: " + content);
    }

    // Method to write to a file
    public static void writeToFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read from a file
    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        return content.toString().trim(); // Return the content without trailing newline
    }
}