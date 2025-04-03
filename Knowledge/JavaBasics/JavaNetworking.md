# Java Networking

Java provides a rich set of classes and interfaces for networking, allowing developers to create network applications that can communicate over the internet or local networks. The core of Java networking is built around the concept of sockets, which provide a way for applications to send and receive data.

## Key Concepts

1. **Sockets**: A socket is an endpoint for communication between two machines. In Java, the `Socket` class is used for client-side sockets, while the `ServerSocket` class is used for server-side sockets.

2. **URL and URLConnection**: Java provides the `URL` class to represent a Uniform Resource Locator, which is a pointer to a resource on the internet. The `URLConnection` class allows you to interact with the resource pointed to by a URL.

3. **Datagrams**: For connectionless communication, Java provides the `DatagramSocket` and `DatagramPacket` classes. These are used for sending and receiving data packets over the network without establishing a connection.

4. **HTTP Communication**: Java includes built-in support for HTTP communication through the `HttpURLConnection` class, which allows you to send and receive data using the HTTP protocol.

## Example: Creating a Simple Client-Server Application

### Server Code

```java
import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is listening on port 12345");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                new ClientHandler(socket).start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {
            String message;
            while ((message = input.readLine()) != null) {
                System.out.println("Received: " + message);
                output.println("Echo: " + message);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
```

### Client Code

```java
import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            output.println("Hello Server!");
            String response = input.readLine();
            System.out.println("Server response: " + response);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
```

## Conclusion

Java's networking capabilities make it easy to develop applications that can communicate over the network. By using sockets, URLs, and datagrams, developers can create robust networked applications that can handle various communication protocols.