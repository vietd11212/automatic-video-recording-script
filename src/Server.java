import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4990);
        //Listens for a connection to be made to this socket and accepts it
        Socket socket = serverSocket.accept();
        System.out.println("connected");
    }
}
