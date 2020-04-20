import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",4990);
        OutputStreamWriter output = new OutputStreamWriter(socket.getOutputStream());
        output.write("Hello");
        output.flush();

    }
}
