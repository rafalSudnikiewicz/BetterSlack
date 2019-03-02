import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.IOException;
import java.util.Scanner;

public class SimpleClient {

    private Socket socket;
    private PrintWriter output;
    private BufferedReader input;
    private Scanner scan;

    public void connectToServer(String ipAddress, int port) throws IOException {
        socket = new Socket(ipAddress, port);
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        output = new PrintWriter(socket.getOutputStream(), true);

        scan = new Scanner(System.in);

        while (true) {
            String text=scan.nextLine();
            output.println(text);
            if(text.toLowerCase().equals("quit")) break;
        }
//        System.out.println(input.readLine());
    }

    public void disconnect() throws IOException {
        socket.close();
    }
}
